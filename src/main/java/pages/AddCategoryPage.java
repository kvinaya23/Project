package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import util.BrowserFactory;

public class AddCategoryPage extends BrowserFactory {
	
	WebDriver driver;
	String AddNewItem = "New Category List";
	
	public AddCategoryPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	@FindBy(how = How.XPATH ,using ="//input[@type='text' and @ name='data")WebElement ADD_ELEMENT;
	@FindBy(how = How.XPATH , using ="//input[@type='submit' and @value='Add")WebElement ADD_BUTTON_ELEMENT;
	@FindBy(how =How.XPATH ,using ="//*[contains(text(),'Tech01')])")WebElement VALIDATE_ADDED_CATEGORY;
	@FindBy(how =How.XPATH ,using ="//select [@name='due_month']")WebElement VALIDATE_MONTH_NAMES;
	@FindBy(xpath = "//*[contains(text(),'The category you want to add already exists:')]")WebElement DUPLICATE_CATAGORY_MESSAGE;
	
	
	public void insert_add_category(String AddNewItem) {
		
		ADD_ELEMENT.sendKeys(AddNewItem);
	}
	
	public void clickon_add_Button () {
		
		ADD_BUTTON_ELEMENT.click();
	}
	public void validateAddedCategory() {
		
		Assert.assertTrue("category you want to add already exists",VALIDATE_ADDED_CATEGORY.isSelected());
		//assert.assertEquals(AddNewItem, VALIDATE_ADDED_CATEGORY, "category you want to add already exists");
		
	}
   
	public void validateDueMonth(WebElement element) {
		
		String before_xpath = "//*[@id='extra']/select[3]/option[";
		String after_xpath = "]";
		for (int i = 2; i <= 12; i++) {
			String month = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			System.out.println(month);

	}
       
	
	}}
