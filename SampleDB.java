package testNGScripts;

import java.net.MalformedURLException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import commonUtils.Browser;

public class SampleDB {
	
	@Test
	public void DB() throws MalformedURLException, InterruptedException
	{
		Browser driver = new Browser();
		Reporter.log("Browser is launched and navigated to the AUTURL", true);
		driver.getBrowser("chrome");
		pomPages.DB db = new pomPages.DB();
		db.NavToDB();
		String String;
		db.executeStatement( "Select*from `user`;");
	}

}
