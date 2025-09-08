package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {
	
	private WebDriver driver;
	
	//locators
	By proglink = By.xpath("(//li[@id='menu-item-264'])[1]");
	By haginglink = By.xpath("//li[@id='menu-item-534']");
	By reghere = By.xpath("//a[normalize-space()='CLICK HERE TO REGISTER NOW']");
	By firstf = By.xpath("//input[@id='cog-input-auto-0']");
	By lastf = By.xpath("//input[@id='cog-input-auto-1']");
	By phonef = By.xpath("//input[@id='cog-1']");
	By emailf = By.xpath("//input[@id='cog-2']");
	By prof = By.xpath("//label[@style='order: 0; align-items: flex-start;']");
	By counf = By.xpath("(//label[@role='radio'])[1]");
	By formatf = By.xpath("(//label[@class='el-radio cog-checkable__item cog-choice-option is-checked'])[1]");
	By bestdesf = By.xpath("(//input[@id='cog-6'])[1]");
	By aboutf = By.xpath("//textarea[@id='cog-7']");
	By notifyf = By.xpath("(//label[@class='el-checkbox cog-choice-option'])[1]");
	By submitf = By.xpath("//button[@type='submit']");
	By msgf = By.xpath("//div[@class='cog-confirmation__message cog-content cog-html cog-input']");
	
	//constructor
	public FormPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Method actions
	  public void clickPrograms() {
	        WebElement programs = driver.findElement(proglink);
	        programs.click();
	    }

	
	    public void selectHealthyAging() {
	        WebElement healthAging = driver.findElement(haginglink);
	        healthAging.click();
	    }

	    
	    public void clickRegisterHere() {
	        WebElement registerButton = driver.findElement(reghere);
	        registerButton.click();
	    }
	

    public void enterFirstName(String FirstName) {
        driver.findElement(firstf).sendKeys(FirstName);
    }

    public void enterLastName(String LastName) {
        driver.findElement(lastf).sendKeys(LastName);
    }

    public void enterPhone(String Phone) {
        driver.findElement(phonef).sendKeys(Phone);
    }

    public void enterEmail(String Email) {
        driver.findElement(emailf).sendKeys(Email);
    }

    public void selectProgram(String program) {
        driver.findElement(prof).click(); 
    }

    public void selectCountry(String Country) {
        driver.findElement(counf).click();
    }

    public void chooseFormat(String Format) {
        driver.findElement(formatf).click(); 
    }

    public void describeBest(String BestDes) {
        driver.findElement(bestdesf).sendKeys(BestDes);
    }

    public void enterAbout(String AboutUs) {
        driver.findElement(aboutf).sendKeys(AboutUs);
    }

    public void enableNotifications() {
        WebElement checkbox = driver.findElement(notifyf);
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public void clickSubmit() {
        driver.findElement(submitf).click();
    }

        public boolean isSubmissionMessageDisplayed() {
            
           return driver.findElement(msgf).isDisplayed();
            
        } 
    }
    


	 
	
	


