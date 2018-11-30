package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import commonUtils.Browser;

public class Talent 
{
	@FindBy (xpath = ("")) private WebElement talentLink;

	public Talent()
    {
       PageFactory.initElements((WebDriver) Browser.driver, this);
    }
}