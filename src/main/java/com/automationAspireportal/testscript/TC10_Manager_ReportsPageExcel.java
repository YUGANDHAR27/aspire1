package com.automationAspireportal.testscript;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.utils.Readmanagermodulelocators;

public class TC10_Manager_ReportsPageExcel 
{
	Readmanagermodulelocators read = new Readmanagermodulelocators();
	private WebDriver driver;

	public TC10_Manager_ReportsPageExcel(WebDriver driver) {
		this.driver = driver;
	}


	public void managerReportsexcel() throws AWTException {
		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		driver.findElement(By.xpath(read.clickonreports())).click();
	/*	driver.findElement(By.xpath( read.clickonselectclient())).click();
		driver.findElement(By.xpath(read.client())).click(); 
		Robot robot = new Robot(); 
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_TAB);	
        robot.keyPress(KeyEvent.VK_ENTER);	
       Select s=new Select(driver.findElement(By.id(read.cickonselectemployee())));
       s.selectByVisibleText("Employee Login"); */
		
     
		Select selectclient = new Select(driver.findElement(By.xpath(read.clickonselectclient())));
		selectclient.selectByVisibleText("Hyper Loop");
		Select selectproject=new Select(driver.findElement(By.xpath(read.clickonselectproject())));
		selectproject.selectByValue("56");
		selectproject.deselectByValue("0");
		WebElement startdate = driver.findElement(By.id("startDate"));
		startdate.sendKeys("01/07/2021");
		startdate.sendKeys(Keys.ENTER);
		WebElement endate = driver.findElement(By.id("endDate"));
		endate.sendKeys("13/07/2021");
		endate.sendKeys(Keys.ENTER);
		Select selectemployee = new Select(driver.findElement(By.xpath("//select[@id='selectEmployee']"))); 
		selectemployee.selectByValue("1089");
		selectemployee.deselectByValue("0");
		Select ActivityReports = new Select(driver.findElement(By.xpath("//select[@id='selectActivity']"))); 
		ActivityReports.selectByVisibleText("Without activity");
		Select SelectStatus = new Select(driver.findElement(By.xpath("//select[@id='selectStatus']"))); 
		SelectStatus.selectByValue("0");
		Select BillingType = new Select(driver.findElement(By.xpath("//select[@id='billingType']"))); 
		BillingType.selectByVisibleText("Yes");
		Select ExportAs = new Select(driver.findElement(By.xpath("//select[@id='downloadFor']"))); 
		ExportAs.selectByVisibleText("Offshore");
		Select Reporttype = new Select(driver.findElement(By.xpath("//select[@id='reportType']"))); 
		Reporttype.selectByVisibleText("Day wise");
		driver.findElement(By.xpath("//button[contains(text(),'Export')]")).click();
		driver.findElement(By.cssSelector("##downloadExcel")).click();
	}


}
