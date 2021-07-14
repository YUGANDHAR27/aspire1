package com.automationAspireportal.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.automationAspireportal.constants.FilePathConstants;

public class Readmanagermodulelocators {
	File file = new File(FilePathConstants.managertimesheet_locators);
	FileInputStream fis = null;
	Properties prop = null;

	public Readmanagermodulelocators() {
		try {
			fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
			;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String clickoncheckbox() {
		return prop.getProperty("Loc.selectemployee.checkbox");
	}
	public String clickonApprove()
	{
		return prop.getProperty("Loc.approve.txt");
	}
	public String clickonApproveaction() 
	{
		return prop.getProperty("Loc.approve.check");
	}

	public String clickonreject() {
		return prop.getProperty("Loc.reject.btn");

	}

	public String entercomment() {
		return prop.getProperty("Loc.comment.txt");
	}

	public String reject() {
		return prop.getProperty("Loc.reject1.btn");
	}

	public String rejectaction()
	 {
	 return prop.getProperty("Loc.rejectaction.btn");
	 }
	public String clickonshifts() {
		return prop.getProperty("Loc.shifts.txt");
	}

	public String clickonselectprojecttb() {
		return prop.getProperty("Loc.selectprojecttextbox.txtbox");
	}

	public String selectproject() {
		return prop.getProperty("Loc.selectproject.txt");
	}

	public String updateshifts() {
		return prop.getProperty("Loc.updateshifts.txt");

	}

	public String cickonselectemployee() {
		return prop.getProperty("Loc.selectemployee.textbox");

	}

	public String selectemployeelogin() {
		return prop.getProperty("Loc.employeelogin.txt");
	}

	public String clickonstartdate() {
		return prop.getProperty("Loc.startdate.textbox");
	}

	public String enterstartingdate() {
		return prop.getProperty("Loc.sdate.txt");
	}

	public String clickonenddate() {
		return prop.getProperty("Loc.enddate.textbox");

	}

	public String enterenddate() {
		return prop.getProperty("Loc.edate.txt");

	}

	public String clickonshift() {
		return prop.getProperty("Loc.shifts.textbox");

	}

	public String selectshift() {
		return prop.getProperty("Loc.shifttype.txt");
	}

	public String clickonBack() {
		return prop.getProperty("Loc.back.btn");
	}
	
	//Reports//

	public String clickonreports() {
		return prop.getProperty("Loc.reports.txt");
	}
	public String clickonselectclient()
	{
		return prop.getProperty("Loc.selectclient.dropdwn");
		
	}
	public String clickonselectproject()
	{
		return prop.getProperty("Loc.selectproject.dropdwn");
		
	}
	
	
	
	public String clickonSelectemployee()
	{
		return prop.getProperty("Loc.selectemployee.drpdwn");
		
	}
	
	
	
	
	
	
	
	

}
