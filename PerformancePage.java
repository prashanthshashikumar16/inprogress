package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import commonUtils.Browser;
 

public class PerformancePage

{
	@FindBy(xpath = "//span[@class = 'ng-binding ng-scope']") private WebElement noOfTasks;
	@FindBy(xpath = "(//a[@href='?controller=dashboard#/'])/img") private WebElement archPage_Link;
	@FindBy(xpath = "(//li)[1]") private WebElement loggedIn_UserLink;

	
	public PerformancePage()
    {
       PageFactory.initElements((WebDriver) Browser.driver, this);
    }
}