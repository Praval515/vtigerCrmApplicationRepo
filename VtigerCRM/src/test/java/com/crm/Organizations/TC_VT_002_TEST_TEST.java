package com.crm.Organizations;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListnerUtility;
import com.crm.objectrepository.CreateOrganizationPage;
import com.crm.objectrepository.HomePage;
import com.crm.objectrepository.OrganizationPage;
@Listeners(ListnerUtility.class)
public class TC_VT_002_TEST_TEST extends BaseClass{
	
	@Test
	public void createOrganization() throws EncryptedDocumentException, IOException {
		hp=new HomePage(driver);
		hp.getOrganizations().click();
		
		OrganizationPage orgPage=new OrganizationPage(driver);
		orgPage.getCreateOrg().click();
		
		CreateOrganizationPage creatOrgPage=new CreateOrganizationPage(driver);
		Assert.assertTrue(creatOrgPage.getCreatingNewOrganization().isDisplayed(),"create Organization page is not displayed");
		test.log(Status.PASS, "create Organization page is displayed");
		
		String organizationName = eUtil.getStringDataFromExcel("Organizations", 1, 0)+jUtil.getRandomNumber();
		creatOrgPage.getOrganizationNameTextField().sendKeys(organizationName);
		
		Assert.assertTrue(creatOrgPage.getIndustryDropDown().isDisplayed(),"industry drop down is not visible");
		test.log(Status.PASS, "industry drop down is visible");
		
		wUtil.selectByValue(creatOrgPage.getIndustryDropDown(), eUtil.getStringDataFromExcel("Organizations", 2, 1));
		
		creatOrgPage.getSaveButton().click();
		
		String headerText = orgPage.getHeaderText().getText();
		System.out.println(headerText);
		
		Assert.assertTrue(headerText.contains(organizationName), "Organization is not created");
		test.log(Status.PASS, "Organization is created");
		
		
	}
	

}
