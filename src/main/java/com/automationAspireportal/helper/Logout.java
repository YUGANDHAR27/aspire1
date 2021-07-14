package com.automationAspireportal.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.ReadEmployeeModuleLocators;
import com.automationAspireportal.utils.ReadLocators;

public class Logout extends TestsuiteBase
{
	ReadEmployeeModuleLocators read=new ReadEmployeeModuleLocators();
	public Logout(WebDriver driver)
	{
		this.driver=driver;
	}
	public void logoutEmployeemodule() 
	{
		driver.findElement(By.xpath(read.profile())).click();
		driver.findElement(By.xpath(read.clickonlogout())).click();
		}
	
}
