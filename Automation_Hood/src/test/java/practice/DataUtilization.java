
package practice;

import org.testng.annotations.Test;

public class DataUtilization {
	@Test(dataProvider="un name",dataProviderClass=dataPRovide.class)
	public void demo(String s) {
		System.out.println(s);
	}
}
