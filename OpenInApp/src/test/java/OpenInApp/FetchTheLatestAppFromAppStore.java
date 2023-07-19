package OpenInApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.testng.annotations.Test;

public class FetchTheLatestAppFromAppStore {
	private static final String PACKAGE_NAME = "com.instagram.android"; // Replace with your app's package name
	
	@Test
	public void LatestApp() {
		
		
		String latestVersion = fetchLatestAppVersionFromStore();
        if (latestVersion != null) {
            String installedVersion = getInstalledAppVersion();
            if (installedVersion != null) {
                System.out.println("Installed App Version: " + installedVersion);
                System.out.println("Latest App Version: " + latestVersion);

                if (!installedVersion.equals(latestVersion)) {
                    boolean uninstallSuccess = uninstallApp();
                    if (uninstallSuccess) {
                        System.out.println("Uninstalled the older version of the app");

                        boolean installSuccess = installApp(latestVersion);
                        if (installSuccess) {
                            System.out.println("Installed the latest version of the app");
                        } else {
                            System.out.println("Failed to install the latest version of the app");
                        }
                    } else {
                        System.out.println("Failed to uninstall the older version of the app");
                    }
                } else {
                    System.out.println("The latest version of the app is already installed");
                }
            } else {
                System.out.println("No previous version of the app is installed");
            }
        } else {
            System.out.println("Failed to fetch the latest app version from the store");
        }
    }

    private static String fetchLatestAppVersionFromStore() {
        try {
            // Connect to the store API and retrieve the latest version of the app
            // Replace the URL and implementation with your specific store API

            // Example: Fetching the version from a text file hosted on a server
            URL versionUrl = new URL("https://play.google.com/store/apps/details?id=com.instagram.android");
            BufferedReader reader = new BufferedReader(new InputStreamReader(versionUrl.openStream()));
            String latestVersion = reader.readLine();
            reader.close();
            return latestVersion;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String getInstalledAppVersion() {
        try {
            Process process = Runtime.getRuntime().exec("adb shell dumpsys package " + PACKAGE_NAME);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("versionName=")) {
                    return line.split("=")[1];
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static boolean uninstallApp() {
        try {
            Process process = Runtime.getRuntime().exec("adb uninstall " + PACKAGE_NAME);
            int result = process.waitFor();
            return result == 0;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static boolean installApp(String version) {
        try {
            // Fetch the latest app APK file and save it locally
            URL apkUrl = new URL("https://instagram.en.uptodown.com/android/versions" + version + "/app.apk");
            Path tempFilePath = Files.createTempFile("app", ".apk");
            Files.copy(apkUrl.openStream(), tempFilePath, StandardCopyOption.REPLACE_EXISTING);

            Process process = Runtime.getRuntime().exec("adb install " + tempFilePath.toAbsolutePath());
            int result = process.waitFor();
            return result == 0;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    

}
}

