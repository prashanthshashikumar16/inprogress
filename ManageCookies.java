package commonUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Cookie;

public class ManageCookies

{ // Add Cookie

	public static void windowManage() { // create file named Cookies to store Login Information
		File file = new File("Cookies.data");
		WebDriver driver = Browser.driver;
		try {// Delete old file if exists

			file.delete();

			file.createNewFile();

			FileWriter fileWrite = new FileWriter(file);

			BufferedWriter Bwrite = new BufferedWriter(fileWrite);

			// loop for getting the cookie information

			for (Cookie ck : driver.manage().getCookies())

			{

				Bwrite.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";"
						+ ck.getExpiry() + ";" + ck.isSecure()));

				Bwrite.newLine();

			}

			Bwrite.flush();

			Bwrite.close();

			fileWrite.close();

		} catch (Exception ex)

		{

			ex.printStackTrace();

		}

		Browser.driver.manage().addCookie(null);

	}

	/*
	 * driver.manage().getCookies(); // Return The List of all Cookies
	 * 
	 * driver.manage().getCookieNamed(arg0); //Return specific cookie according to
	 * name
	 * 
	 * driver.manage().addCookie(arg0); //Create and add the cookie
	 * 
	 * 
	 * 
	 * driver.manage().deleteCookie(arg0); // Delete specific cookie
	 * 
	 * 
	 * 
	 * driver.manage().deleteCookieNamed(arg0); // Delete specific cookie according
	 * Name
	 * 
	 * 
	 * 
	 * driver.manage().deleteAllCookies(); // Delete all cookies
	 * 
	 */

	// Edit/Manage Cookie

	// Delete Cookie

}