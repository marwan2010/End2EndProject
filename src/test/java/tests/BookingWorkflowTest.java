package tests;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import Objects.HomePage;

public class BookingWorkflowTest extends TestBase {

	HomePage homeObj;

	@Test(priority = 0)

	public void checkSearchCity() {

		homeObj = new HomePage(driver);
		homeObj.click_On_close();
		homeObj.enter_Depart_city("Alexandria");

	}

	@Test(priority = 1)
	public void checkDatePicker() {
		homeObj = new HomePage(driver);
		// Click on the Calendar field
		homeObj.openCalendarButton();
		// Selecting particular date
		homeObj.selectDate("2023-10-01", "2023-10-14");

	}

	@Test(priority = 2)
	public void CheckSearchResult() {

		homeObj.clickOnsearchBtn();

	}
	
	@Test(priority = 3)
	public void checkHotelAvailability() throws InterruptedException  {

		
		homeObj.openBookingDetails("Tolip Hotel Alexandria");

	}
	
	
	@Test(priority = 4)
	public void switchNewtab()    {
		   // hold all window handles in array list
	      ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      //switch to new tab
	      driver.switchTo().window(newTb.get(1));
	    
		

	}
	
	@Test(priority = 5)
	public void SelectBedAndAmount () throws InterruptedException {
		
		homeObj.selectAmount();
	 
		
	}
	
	
	@Test(priority = 6)
	public void NavigateToConfirmation_page  ()  {
	
		homeObj.clicOnReserveBtn2(); 
		
	}

	@Test(priority = 7)
	public void closeBrowser() {
		
		
	
	   driver.quit();

	}
}
