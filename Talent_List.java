package pomPages;

//import java.awt.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonUtils.Browser;
import commonUtils.Extensions;

public class Talent_List {

	@FindBy(xpath = "//*[@id='TratingGrp']") private WebElement Rating_Group;
	@FindBy(xpath = "//*[@id = 'recViewd']") private WebElement Recently_Viewed;
	@FindBy(xpath = ".//*[@class='chk-txt-left ng-binding']") private WebElement Talent_Toggle;
	@FindBy(xpath = ".//*[@id='firstGroup']") private WebElement Top_Group;
	@FindBy(xpath = "(.//*[@class=\"rating-label\"])[2]") private WebElement Second_Group;
	@FindBy(xpath = "(.//*[@class=\"rating-label\"])[3]") private WebElement Third_Group;
	@FindBy(xpath = "(.//*[@class=\"rating-label\"])[4]") private WebElement Fourth_Group;
	@FindBy(xpath = "(.//*[@class=\"rating-label\"])[5]") private WebElement Fifth_Group;
	@FindBy(xpath = "(.//*[@class=\"rating-label\"])[6]") private WebElement Sixth_Group;
	@FindBy(xpath = "(.//*[@class=\"rating-label\"])[7]") private WebElement Seventh_Group;
	@FindBy(xpath = "(.//*[@class=\"rating-label\"])[8]") private WebElement Eighth_Group;
	@FindBy(xpath = "(.//*[@class=\"rating-label\"])[9]") private WebElement Ninth_Group;
	@FindBy(xpath = "(.//*[@class=\"rating-label\"])[10]") private WebElement Tenth_Group;
	@FindBy(xpath = ".//*[@class='group-wrapper'][1]") private WebElement Top_Group_ClicktoLoad;
	@FindBy(xpath = ".//*[@class='group-wrapper'][1]/div/div") private List<WebElement> TopGroup_TotalTiles;
	@FindBy(xpath = ".//*[@class='group-wrapper'][2]") private WebElement Second_Group_ClicktoLoad;
	@FindBy(xpath = ".//*[@class='group-wrapper'][2]/div/div") private List<WebElement> Second_Group_TotalTiles;
	@FindBy(xpath = ".//*[@class='group-wrapper'][3]") private WebElement Third_Group_ClicktoLoad;
	@FindBy(xpath = ".//*[@class='group-wrapper'][3]/div/div") private List<WebElement> Third_Group_TotalTiles;
	@FindBy(xpath = ".//*[@class='group-wrapper'][4]") private WebElement Fourth_Group_ClicktoLoad;
	@FindBy(xpath = ".//*[@class='group-wrapper'][4]/div/div") private List<WebElement> Fourth_Group_TotalTiles;
	@FindBy(xpath = ".//*[@class='group-wrapper'][5]") private WebElement Fifth_Group_ClicktoLoad;
	@FindBy(xpath = ".//*[@class='group-wrapper'][5]/div/div") private List<WebElement> Fifth_Group_TotalTiles;
	@FindBy(xpath = ".//*[@class='group-wrapper'][6]") private WebElement Sixth_Group_ClicktoLoad;
	@FindBy(xpath = ".//*[@class='group-wrapper'][6]/div/div") 	private List<WebElement> Sixth_Group_TotalTiles;
	@FindBy(xpath = ".//*[@class='group-wrapper'][7]")	private WebElement Seventh_Group_ClicktoLoad;
	@FindBy(xpath = ".//*[@class='group-wrapper'][7]/div/div")	private List<WebElement> Seventh_Group_TotalTiles;
	@FindBy(xpath = ".//*[@class='group-wrapper'][8]")	private WebElement Eighth_Group_ClicktoLoad;
	@FindBy(xpath = ".//*[@class='group-wrapper'][8]/div/div")	private List<WebElement> Eighth_Group_TotalTiles;
	@FindBy(xpath = ".//*[@class='group-wrapper'][9]")	private WebElement Ninth_Group_ClicktoLoad;
	@FindBy(xpath = ".//*[@class='group-wrapper'][9]/div/div")	private List<WebElement> Ninth_Group_TotalTiles;
	@FindBy(xpath = ".//*[@class='group-wrapper'][10]")	private WebElement Tenth_Group_ClicktoLoad;
	@FindBy(xpath = ".//*[@class='group-wrapper'][10]/div/div")	private List<WebElement> Tenth_Group_TotalTiles;
	@FindBy(xpath = ".//*[@class='search-form ng-pristine ng-valid']") private WebElement Search;
	@FindBy(xpath = ".//*[@id='firstGroup']/div[1]/div/span") private WebElement TopGroupTilesCount;
	@FindBy(xpath =".//*[@id='cardWrapper']/div[2]/div[2]/div/div[2]/div[1]/div/span") private WebElement SecondGroupTilesCount;
	@FindBy(xpath =".//*[@id='cardWrapper']/div[2]/div[2]/div/div[3]/div[1]/div/span") private WebElement ThirdGroupTilesCount;
	@FindBy(xpath =".//*[@id='cardWrapper']/div[2]/div[2]/div/div[4]/div[1]/div/span") private WebElement FourthGroupTilesCount;
	@FindBy(xpath =".//*[@id='cardWrapper']/div[2]/div[2]/div/div[5]/div[1]/div/span") private WebElement FifthGroupTilesCount;
	@FindBy(xpath =".//*[@id='cardWrapper']/div[2]/div[2]/div/div[6]/div[1]/div/span") private WebElement SixthGroupTilesCount;
	@FindBy(xpath =".//*[@id='cardWrapper']/div[2]/div[2]/div/div[7]/div[1]/div/span") private WebElement SeventhGroupTilesCount;
	@FindBy(xpath =".//*[@id='cardWrapper']/div[2]/div[2]/div/div[8]/div[1]/div/span") private WebElement EighthGroupTilesCount;
	@FindBy(xpath =".//*[@id='cardWrapper']/div[2]/div[2]/div/div[9]/div[1]/div/span") private WebElement NinethGroupTilesCount;
	@FindBy(xpath =".//*[@id='cardWrapper']/div[2]/div[2]/div/div[10]/div[1]/div/span") private WebElement TenthGroupTilesCount;
	@FindBy(xpath = ".//*[@class='search-submit']") private WebElement SearchSubmit;
	@FindBy(xpath = ".//*[@id='mCSB_3_container']/ul/li") private List <WebElement> SearchResult;
	@FindBy(xpath = ".//*[@id='tCard39717']/div[1]/div[2]") private WebElement id;
	
	public Talent_List() {
		PageFactory.initElements((WebDriver) Browser.driver, this);
	}
//Click on the Decal tile no
	public void Click_Rating_Group(int groupno) {
		
		switch(groupno) {
			
			default:System.out.println("Not a valid no");
			case 1: Top_Group.click();
				     break;
			case 2: Second_Group.click();
			        break;
			case 3: Third_Group.click();
					break;
			case 4: Fourth_Group.click();
				break;
			case 5: Fifth_Group.click();
				break;
			case 6: Sixth_Group.click();
				break;
			case 7: Seventh_Group.click();
				break;
			case 8: Eighth_Group.click();
				break;
			case 9: Ninth_Group.click();
				break;
			case 10: Tenth_Group.click();
				break;
		}
	}
//Go to Recently viewed tab
	public void Recently_Viewed() {
		Recently_Viewed.click();
	}
//Click on the first group
	public void Top_Group() {
		Top_Group.click();
	}
//Returns the total number of tiles count in the given group
	public int Total_Tiles_Of_SelectedGroup(int groupno) 
	{
		int size;
		
		switch(groupno) {
		
		default:System.out.println("Not a valid no");
				return 0;
		case 1: size = TopGroup_TotalTiles.size();
		  		return size;	
		case 2: size = Second_Group_TotalTiles.size();
				return size;
		case 3: size = Third_Group_TotalTiles.size();
				return size;
		case 4: size = Fourth_Group_TotalTiles.size();
				return size;
		case 5: size = Fifth_Group_TotalTiles.size();
				return size;
		case 6: size = Sixth_Group_TotalTiles.size();
				return size;
		case 7: size = Seventh_Group_TotalTiles.size();
				return size;
		case 8: size = Eighth_Group_TotalTiles.size();
				return size;
		case 9:size = Ninth_Group_TotalTiles.size();
				return size;
		case 10: size = Tenth_Group_TotalTiles.size();
				return size;
		}
	}
		/*
		if (groupno == 1)
		{ size = TopGroup_TotalTiles.size();
		  return size;
		}
		else if (groupno == 2)
		{	size = Second_Group_TotalTiles.size();
			return size;
		}
		else if (groupno == 3)
			{
			size = Third_Group_TotalTiles.size();
			return size;
			}
		else if (groupno == 4)
		{
		size = Fourth_Group_TotalTiles.size();
		return size;
		}
		else if (groupno == 5)
		{
		size = Fifth_Group_TotalTiles.size();
		return size;
		}
		else if (groupno == 6)
		{
		size = Sixth_Group_TotalTiles.size();
		return size;
		}
		else if (groupno == 7)
		{
		size = Seventh_Group_TotalTiles.size();
		return size;
		}
		else if (groupno == 8)
		{
		size = Eighth_Group_TotalTiles.size();
		return size;
		}
		else if (groupno == 9)
		{
		size = Ninth_Group_TotalTiles.size();
		return size;
		}
		else if (groupno == 10)
		{
		size = Tenth_Group_TotalTiles.size();
		return size;
		}
		else
			System.out.println("Not a valid no");
		return 0;
	}

	*/
//Toggle the talent swtich
	public void Toggle_Talent() throws InterruptedException {
		Extensions.explicitWaitTillWebElementVisible(Talent_Toggle);
		Thread.sleep(5000);
		Talent_Toggle.click();
	}
	
	//Returns the count of the tiles in each decal tile no
	public int RatingGroupTilesCount(int tileNo)
	{
		int count= 0;
		
		switch (tileNo) {
			
		default: System.out.println("No such group/tile no");
		
			case 1: 	String str = (TopGroupTilesCount.getText());
				String substr = (String) str.subSequence(1, 4);
				count = Integer.parseInt((substr));
				return count;
			
			case 2: String str2 = (SecondGroupTilesCount.getText());
				String substr2 = (String) str2.subSequence(1, 4);
				count = Integer.parseInt((substr2));
				return count;
			case 3: String str3 = (ThirdGroupTilesCount.getText());
				String substr3 = (String) str3.subSequence(1, 4);
				count = Integer.parseInt((substr3));
				return count;
			case 4: String str4 = (FourthGroupTilesCount.getText());
				String substr4 = (String) str4.subSequence(1, 4);
				count = Integer.parseInt((substr4));
				return count;
			case 5: String str5 = (FifthGroupTilesCount.getText());
				String substr5 = (String) str5.subSequence(1, 4);
				count = Integer.parseInt((substr5));
				return count;
			case 6: String str6 = (SixthGroupTilesCount.getText());
				String substr6 = (String) str6.subSequence(1, 4);
				count = Integer.parseInt((substr6));
				return count;
			case 7: String str7 = (SeventhGroupTilesCount.getText());
				String substr7 = (String) str7.subSequence(1, 4);
				count = Integer.parseInt((substr7));
				return count;
			case 8: String str8 = (EighthGroupTilesCount.getText());
				String substr8 = (String) str8.subSequence(1, 4);
				count = Integer.parseInt((substr8));
				return count;
			case 9: String str9 = (NinethGroupTilesCount.getText());
				String substr9 = (String) str9.subSequence(1, 4);
				count = Integer.parseInt((substr9));
				return count;
			case 10: String str10 = (TenthGroupTilesCount.getText());
				String substr10 = (String) str10.subSequence(1, 4);
				count = Integer.parseInt((substr10));
				return count;
		
		}
		
		/*if (tileNo==1)
			{	String str = (TopGroupTilesCount.getText());
				String substr = (String) str.subSequence(1, 4);
				count = Integer.parseInt((substr));
				return count;
			}
		else if (tileNo==2)
			{
				count = Integer.parseInt(SecondGroupTilesCount.getText());
				return count;
			}
		else if (tileNo==3)
			{
				count = Integer.parseInt(ThirdGroupTilesCount.getText());
				return count;
			}
		else if (tileNo==4)
			{
				count = Integer.parseInt(FourthGroupTilesCount.getText());
				return count;
			}
		else if (tileNo==5)
			{	count = Integer.parseInt(FifthGroupTilesCount.getText());
				return count;
			}
		else if (tileNo==6)
			{
				count = Integer.parseInt(SixthGroupTilesCount.getText());
				return count;
			}
		else if (tileNo==7)
			{
				count = Integer.parseInt(SeventhGroupTilesCount.getText());
				return count;
			}
		else if (tileNo==8)
			{
				count = Integer.parseInt(EighthGroupTilesCount.getText());
				return count;
			}
		else if (tileNo==9)
			{
				count = Integer.parseInt(NinethGroupTilesCount.getText());
				return count;
			}
		else if (tileNo==10)
			{
				count = Integer.parseInt(TenthGroupTilesCount.getText());
				return count;
			}
		return count;*/
	}
	
	//Search for the person whos' name is passed into the search function
	@SuppressWarnings("unused")
	public void  Search(String LastName, String CompleteName)
	{
		Extensions.explicitWaitTillWebElementVisible(Search);
		Search.click();
		Extensions.sendKeysToWebElement(Search, LastName);
		Extensions.explicitWaitTillWebElementVisible(SearchSubmit);
		SearchSubmit.click();
		for(WebElement i :SearchResult)
		{ 
			String str = ((WebElement) i).getText();
			String[] name = str.split("\n");
			String nameObtained = Extensions.toString(name);
			if(CompleteName.equals(nameObtained))
			{
				i.click();
			}
			else
				System.out.println("Name not found");
		}
		
	}
	//Search for the person whos' name is passed in the tiles
	public void SearchTile(String CompleteName)
	{
		for (int j=0; j<=10;j++)
		{
			String path = ".//*[@class='cards-wrapper']/div["+j+"]/div/div/div[2]/div[1]";
			List<WebElement> wb =  (List<WebElement>) Browser.driver.findElements(By.xpath(path));
			for (WebElement k: wb)
			{
				String ename = ((WebElement) k).getText();//getAttribute("innerHTML");
				String[] name = ename.split("\n");
				String nameObtained = Extensions.toString(name);
				if(nameObtained.equals(CompleteName))
				{
					k.click();
				}
				else
					System.out.println("Name not found");
			}
		}
	}
	
}
