package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogRegPage {
	
	private WebDriver driver;
	
	By MyAccount = By.xpath("//li[@class='menu-item fusion-dropdown-menu menu-item-has-children fusion-custom-menu-item fusion-menu-login-box']");
	By Register = By.xpath("//a[normalize-space()='Register']");
	By user = By.xpath("//input[@id='reg_username']");
	By emailreg = By.xpath("//input[@id='reg_email']");
	By pass = By.xpath("//input[@id='reg_password']");
	By registerbtn= By.xpath("//button[normalize-space()='Register']");
	By logemail = By.xpath("//input[@id='username']");
	By logpassword = By.xpath("//input[@id='password']");
	By lodbtn = By.xpath("//button[normalize-space()='Log in']");
	By inlogemail = By.xpath("//input[@id='username']");
	By inlogpassword = By.xpath("//input[@id='password']");
	By inlogbtn = By.xpath("//button[normalize-space()='Log in']");
	
	
	//constructor
	public LogRegPage(WebDriver driver) {
		this.driver = driver;
	
	}
	
	//Actions
	 public void clickMyAccount() {
	        driver.findElement(MyAccount).click();
	    }

	    public void enterUserName(String Username) {
	        driver.findElement(user).sendKeys(Username);
	    }

	    public void enterEmail(String Email) {
	        driver.findElement(emailreg).sendKeys(Email);
	    }

	    public void enterPassword(String Password) {
	        driver.findElement(pass).sendKeys(Password);
	    }

	    public boolean clickRegister() {
	    	try {
	        return driver.findElement(registerbtn).isEnabled();
	    	}catch(Exception e) {
			return false;
	    	}
	    }

	    public void enterLoginEmail(String Email) {
	        driver.findElement(logemail).sendKeys(Email);
	    }

	    public void enterLoginPassword(String Password) {
	        driver.findElement(logpassword).sendKeys(Password);
	    }

	    public boolean clickLogin() {
	        return driver.findElement(lodbtn).isEnabled();
	    }

	    public void enterInEmail(String Email) {
	        driver.findElement(inlogemail).sendKeys(Email);
	    }

	    public void enterInPassword(String Password) {
	        driver.findElement(inlogpassword).sendKeys(Password);
	    }

	    public boolean clickInLogin() {
	        return driver.findElement(inlogbtn).isEnabled();
	    }
	}
	
	


