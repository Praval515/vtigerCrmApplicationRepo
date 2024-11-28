package com.crm.Organizations;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListnerUtility;
import com.crm.objectrepository.ContactsPage;
import com.crm.objectrepository.CreatContactsPage;
import com.crm.objectrepository.HomePage;
@Listeners(ListnerUtility.class)
public class TC_VT_003_TEST_TEST extends BaseClass {

	@Test
	public void createContacts() {
		
		HomePage HPage=new HomePage(driver);
		CreatContactsPage creatContPage=new CreatContactsPage(driver);
		ContactsPage contactsPage=new ContactsPage(driver);
		
		HPage.getContacts().click();
//		Assert.assertTrue(contact);
	}
}
