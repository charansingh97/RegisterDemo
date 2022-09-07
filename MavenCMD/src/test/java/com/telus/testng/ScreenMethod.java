package com.telus.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class ScreenMethod {

  @BeforeMethod
  public void lounchApplication() {
	  System.out.println("Application is lounched ");
  }

  @AfterMethod
  public void closeApplication() {
	  
	  System.out.println("Application is closed ");
  }

  @Test(priority = 1)
  public void navigateRegisterForm() {
	  
	  System.out.println("Register form is open ");
  }
  
  @Test(priority = 2)
  public void navigateToPopUp() {
	  
	  System.out.println("PopUp is display ");
  }
  
  @Test(priority = 3)
  public void navigateToMultipleWindow() {
	  
	  System.out.println("Multiple window are open ");
  }
  
  @Test(priority = 4)
  public void navigateWebTable() {
	  
	  System.out.println("WebTable is open ");
  }
  
}
