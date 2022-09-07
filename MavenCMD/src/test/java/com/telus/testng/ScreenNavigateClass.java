package com.telus.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ScreenNavigateClass {

  @BeforeClass
  public void lounchApplication() {
	  
	  System.out.println("Application is open ");
  }

  @AfterClass
  public void closeApplication() {
	  
	  System.out.println("Application is close ");
  }
  @Test(priority = 1)
  public void navigateRegisterForm() {
	  
	  System.out.println("Register form open ");

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
