package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataPRovide {
	@DataProvider(name="un name")
	public Object[] demo() {
		Object[]  s= {"demo","sample","manual","sql"};
		return s;
	}
	@Test(dataProvider="un name")
	public void testMethod(String s) {
		System.out.println(s);
	}

}
