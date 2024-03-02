package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumMethods;

public class AdminPage extends SeleniumMethods {
	
	public AdminPage(WebDriver driver) {
		super(driver);
	}
	
	//SEARCH USER
	
	private By AdminSectionButton=By.className("oxd-main-menu-item");
	private By UserNameField=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	private By AdminUserRole=By.xpath("(//div[@class='oxd-select-dropdown --positon-bottom']/div/span)[1]");
	private By EmployeeName=By.xpath("//input[@placeholder='Type for hints...']");
	private By Status=By.xpath("(//div[@class='oxd-select-dropdown --positon-bottom']/div/span)[1]");
	private By SubmitButton=By.xpath("//button[@type='submit']");
	private By dropdown1=By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
	private By dropdown2=By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
	private By suggestion=By.xpath("//div[@role='listbox']/div/span");
	
	
	//Add User
	
	private By AddButton=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	private By Role=By.xpath("(//div[@role='listbox']/div/span)[1]");
	private By StatusAdd=By.xpath("(//div[@role='listbox']/div/span)[1]");
	private By EmpName=By.xpath("//input[@placeholder='Type for hints...']");
	private By EmpNameuggestion=By.xpath("(//div[@role='listbox']/div/span)[3]");
	private By StatusSelect=By.xpath("(//div[@role='listbox']/div/span)[1]");
	private By Password=By.xpath("(//input[@type='password'])[1]");
	private By ConfirmPassword=By.xpath("(//input[@type='password'])[2]");
	
	
	
	//---------------------------------------------EDIT USER--------------------------------------------//
	
	
	private By EditButtonclick=By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[4]");
	private By VerifyText=By.xpath("(//div[@class='oxd-table-cell oxd-padding-cell']/div)[2]");
	private By clearname=By.xpath("(//input[contains(@class, 'oxd-input oxd-input')])[2]");
	
	
	//----------------------------------------------DELETE RECORD-----------------------------------------//
	
	
	private By Deletebutton=By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[5]");
	private By DeleteConfirm=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']");
	
	//---------------------------------------------MULTIPLE-----------------------------------------------//
	
	private By SelectallButton=By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]");
	private By DeleteAll=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']");
	private By ConfirmAll=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']");
	private By Successtext=By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']");
	
	

	
	
	//-----------------------------------------------------------------------------------------------------//
	//-----------------------------------------------------------------------------------------------------//
	
	public void AdminSection() {
		
		clickOn(AdminSectionButton);
				
	}
	
	public void InputDetails(String username,String employee) {
		
		sendKeys(UserNameField,username);
		sendKeys(EmployeeName,employee);
		
		waitForElementVisible(suggestion, 5);
		waitForElementClickable(suggestion, 5);
		clickOn(suggestion);
		clickOn(dropdown1);
		clickOn(AdminUserRole);
		clickOn(dropdown2);
		clickOn(Status);
		
	}
	
	public void SubmitClick() {
		
		clickOn(SubmitButton);
		
		
		//---------------------------ADD USER-----------------------------------------------------//
		
	}
	
	public void AddUser() {
		
		clickOn(AddButton);
	}
	
	public void InputAddDetail(String Emp,String uname,String pwd1) {
		
		clickOn(dropdown1);
		clickOn(Role);
		sendKeys(EmpName,Emp);
		waitForElementClickable(EmpNameuggestion, 5);
		clickOn(EmpNameuggestion);
		clickOn(dropdown2);
		clickOn(StatusAdd);
		sendKeys(UserNameField,uname);
		sendKeys(Password,pwd1);
		sendKeys(ConfirmPassword,pwd1);
		
		
		
	}
	
	public void SaveUser() {
		
		clickOn(SubmitButton);
	}
	
	
	
	
	//---------------------------------------edit data CLick------------------------------------------------------//
	
	public void EditClick()
	{
		
		clickOn(EditButtonclick);
	}
	
	public void EditDetails(String s) throws InterruptedException {
		
	
		waitForElementVisible(clearname, 2);
		  ClearField(clearname); 
		  sendData(clearname,s);
		
	}
	
	public String textreturn() {
		return getText(VerifyText);
	}
	
	//--------------------------------------------------DELETERECORD----------------------------------------//
	
	
	public void deleterecord() {
		
		clickOn(Deletebutton);
		clickOn(DeleteConfirm);
	}
	
	//------------------------------------------------DELETEMULTIPLE-----------------------------------------//
	
	public void SelectMethod() {
		
		clickOn(SelectallButton);
		
	}
	
	public void DeleteMethod() {
		
		clickOn(DeleteAll);
		clickOn(ConfirmAll);
	}
	
	public String VerifySuccess() {
		return getText(Successtext);
		
	}
	
	//---------------------------------------------VErify Suggestion--------------------------------------//
	
	public void Suggestion(String s) {
		
		sendKeys(EmployeeName,s);
	
	}
	
	public String verifysuugestion() {
		
		return getText(suggestion);
	}
	
	
}
