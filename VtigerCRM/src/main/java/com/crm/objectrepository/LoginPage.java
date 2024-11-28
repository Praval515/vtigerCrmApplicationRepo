package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
		@FindBy(xpath = "//input[@name='user_name']")
		private WebElement UserName;
		
		@FindBy(xpath = "//input[@name='user_password']")
		private WebElement Password;
		
		@FindBy(id = "submitButton")
		private WebElement submitButton;
		
		@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
		private WebElement profileIcon;
		
		@FindBy(linkText = "Sign Out")
		private WebElement singOutLnk;
		
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}


		public WebElement getUserName() {
			return UserName;
		}


		public WebElement getPassword() {
			return Password;
		}


		public WebElement getSubmitButton() {
			return submitButton;
		}


		public WebElement getProfileIcon() {
			return profileIcon;
		}


		public WebElement getSingOutLnk() {
			return singOutLnk;
		}
		
		
		
	}


