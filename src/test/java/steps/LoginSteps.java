package steps;

import POM.BaseClass;
import POM.HomePage;
import POM.PreHome;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends BaseClass {

	PreHome preh;
	HomePage hp;
	
	@Given("^user is in Home page$")
	public void user_is_in_Home_page() {
	    // Write code here that turns the phrase above into concrete actions

	
	}

	@When("^click on login button$")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		preh=new PreHome();
		preh.clickOnLoginBtn(); // cal POM methods not test methods
	}

	@When("^entered valid user name and password$")
	public void entered_valid_user_name_and_password()  {
	    // Write code here that turns the phrase above into concrete actions
		hp=new HomePage();
		hp.Login("hend@gmail.com", "asdfg");

	}

	@Then("^login succefully and profile page appears$")
	public void login_succefully_and_profile_page_appears() {
		hp.Logout();
	   
	}
	
	
}
