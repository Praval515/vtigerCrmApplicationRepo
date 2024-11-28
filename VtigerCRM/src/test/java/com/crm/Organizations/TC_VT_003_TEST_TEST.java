package com.crm.Organizations;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListnerUtility;
import com.crm.objectrepository.ContactsPage;
import com.crm.objectrepository.CreatContactsPage;
import com.crm.objectrepository.HomePage;
@Listeners(ListnerUtility.class)
public class TC_VT_003_TEST_TEST extends BaseClass {

	@Test(groups = "smoke")
	public void createContacts() throws EncryptedDocumentException, IOException {
		
		HomePage HPage=new HomePage(driver);
		CreatContactsPage creatContPage=new CreatContactsPage(driver);
		ContactsPage contactsPage=new ContactsPage(driver); 
		
		HPage.getContacts().click();
		Assert.assertTrue(contactsPage.getCreateContactLink().isDisplayed(),"contact page is not displayed");
		test.log(Status.PASS, "contact page is displayed");
		
		contactsPage.getCreateContactLink().click();
		Assert.assertTrue(creatContPage.getFirstNameDropdown().isDisplayed(),"create contact page is not displayed");
		test.log(Status.PASS, "create contact page is displayed");
		
		
		wUtil.selectByValue(creatContPage.getFirstNameDropdown(),eUtil.getStringDataFromExcel("contact", 1, 0));
		String firstName = eUtil.getStringDataFromExcel("contact", 1, 1);
		creatContPage.getFirstNameTextField().sendKeys(firstName);
		String lastName = eUtil.getStringDataFromExcel("contact", 1, 2)+jUtil.getRandomNumber();
		creatContPage.getLastNameTextField().sendKeys(lastName);
		creatContPage.getSaveButton().click();
		
		String HeaderText = contactsPage.getHeaderText().getText();
		Assert.assertTrue(HeaderText.contains(firstName),"contact page is not created");
		test.log(Status.PASS, "contact page is created");
	}
}
