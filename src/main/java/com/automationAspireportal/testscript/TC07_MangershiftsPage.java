package com.automationAspireportal.testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automationAspireportal.helper.ManagerLogin;
import com.automationAspireportal.testsuite.TestsuiteBase;
import com.automationAspireportal.utils.Readmanagermodulelocators;

public class TC07_MangershiftsPage extends TestsuiteBase {
	Readmanagermodulelocators read = new Readmanagermodulelocators();

	public TC07_MangershiftsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void updatingshifts() throws AWTException {
		ManagerLogin login = new ManagerLogin(driver);
		login.managerlogin();
		driver.findElement(By.xpath(read.clickonshifts())).click();
		driver.findElement(By.xpath(read.clickonselectprojecttb())).click();
		driver.findElement(By.xpath(read.selectproject())).click();
		driver.findElement(By.xpath(read.updateshifts())).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(read.cickonselectemployee())).click();
		driver.findElement(By.xpath(read.selectemployeelogin())).click();
		driver.findElement(By.xpath(read.clickonstartdate())).click();
		driver.findElement(By.xpath(read.enterstartingdate())).click();
		driver.findElement(By.xpath(read.clickonenddate())).click();
		driver.findElement(By.xpath(read.enterenddate())).click();
		driver.findElement(By.xpath(read.clickonshift())).click();
		driver.findElement(By.xpath(read.selectshift())).click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath(read.clickonBack())).click();

	}

}
