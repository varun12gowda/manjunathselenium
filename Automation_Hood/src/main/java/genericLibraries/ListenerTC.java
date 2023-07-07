package genericLibraries;

import static org.testng.Assert.assertEquals;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(genericLibraries.ListenerIplementation.class)
public class ListenerTC extends BaseClass   {
	
	@Test
	public void demoListener() {
		System.out.println("Ths is testcase1");
		
	}
	@Test
	public void demoListener1() {
		System.out.println("Ths is testcase2");
		driver.get(utility.readingDataFromPropertFile("url"));
		assertEquals(false, true);
		throw new SkipException("this is skipped") ;
		
	}
}
