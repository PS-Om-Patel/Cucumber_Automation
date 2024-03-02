package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AdminPage;
import utilities.BaseClass;

public class AdminStepDef {
	
	WebDriver driver;
	SoftAssert sf;
	
	public AdminStepDef() {
		this.driver=BaseClass.getDriver();
	
	}
	
	AdminPage ap;
	
	
	@Given("the Admin user is in the Admin section of the portal")
	public void the_admin_user_is_in_the_admin_section_of_the_portal() {
			ap=new AdminPage(driver);
			ap.AdminSection();
	
	}
	@When("the Admin user searches using valid user details")
	public void the_admin_user_searches_using_valid_user_details() {

			ap.InputDetails("om", "Odis  Adalw");
	
	}
	@When("clicks the Search button")
	public void clicks_the_search_button() {
		
		ap.SubmitClick();

	
	}
	@Then("the Admin user can retrieve the specific uses detail")
	public void the_admin_user_can_retrieve_the_specific_uses_detail() {
		
			
	
	}
	
	
	//-----------------------------------------------------------------------------------------------------//
	
	
	
	
	  @When("the user clicks the add button") public void
	  the_user_clicks_the_add_button() {
		  
		  ap.AddUser();
	  
	  
	  }
	  
	  @When("inputs valid user details in the Add User form") public void
	  inputs_valid_user_details_in_the_add_user_form() {
		  
		  ap.InputAddDetail("O", "productqd", "productsqu123");
	  
	  
	  }
	  
	  @When("clicks the save button") public void clicks_the_save_button() {
		  
		  ap.SaveUser();
	  
	  
	  }
	  
	  @Then("the Admin user can create a new user for the portal") public void
	  the_admin_user_can_create_a_new_user_for_the_portal() {
		  
		  sf.assertEquals("Successfully Saved", ap.VerifySuccess());
		  sf.assertAll();
	  
	  
	  }
	  
	  
	  //---------------------------------------------------------------------------------------------------//
	  
	  
	  @When("the Admin user clicks on the edit icon")
	  public void the_admin_user_clicks_on_the_edit_icon() {
		  
		  ap.EditClick();

	  
	  }
	  @When("modifies the necessary details and clicks on the save button")
	  public void modifies_the_necessary_details_and_clicks_on_the_save_button() throws InterruptedException {
		  
		  ap.EditDetails("meet");

	  
	  }
	  @Then("the specific user details are updated accordingly")
	  public void the_specific_user_details_are_updated_accordingly() {
		  
			
			  String a=ap.textreturn(); 
			  sf.assertEquals(a, "meet");
			  sf.assertAll();
			 
	  
	  }
	  
	  
	  //======================================DELETE RECORD--------------------------------------------//
	  
	  @When("the Admin user clicks on the delete button and confirms the action")
	  public void the_admin_user_clicks_on_the_delete_button_and_confirms_the_action() {
		  
		  ap.deleterecord();

	  
	  }
	  @Then("the specific user is removed from the system")
	  public void the_specific_user_is_removed_from_the_system() {

	  
	  
	  }
	  
	  
	  //----------------------------------------------DELETE MULTIPLE------------------------------------//
	  
	  @When("The Admin user select multiple user thorugh select all")
	  public void the_admin_user_select_multiple_user_thorugh_select_all() {
		  	ap.SelectMethod();
	  
	  }
	  @When("hit on Delete Selected button")
	  public void hit_on_delete_selected_button() {

		  ap.DeleteMethod();
	  }
	  @Then("all selected users are deleted")
	  public void all_selected_users_are_deleted() {

		  SoftAssert obj=new SoftAssert();
		  String a=ap.VerifySuccess();
		  obj.assertEquals("Successfully Deleted", a);
		  obj.assertAll();
	  }
	  
	  
	  //---------------------------------------Name Suggestion----------------------------------------//
	  
	  @When("the Admin user types a partial name in the employee name field")
	  public void the_admin_user_types_a_partial_name_in_the_employee_name_field() {

		  ap.Suggestion("Odis Adal");
	  
	  }
	  @Then("the system displays a list of suggestions for the employee name based on input")
	  public void the_system_displays_a_list_of_suggestions_for_the_employee_name_based_on_input() {

	  SoftAssert obj1=new SoftAssert();
	  obj1.assertEquals("Odis Adalwin", ap.verifysuugestion());
	  obj1.assertAll();
	  
	  
	  }

	 
	 
	
	

}
