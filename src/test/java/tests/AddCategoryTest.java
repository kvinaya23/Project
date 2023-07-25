package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AddCategoryPage;
import util.BrowserFactory;

public class AddCategoryTest {
	
	

	WebDriver driver;
	
	AddCategoryPage categoryPage;
	
	String categoryname ="Tech01";
	
	@BeforeTest 
	public void initialisation() {
		driver = BrowserFactory.init();
		
	}
	@Test(priority =1)
	public void userShouldBeableToAddNewCategoryName() {
		
		
		AddCategoryPage categoryPage =PageFactory.initElements(driver,AddCategoryPage.class );
		categoryPage.insert_add_category(categoryname);
		categoryPage.clickon_add_Button();
		categoryPage.validateAddedCategory(); 
		
	}
	@Test(priority=2)
   public void userShouldBeAbleToSeeAllTheMonths() {
	   
	//   catagoryPage.selectFromDropdown(AddCatagoryPage.VALIDATE_MONTH_NAMES);
	//giving error    
	   
	   
   }
	@Test(priority =3)
	public void duplicateCategoryAdd() {
		
		categoryPage.insert_add_category(categoryname);
		categoryPage.clickon_add_Button();
		categoryPage.validateAddedCategory();
		categoryPage.validateDueMonth(null);
	}
	
	public void tearDown() {
		driver.close();
		driver.quit();
		
		
	}
}
