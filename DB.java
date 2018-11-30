package pomPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonUtils.Browser;
import commonUtils.Constants;
import commonUtils.Extensions;

public class DB {

	@FindBy(xpath= ".//*[@id='input_username']") private WebElement DBAdminId;
	@FindBy(xpath= ".//*[@id='input_password']") private WebElement DBAdminPwd;
	@FindBy(xpath= ".//*[@id='input_go']") private WebElement Submit;
	@FindBy(xpath = ".//*[@id='topmenu']/li[1]") private WebElement Databases;
	@FindBy(xpath = ".//*[@id='tabledatabases']/tbody/tr[2]/td[2]/a") private WebElement QADB;
	@FindBy(xpath= ".//*[@id='topmenu']/li[2]/a") private WebElement Sql;
	@FindBy (xpath = ".//*[@id='sqlquerycontainerfull']/div[1]/div[6]/div[1]/div/div/div/div[5]/div/pre") private WebElement QuerySection;
	@FindBy (xpath = ".//*[@id='button_submit_query']") private WebElement SubmitQuery;
	@FindBy (xpath = ".//*[@class='table_results ajax pma_table']/tbody/tr") private List<WebElement> resultRows;
	@FindBy (xpath = ".//*[@class='table_results ajax pma_table']/tbody/tr[1]/td") private List<WebElement> resultCols;
	
	public DB()
	    {
	    	PageFactory.initElements((WebDriver) Browser.driver, this);
	    }    
	  
	  public void NavToDB() throws InterruptedException
	  {
		  //Passing the URL and Initial Auth credentials
		  Browser.driver.get("https://genisys:EcIcjafpym5@stagingassess.fqml.com/dbadmin/");
		  //App Synchronization
		  Extensions.explicitWaitTillWebElementVisible(Submit);
		  
		  DBAdminId.click();
		  DBAdminId.sendKeys(Constants.DBAdminId);
		 // Extensions.sendKeys(Constants.DBAdminId);
		  DBAdminPwd.click();
		  DBAdminPwd.sendKeys(Constants.DBAdminPwd);
		 // Extensions.sendKeys(Constants.DBAdminPwd);
		  Submit.click();
		  //App Sync
		  Extensions.Wait(10000);
		  //Click on DB
		  Databases.click();
		  //App Sync
		  Extensions.Wait(15000);
		 //Select QADB
		  QADB.click();
		 
	 }
	  //Selects the Query section and sends the query and executes
	  public void executeStatement(String Query) throws InterruptedException
	  {
		  Extensions.Wait(10000);
		  Sql.click();
		  Extensions.Wait(5000);
		  Extensions.sendKeysToWebElement(QuerySection, Query);
		  SubmitQuery.click();
	  }
	  //Fetch the results from the executed query - Incomplete
	  public void fetchResults()
	  {
		  int rows = resultRows.size();
		  int cols = resultCols.size();
		  for (int i = 1; i<=rows; i++)
		  {
			  for (int j = 5; j<=cols;j++)
			  {
				  String path = ".//*[@class='table_results ajax pma_table']/tbody/tr["+i+"]/td";
				  WebElement wb = Browser.driver.findElement(By.xpath(path));
				  String data = wb.getText();
				  
				 				  
			  }
		  }
	  }
}
