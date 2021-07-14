package com.automationAspireportal.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.automationAspireportal.testsuite.TestsuiteBase;


public class PageActions extends TestsuiteBase {
	ReadExcel excel;
	ReadEmployeeModuleLocators reademp;

	public PageActions(WebDriver driver) {
		this.driver = driver;
		excel = new ReadExcel(0);
		reademp = new ReadEmployeeModuleLocators();

	}
	public void selectActivity() {
		driver.findElement(By.xpath(reademp.slectActivity())).click();
	}
	public void activity() {
		driver.findElement(By.xpath(reademp.activity())).click();
	}	
	
}