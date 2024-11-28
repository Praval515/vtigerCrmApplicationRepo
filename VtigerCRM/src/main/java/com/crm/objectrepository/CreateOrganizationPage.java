package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement creaeOrganizationLink;
	@FindBy(xpath = "//INPUT[@name='accountname']")
	private WebElement organizationNameTextField;
	@FindBy(name = "industry")
	private WebElement industryDropDown;
	@FindBy(name = "accounttype")
	private WebElement typeTextField;
	@FindBy(xpath = "(//input[@value='  Save  '])[1]")
	private WebElement saveButton;
	
	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement CreatingNewOrganization;
	
	
	public CreateOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getCreaeOrganizationLink() {
		return creaeOrganizationLink;
	}
	public WebElement getOrganizationNameTextField() {
		return organizationNameTextField;
	}
	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}
	public WebElement getTypeTextField() {
		return typeTextField;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	public WebElement getCreatingNewOrganization() {
		return CreatingNewOrganization;
	}

}
