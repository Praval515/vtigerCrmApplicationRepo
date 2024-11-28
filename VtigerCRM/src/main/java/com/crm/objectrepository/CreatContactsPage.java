package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatContactsPage {
	
	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement createContactLink;
	@FindBy(xpath = "(//input[@value='  Save  '])[1]")
	private WebElement contactSaveButton;
	@FindBy(xpath = "(//input[@value='Cancel  '])[1]")
	private WebElement contactCancelButton;
	@FindBy(name = "salutationtype")
	private WebElement firstNameDropdown;
	@FindBy(name = "firstname")
	private WebElement firstNameTextField;
	@FindBy(name = "lastname")
	private WebElement lastNameTextField;
	@FindBy(name = "account_name")
	private WebElement organizationNameTextField;
	@FindBy(xpath = "(//img[@title='Select'])[1]")
	private WebElement selectOrganizationLink;
	@FindBy(xpath = "(//input[@title='Clear'])[1]")
	private WebElement clearOrganizationLink;
	@FindBy(name = "leadsource")
	private WebElement leadSourceDropDown;
	@FindBy(id = "title")
	private WebElement titleTextField;
	@FindBy(id = "department")
	private WebElement departmentTextField;
	@FindBy(id = "email")
	private WebElement emailTextField;
	@FindBy(id="assistant")
	private WebElement assistantTextField;
	@FindBy(id = "assistantphone")
	private WebElement assistantPhoneTextField;
	@FindBy(name = "emailoptout")
	private WebElement emailOptOutCheckBox;
	@FindBy(name = "reference")
	private WebElement referenceCheckBox;
	@FindBy(name = "notify_owner")
	private WebElement notifyOwnerCheckBox;
	@FindBy(id = "phone")
	private WebElement officePhoneTextField;
	@FindBy(id = "mobile")
	private WebElement mobileTextField;
	@FindBy(id = "homephone")
	private WebElement homePhoneTextField;
	@FindBy(id = "otherphone")
	private WebElement otherPhoneTextField;
	@FindBy(id = "fax")
	private WebElement faxTextField;
	@FindBy(id = "jscal_field_birthday")
	private WebElement birthdayTextField;
	@FindBy(xpath = "//img[@id='jscal_trigger_birthday']")
	private WebElement selectBirthdayFromCal;
	@FindBy(name = "contact_name")
	private WebElement reportsToTextField;
	@FindBy(xpath = "(//img[@title='Select'])[2]")
	private WebElement selectContacts;
	@FindBy(xpath = "(//input[@title='Clear'])[2]")
	private WebElement clearContact;
	@FindBy(id = "secondaryemail")
	private WebElement secondEmailTextField;
	@FindBy(name = "donotcall")
	private WebElement doNotCallCheckBox;
	@FindBy(name = "assigned_user_id")
	private WebElement assignedToUserDropDown;
	@FindBy(name = "assigned_group_id")
	private WebElement assignedToGroupDropDown;
	@FindBy(name = "portal")
	private WebElement portalUserCheckBox;
	@FindBy(id = "jscal_field_support_start_date")
	private WebElement supportStartDateTextField;
	@FindBy(xpath = "//img[@id='jscal_trigger_support_start_date']")
	private WebElement selectStartDateFromCal;
	@FindBy(id = "jscal_field_support_end_date")
	private WebElement supportEndDateTextField;
	@FindBy(xpath = "//img[@id='jscal_trigger_support_end_date']")
	private WebElement selectEndDateFromCal;
	
	
	
	@FindBy(xpath = "//textarea[@name='mailingstreet']")
	private WebElement MailingStreet;
	@FindBy(xpath = "//textarea[@name='otherstreet']")
	private WebElement OtherStreet;
	@FindBy(id = "mailingpobox")
	private WebElement MailingPoBx;
	@FindBy(id = "otherpobox")
	private WebElement OtherPoBox;
	@FindBy(id = "mailingcity")
	private WebElement MailingCity;
	@FindBy(id = "othercity")
	private WebElement OtherCity;
	@FindBy(id = "mailingstate")
	private WebElement MailingState;
	@FindBy(id = "otherstate")
	private WebElement OtherState;
	@FindBy(id = "mailingzip")
	private WebElement MailingZip;
	@FindBy(id = "otherzip")
	private WebElement OtherZip;
	@FindBy(id = "mailingcountry")
	private WebElement MailingCountry;
	@FindBy(id = "othercountry")
	 private WebElement OtherCountry;
	@FindBy(xpath = "//textarea[@name='description']")
	 private WebElement Description;
	@FindBy(xpath = "//input[@type='file']")
	private WebElement ContactImage;
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement SaveButton;
	@FindBy(xpath = "(//input[@type='button'])[2]")
	private WebElement CancleButton;
	
	
	public CreatContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this );
	}


	public WebElement getCreateContactLink() {
		return createContactLink;
	}


	public WebElement getContactSaveButton() {
		return contactSaveButton;
	}


	public WebElement getContactCancelButton() {
		return contactCancelButton;
	}


	public WebElement getFirstNameDropdown() {
		return firstNameDropdown;
	}


	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}


	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}


	public WebElement getOrganizationNameTextField() {
		return organizationNameTextField;
	}


	public WebElement getSelectOrganizationLink() {
		return selectOrganizationLink;
	}


	public WebElement getClearOrganizationLink() {
		return clearOrganizationLink;
	}


	public WebElement getLeadSourceDropDown() {
		return leadSourceDropDown;
	}


	public WebElement getTitleTextField() {
		return titleTextField;
	}


	public WebElement getDepartmentTextField() {
		return departmentTextField;
	}


	public WebElement getEmailTextField() {
		return emailTextField;
	}


	public WebElement getAssistantTextField() {
		return assistantTextField;
	}


	public WebElement getAssistantPhoneTextField() {
		return assistantPhoneTextField;
	}


	public WebElement getEmailOptOutCheckBox() {
		return emailOptOutCheckBox;
	}


	public WebElement getReferenceCheckBox() {
		return referenceCheckBox;
	}


	public WebElement getNotifyOwnerCheckBox() {
		return notifyOwnerCheckBox;
	}


	public WebElement getOfficePhoneTextField() {
		return officePhoneTextField;
	}


	public WebElement getMobileTextField() {
		return mobileTextField;
	}


	public WebElement getHomePhoneTextField() {
		return homePhoneTextField;
	}


	public WebElement getOtherPhoneTextField() {
		return otherPhoneTextField;
	}


	public WebElement getFaxTextField() {
		return faxTextField;
	}


	public WebElement getBirthdayTextField() {
		return birthdayTextField;
	}


	public WebElement getSelectBirthdayFromCal() {
		return selectBirthdayFromCal;
	}


	public WebElement getReportsToTextField() {
		return reportsToTextField;
	}


	public WebElement getSelectContacts() {
		return selectContacts;
	}


	public WebElement getClearContact() {
		return clearContact;
	}


	public WebElement getSecondEmailTextField() {
		return secondEmailTextField;
	}


	public WebElement getDoNotCallCheckBox() {
		return doNotCallCheckBox;
	}


	public WebElement getAssignedToUserDropDown() {
		return assignedToUserDropDown;
	}


	public WebElement getAssignedToGroupDropDown() {
		return assignedToGroupDropDown;
	}


	public WebElement getPortalUserCheckBox() {
		return portalUserCheckBox;
	}


	public WebElement getSupportStartDateTextField() {
		return supportStartDateTextField;
	}


	public WebElement getSelectStartDateFromCal() {
		return selectStartDateFromCal;
	}


	public WebElement getSupportEndDateTextField() {
		return supportEndDateTextField;
	}


	public WebElement getSelectEndDateFromCal() {
		return selectEndDateFromCal;
	}


	public WebElement getMailingStreet() {
		return MailingStreet;
	}


	public WebElement getOtherStreet() {
		return OtherStreet;
	}


	public WebElement getMailingPoBx() {
		return MailingPoBx;
	}


	public WebElement getOtherPoBox() {
		return OtherPoBox;
	}


	public WebElement getMailingCity() {
		return MailingCity;
	}


	public WebElement getOtherCity() {
		return OtherCity;
	}


	public WebElement getMailingState() {
		return MailingState;
	}


	public WebElement getOtherState() {
		return OtherState;
	}


	public WebElement getMailingZip() {
		return MailingZip;
	}


	public WebElement getOtherZip() {
		return OtherZip;
	}


	public WebElement getMailingCountry() {
		return MailingCountry;
	}


	public WebElement getOtherCountry() {
		return OtherCountry;
	}


	public WebElement getDescription() {
		return Description;
	}


	public WebElement getContactImage() {
		return ContactImage;
	}


	public WebElement getSaveButton() {
		return SaveButton;
	}


	public WebElement getCancleButton() {
		return CancleButton;
	}
	
	
	
	

}
