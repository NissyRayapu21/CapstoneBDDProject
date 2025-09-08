package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
	
	private WebDriver driver;
	
	By quitlink = By.xpath("//h2[normalize-space()='QUIT TOBACCO']");
	By quittitle = By.xpath("//h1[normalize-space()='Quit Tobacco']");
	By booksearch = By.xpath("//input[@type='search']");
	By searchbar = By.xpath("//input[@type='submit']");
	By booklink = By.xpath("(//span[contains(text(),'Books')])[1]");
	By bookpage = By.xpath("//h1[normalize-space()='Books']");
	By dis = By.xpath("//a[@aria-label='dismiss cookie message']");
	By aboutlink = By.xpath("(//div[@class='icon'])[7]");
	By aboutpage = By.xpath("//h1[normalize-space()='Board of Directors']");
	
	//constructor
		public HomePage(WebDriver driver) {
			this.driver = driver;

}
		//Actions
		   public void clickQuitLink() {
		        driver.findElement(quitlink).click();
		    }

		    public boolean QuitPageTitle() {
		        return driver.findElement(quittitle).isDisplayed();
		    }

		    public void clickBookSearch() {
		        driver.findElement(booksearch).sendKeys("Books");
		    }

		    public void SearchButton() {
		    	driver.findElement(searchbar).click();
		        
		    }

		    public void clickBookLink() {
		        driver.findElement(booklink).click();
		    }

		    public boolean isBookPageDisplayed() {
		        try {
		            return driver.findElement(bookpage).isDisplayed();
		        } catch (Exception e) {
		            return false;
		        }
		    }

		    public void clickAboutLink() {
		    	driver.findElement(dis).click();
		        driver.findElement(aboutlink).click();
		    }

		    public boolean isAboutPageDisplayed() {
		        try {
		            return driver.findElement(aboutpage).isDisplayed();
		        } catch (Exception e) {
		            return false;
		        }
		    }
		}
		
		
		

