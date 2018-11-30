package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import commonUtils.Browser;
import commonUtils.Constants;
import commonUtils.Extensions;


public class AssessLogin
{
	@FindBy(xpath= "//input[@id='global_id']") private WebElement GID;
    @FindBy(xpath= "//input[@id='pass']") private WebElement Password;
    @FindBy(xpath= ".//*[@class='form-control btn btn-primary']") private WebElement SignIN;

    
    public AssessLogin()
    {
    	PageFactory.initElements((WebDriver) Browser.driver, this);
    }             

    public void login()
    {
    	GID.click();
        GID.clear();
        GID.sendKeys(Constants.userName);
        Extensions.explicitWaitTillWebElementVisible(Password);
        Password.click();
        Password.clear();
        Password.sendKeys(Constants.pwd);
        Extensions.explicitWaitTillWebElementVisible(SignIN);
        SignIN.click();
     }
}