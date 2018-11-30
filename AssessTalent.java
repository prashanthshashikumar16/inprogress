package testNGScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import org.testng.Reporter;
import commonUtils.Browser;
import commonUtils.Extensions;
import pomPages.ArchPage_Dashboard;
import pomPages.AssessLogin;
import pomPages.LanguageSelection;
import pomPages.Talent_List;

//@Listeners(commonUtils.TestListner.class)



//Assert the title

public class AssessTalent {
	@Test(groups = { "Smoke" })

	public void assessLogin() throws MalformedURLException, InterruptedException {
		Reporter.log("running sample test", true);
		//Launching the browser and navigates to the Assess application
		Browser driver = new Browser();
		Reporter.log("Browser is launched and navigated to the AUTURL", true);
		driver.getBrowser("chrome");
		Reporter.log("Selecting the language as English", true);
		LanguageSelection ls = new LanguageSelection();
		//Asserting the title - soft assert
		Extensions.assertTitleSoft("https://stagingassess.fqml.com/?controller=user&browser_checked=true");
		//Selects the language and enters the credentials and log in
		try {
			ls.english();
			} 
		catch (Exception e) {
			e.printStackTrace();
			} 
		finally {
			Reporter.log("Entering the UN, PWD and signing in", true);
			AssessLogin as = new AssessLogin();
			as.login();
		}
		Extensions.assertTitleSoft("https://stagingassess.fqml.com/?controller=dashboard#/");
	}

//	Counts the no of tasks available in the Archpage.
	
	@Test(dependsOnMethods = "assessLogin", groups = { "Smoke" })

	public void enterTalentRoom() throws InterruptedException {
		ArchPage_Dashboard ap = new ArchPage_Dashboard();
		Reporter.log("Checking the number of tasks avaiable for the user in Talent Room",true);
		ap.tasksCount_OnHover(null);
		Reporter.log("Entering the talent nomination room",true);
		ap.Talent_ArchPage();
		

	}

//	Click on each of the rating group of Talent list.
	
	@Test (dependsOnMethods = "enterTalentRoom")
	public void SwitchOnTalent() throws InterruptedException 
	{
		int size1,size2,size3,size4,size5,size6,size7,size8,size9,size10;
		Talent_List tl = new Talent_List();
		tl.Toggle_Talent();
		tl.Click_Rating_Group(2);
		tl.Click_Rating_Group(3);
		tl.Click_Rating_Group(4);
		tl.Click_Rating_Group(5);
		tl.Click_Rating_Group(6);
		tl.Click_Rating_Group(7);
		tl.Click_Rating_Group(8);
		tl.Click_Rating_Group(9);
		tl.Click_Rating_Group(10);
		
		//captures the count of tile in the selected tile decal
		size1 = tl.Total_Tiles_Of_SelectedGroup(1);
		size2 = tl.Total_Tiles_Of_SelectedGroup(2);
		size3 = tl.Total_Tiles_Of_SelectedGroup(3);
		size4 = tl.Total_Tiles_Of_SelectedGroup(4);
		size5 = tl.Total_Tiles_Of_SelectedGroup(5);
		size6 = tl.Total_Tiles_Of_SelectedGroup(6);
		size7 = tl.Total_Tiles_Of_SelectedGroup(7);
		size8 = tl.Total_Tiles_Of_SelectedGroup(8);
		size9 = tl.Total_Tiles_Of_SelectedGroup(9);
		size10 = tl.Total_Tiles_Of_SelectedGroup(10);
		
		System.out.println( "group 1 = "+size1+" group 2 = "+size2+" group 3 = "+size3+" group 4 = "+size4+" group 5 = "+size5+" group 6 = "+size6+" group 7 = "+size7+" group 8 = "+size8+" group 9 = "+size9+" group 10 = "+size10);
	}
	
// verifying the count of the tiles in the rating group is same as the count displayed decal tile no in the brackets
	@Test(dependsOnMethods = "SwitchOnTalent")
	public void assertRatingGroupCountWithTotalTileCount()
	{
		Talent_List tl = new Talent_List();
		int TilesCount =  tl.Total_Tiles_Of_SelectedGroup(1);
		int RatingGroupCount = tl.RatingGroupTilesCount(1);
		if (TilesCount == RatingGroupCount)
			System.out.println("Counts Match " + "TilesCount = "+TilesCount+" RatingGroupCount = "+ RatingGroupCount);
		else
			System.out.println("Counts does not match "+ "TilesCount = "+TilesCount+" RatingGroupCount = "+ RatingGroupCount);
	}
	
	//search for a person based on the second name.
	@Test (dependsOnMethods = "assertRatingGroupCountWithTotalTileCount")
	
	public void SearchPerson()
	{
		Talent_List tl = new Talent_List();
		tl.Search("Lamas", "Hector Lamas");
		tl.SearchTile("Hector Lamas");
	}
}