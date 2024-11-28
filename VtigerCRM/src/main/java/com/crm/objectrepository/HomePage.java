package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath = "//input[@value='Search...']")
	private WebElement searchBox;
	
	@FindBy(xpath = "//input[@title='Find']")
	private WebElement searchButton;
	
	@FindBy(linkText = "Calendar")
	private WebElement Calendar;
	
	@FindBy(linkText = "Leads")
	private WebElement Leads;
	
	@FindBy(linkText = "Organizations")
	private WebElement Organizations;
	
	@FindBy(linkText = "Contacts")
	private WebElement Contacts;
	
	@FindBy(linkText = "Opportunities")
	private WebElement Opportunities;
	
	@FindBy(linkText = "Products")
	private WebElement Products;
	
	@FindBy(linkText = "Documents")
	private WebElement Documents;
	
	@FindBy(linkText = "Email")
	private WebElement Email;
	
	@FindBy(linkText = "Trouble Tickets")
	private WebElement TroubleTickets;
	
	@FindBy(linkText = "Dashboard")
	private WebElement Dashboard;
	
	@FindBy(linkText = "More")
	private WebElement More;
	
	@FindBy(id = "qccombo")
	private WebElement QuickCreate;
	
	@FindBy(partialLinkText = "Home")
	private WebElement Home;
	
	@FindBy(xpath = "(//img[@style='cursor:pointer;'])[1]")
	private WebElement pluseButton;
	
	 @FindBy(xpath = "//img[@title='Open Calendar...']")
	 private WebElement calenderIcon;
	 
	 @FindBy(xpath = "//img[@title='Show World Clock...']")
	 private WebElement clockIcon;
	 
	 @FindBy(xpath = "//img[@title='Open Calculator...']")
	 private WebElement calculatorIcon;
	 
	 @FindBy(xpath = "//img[@title='Chat...']")
	 private WebElement chatIcon;
	 
	 @FindBy(xpath = "//img[@title='Last Viewed']")
	 private WebElement lastViewedIcon;
	 
	 @FindBy(xpath = "//img[@title='Change layout']")
	 private WebElement changeLayout;
	 
	 public HomePage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getCalendar() {
		return Calendar;
	}

	public WebElement getLeads() {
		return Leads;
	}

	public WebElement getOrganizations() {
		return Organizations;
	}

	public WebElement getContacts() {
		return Contacts;
	}

	public WebElement getOpportunities() {
		return Opportunities;
	}

	public WebElement getProducts() {
		return Products;
	}

	public WebElement getDocuments() {
		return Documents;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getTroubleTickets() {
		return TroubleTickets;
	}

	public WebElement getDashboard() {
		return Dashboard;
	}

	public WebElement getMore() {
		return More;
	}

	public WebElement getQuickCreate() {
		return QuickCreate;
	}

	public WebElement getHome() {
		return Home;
	}

	public WebElement getPluseButton() {
		return pluseButton;
	}

	public WebElement getCalenderIcon() {
		return calenderIcon;
	}

	public WebElement getClockIcon() {
		return clockIcon;
	}

	public WebElement getCalculatorIcon() {
		return calculatorIcon;
	}

	public WebElement getChatIcon() {
		return chatIcon;
	}

	public WebElement getLastViewedIcon() {
		return lastViewedIcon;
	}

	public WebElement getChangeLayout() {
		return changeLayout;
	}
	 
	 
	 
	 

}
