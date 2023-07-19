package OpenInApp;

import org.testng.annotations.Test;

public class Timestampcheck {
	@Test
	public static void timestampTime() {
	    long currentTimeMillis = System.currentTimeMillis();
	    String milliseconds = String.format("%03d", currentTimeMillis % 1000);
	    System.out.println(milliseconds);
	}

}
