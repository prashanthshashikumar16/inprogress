package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import commonUtils.Browser;


public class LanguageSelection
{
	@FindBy(xpath="//a[@href='?controller=user&language=en']") private WebElement English;
    @FindBy(xpath="//a[@href='?controller=user&language=fr']") private WebElement French;
    @FindBy(xpath="//a[@href='?controller=user&language=tr']") private WebElement Turkey;
    @FindBy(xpath="//a[@href='?controller=user&language=es']") private WebElement Espanol;
    @FindBy(xpath="//a[@href='?controller=user&language=fi']") private WebElement Suomi;
    @FindBy(xpath="//a[@href='?controller=user&language=pe']") private WebElement Peru;
    @FindBy(xpath="//a[@href='?controller=user&language=pn']") private WebElement Panama;
 
    public LanguageSelection()
    {
    	PageFactory.initElements((WebDriver) Browser.driver, this);
    }             

    public void english()
    {
    	English.click();
    }
    
    public void french()
    {
    	French.click();
    }

}