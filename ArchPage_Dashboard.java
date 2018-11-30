package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import commonUtils.Browser;
import commonUtils.Extensions;


public class ArchPage_Dashboard
{
	@FindBy(xpath="//a[@href='#task-performance']") private WebElement  performance_arch;
    @FindBy(xpath = "//span[@class = 'ng-binding ng-scope']") private WebElement noOfTasks;
    @FindBy(xpath = ".//*[@href='?controller=dashboard#/talent']") private WebElement TalentLink;
      
    public ArchPage_Dashboard()
    {
    	PageFactory.initElements((WebDriver) Browser.driver, this);
    }
//Enters the performance arch
    public void enter_performanceroom()
    {
    	performance_arch.click();
    }

    //Gets the count of tasks available on a particular arch, currently we are passing performance arch
    public int tasksCount_OnHover(WebElement performance_arch ) throws InterruptedException
    {
    	Extensions.explicitWaitTillWebElementVisible(performance_arch);                                
     	Extensions.ScrollToBottomOfThePage();
     	Extensions.Wait(5000);
     	Extensions.mouseHover(performance_arch);
        String tasks = noOfTasks.getAttribute("innerHTML");
        String[] text = tasks.split(" ");
        int tasksCount = Integer.parseInt(text[2]);
        Reporter.log("Tasks count = "+tasksCount , true);
        return tasksCount;
    }
    //Click on Talent link on Dashboard
    public void  Talent_ArchPage() throws InterruptedException
    {
    	Extensions.explicitWaitTillWebElementVisible(TalentLink);
    	TalentLink.click();
    }

}