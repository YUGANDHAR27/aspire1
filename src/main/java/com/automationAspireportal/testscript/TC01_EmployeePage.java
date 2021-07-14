package com.automationAspireportal.testscript;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automationAspireportal.helper.Logout;
import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.helper.employeeLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.PageActions;
import com.automationAspireportal.utils.ReadEmployeeModuleLocators;
import com.automationAspireportal.utils.ReadExcel;
import com.automationAspireportal.utils.ReadLocators;
import com.automationAspireportal.utils.Readmanagermodulelocators;

public class TC01_EmployeePage extends TestsuiteBase {
	ReadExcel excel;
	ReadEmployeeModuleLocators reademp;

	public void employeeModule() {
		String Expeectedresult = "Aspire HR Portal";
		employeeLogin loginin = new employeeLogin(driver);
		loginin.employeelogin();
		PageActions selectactivity = new PageActions(driver);
		selectactivity.selectActivity();
		selectactivity.activity();
		driver.findElement(By.xpath(reademp.clickonMonday())).sendKeys(excel.mondayWorkinghour());
		driver.findElement(By.xpath(reademp.clickonTuesday())).sendKeys(excel.tuesdayWorkinghour());
		driver.findElement(By.xpath(reademp.clickonwednesday())).sendKeys(excel.wednesdayWorkinghour());
		driver.findElement(By.xpath(reademp.clickonThursday())).sendKeys(excel.thursdayWorkinghour());
		driver.findElement(By.xpath(reademp.clickonFriday())).sendKeys(excel.fridayWorkinghour());
		driver.findElement(By.xpath(reademp.clickonNotes())).click();
		driver.findElement(By.xpath(reademp.giveNotes())).sendKeys("Thank you Sir");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(reademp.clickcheck())).click();
		driver.findElement(By.xpath(reademp.clickonAddactivity())).click();
		driver.findElement(By.xpath(reademp.selectactivity1())).click();
		driver.findElement(By.xpath(reademp.activity2())).click();
		driver.findElement(By.xpath(reademp.deleteactivity())).click();
		driver.findElement(By.xpath(reademp.saveTimesheet())).click();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(reademp.submit())).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String Actualresult = driver.getTitle();
		assertEquals(Actualresult, Expeectedresult);
		
		
	}
	

}
