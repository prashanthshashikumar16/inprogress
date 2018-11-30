package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import commonUtils.Browser;


public class Performance_Philip
{
	@FindBy(xpath = ("/html/body/header/div[2]/div/div/div/ul/li[1]/a")) private WebElement Talent;
	public Performance_Philip()
	
	{
		PageFactory.initElements((WebDriver) Browser.driver, this);
	}
//Enters Talent page
	public void talent()
	{
        Talent.click();
    }

}