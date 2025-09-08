package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.FormPage;
import pages.HomePage;
import pages.LogRegPage;
import utils.DriverFactory;

public class StepDefinitions {
	
	WebDriver driver = DriverFactory.getDriver();
	FormPage fp = new FormPage(driver);
	HomePage hp = new HomePage(driver);
	LogRegPage lrp = new LogRegPage(driver);


@Given("user clicks on programs")
public void user_clicks_on_programs() throws InterruptedException {
    driver.get("https://westfloridaahec.org/");
    Thread.sleep(1000);
    fp.clickPrograms();
}

@Given("user selects on healthaging")
public void user_selects_on_healthaging() throws InterruptedException {
    fp.selectHealthyAging();
    Thread.sleep(1000);
}

@Given("user clicks on register here")
public void user_clicks_on_register_here() throws InterruptedException {
    fp.clickRegisterHere();
    Thread.sleep(8000);
}

@Given("user enters firstname {string}")
public void user_enters_firstname(String FirstName) throws InterruptedException {
    fp.enterFirstName(FirstName);
    Thread.sleep(1000);
}

@Given("user enters lastname {string}")
public void user_enters_lastname(String LastName) throws InterruptedException {
    fp.enterLastName(LastName);
    Thread.sleep(1000);
}

@Given("user enters phoneno {string}")
public void user_enters_phoneno(String Phone) throws InterruptedException {
	fp.enterPhone(Phone);
	 Thread.sleep(1000);
    
}

@Given("user enters email {string}")
public void user_enters_email(String Email) throws InterruptedException {
	fp.enterEmail(Email);
	 Thread.sleep(1000);
    
}

@Given("user enters programs {string}")
public void user_enters_programs(String program) throws InterruptedException {
   fp.selectProgram(program);
   Thread.sleep(1000);
}

@Given("user enters country {string}")
public void user_enters_country(String Country) throws InterruptedException {
    fp.selectCountry(Country);
    Thread.sleep(1000);
}

@Given("user enters format {string}")
public void user_enters_format(String Format) throws InterruptedException {
	fp.chooseFormat(Format);
	 Thread.sleep(1000);
    
}

@Given("user enters bestdescribed {string}")
public void user_enters_bestdescribed(String BestDes) throws InterruptedException {
 fp.describeBest(BestDes);
 Thread.sleep(1000);
}

@Given("user enters aboutus {string}")
public void user_enters_aboutus(String aboutus) throws InterruptedException {
	fp.enterAbout(aboutus);
	 Thread.sleep(1000);
    
}

@Given("user enters notify {string}")
public void user_enters_notify(String Notify) throws InterruptedException {
    fp.enableNotifications();
    Thread.sleep(1000);
}

@Given("user clicks on submit {string}")
public void user_clicks_on_submit(String Submit) throws InterruptedException {
  fp.clickSubmit();
  Thread.sleep(4000);
}

@Then("user views message {string}")
public void user_views_message(String SubmittedSuccessfully) throws InterruptedException {
   fp.isSubmissionMessageDisplayed();
   Thread.sleep(1000);
}

//home page feature

@Given("user is on home page")
public void user_is_on_home_page() throws InterruptedException {
	driver.get("https://westfloridaahec.org/");
	
    Thread.sleep(1000);
	
    
}

@Given("user clicks on quittobacco")
public void user_clicks_on_quittobacco() throws InterruptedException {
	hp.clickQuitLink();

    Thread.sleep(1000);
    
}

@Given("user is navigate and views title of page")
public void user_is_navigate_and_views_title_of_page() throws InterruptedException {
   hp.QuitPageTitle(); 
   Thread.sleep(2000);
   System.out.println("Title Displayed ");
}

@Given("user on home page")
public void user_on_home_page() throws InterruptedException {
	driver.get("https://westfloridaahec.org/");
    Thread.sleep(1000);
   
}

@Given("user enters books in search bar")
public void user_enters_books_in_search_bar() throws InterruptedException {
	hp.clickBookSearch();
	Thread.sleep(1000);
   
}

@Given("user click on search button")
public void user_click_on_search_button() throws InterruptedException {
	hp.SearchButton();
	Thread.sleep(1000);
    
}

@Given("user is navigated to required page")
public void user_is_navigated_to_required_page() throws InterruptedException {
	hp.isBookPageDisplayed();
	Thread.sleep(1000);
	System.out.println("Books page displayed");
   
}

@Given("user on homepage")
public void user_on_homepage() throws InterruptedException {
	driver.get("https://westfloridaahec.org/");
    Thread.sleep(1000);
    
}

@Given("user clicks on aboutus")
public void user_clicks_on_aboutus() throws InterruptedException {
	hp.clickAboutLink();
	Thread.sleep(1000);
    
}

@Given("user is navigated to about page")
public void user_is_navigated_to_about_page() throws InterruptedException {
	hp.isAboutPageDisplayed();
	Thread.sleep(1000);
	System.out.println("Navigated to aboutus page");
    
}

//Login feature

@Given("user is on a home page")
public void user_is_on_a_home_page() throws InterruptedException {
driver.get("https://westfloridaahec.org/");
	
    Thread.sleep(1000);
    
}

@Given("user clicks on Myaccount")
public void user_clicks_on_myaccount() throws InterruptedException {
	lrp.clickMyAccount();
	 Thread.sleep(1000);
    
}

@Given("user enters valid required data {string} {string} {string}")
public void user_enters_valid_required_data(String Username,String Email,String Password) throws InterruptedException {
	lrp.enterUserName(Username);
	 Thread.sleep(1000);
	lrp.enterEmail(Email);
	 Thread.sleep(1000);
	lrp.enterPassword(Password);
	 Thread.sleep(1000);


}

@Given("user clicks on register button")
public void user_clicks_on_register_button() throws InterruptedException {
   lrp.clickRegister();
   System.out.println("button is not clickable");
   Thread.sleep(2000);
}



@Given("user clicks on MyAccount")
public void user_clicks_on_my_account() throws InterruptedException {
    lrp.clickMyAccount();
    Thread.sleep(1000);
}

@Given("user enters valid data {string} {string}")
public void user_enters_valid_data(String Email,String Password) throws InterruptedException {
	
	lrp.enterLoginEmail(Email);
	 Thread.sleep(1000);
	lrp.enterLoginPassword(Password);
	 Thread.sleep(1000);
	
}

@Given("user clicks on login button")
public void user_clicks_on_login_button() throws InterruptedException {
   lrp.clickLogin();
   
   Thread.sleep(2000);
   System.out.println("Login button is not working");
}


@Given("user click on MyAccount")
public void user_click_on_my_account() throws InterruptedException {
	driver.get("https://westfloridaahec.org/");
	Thread.sleep(2000);
	lrp.clickMyAccount();
 
}

@Given("user enter invalid data {string} {string}")
public void user_enter_invalid_data(String Email,String Password) throws InterruptedException {
	 Thread.sleep(1000);
	lrp.enterInEmail(Email);
	 Thread.sleep(1000);
	lrp.enterInPassword(Password);
	 Thread.sleep(1000);
    
}

@Given("user click on login button")
public void user_click_on_login_button() throws InterruptedException {
  lrp.clickInLogin();
  Thread.sleep(1000);
  System.out.println("Login button is not working");
}




}
