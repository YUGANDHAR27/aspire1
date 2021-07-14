package com.automationAspireportal.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationAspireportal.helper.Logout;
import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.Readmanagermodulelocators;

public class TC03_Action_approve extends TestsuiteBase
{
	public TC03_Action_approve(WebDriver driver) {
		this.driver = driver;
			}

	public void manageractionapprove() {
		Readmanagermodulelocators read = new Readmanagermodulelocators();
		TC01_EmployeePage empage = new TC01_EmployeePage();
		empage.employeeModule();
		Logout out = new Logout(driver);
		out.logoutEmployeemodule();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		driver.findElement(By.xpath(read.clickonApproveaction())).click();
		driver.findElement(By.xpath(read.clickonApprove())).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	driver.findElement(By.xpath(read.entercomment())).sendKeys("thank you");
	//	driver.findElement(By.xpath(read.reject())).click();
		//;
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}


}
