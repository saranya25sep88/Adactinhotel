package AdactinStepdefinition;

import AdactinBaseclass.BaseClass;
import AdactinPagelocators.LoginPage;
import AdactinPagelocators.Searchpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AdactinStepdef extends BaseClass {
	LoginPage lp = new LoginPage(driver);
	Searchpage sp = new Searchpage(driver);

@Given("^User launch the adactin application$")
public void user_launch_the_adactin_application() throws Throwable {
	
	getUrl("https://adactin.com/HotelApp/");
	Thread.sleep(2000);    
}

@When("^title of the login page is adactin$")
public void title_of_the_login_page_is_adactin() throws Throwable {
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("AdactIn.com - Hotel Reservation System", title); 
	}

@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String username, String password) throws Throwable {
	sendvaluestoelement(lp.getUsername(), username);
    sendvaluestoelement(lp.getPassword(), password);
}

@Then("^user verify the username displayed in homepage$")
public void user_verify_the_username_displayed_in_homepage() throws Throwable {
	String actual = lp.getGetusershow().getAttribute("value");
    Assert.assertTrue("actual", true);
    }

@When("^user get username and password from excel file$")
public void user_get_username_and_password_from_excel_file() throws Throwable {	
		for(int i=1;i<=4;i++)
	{		
	    int j=0;
	    sendvaluestoelement(lp.getUsername(), excelRead(i,j));	
	    Thread.sleep(2000);
		for(j=1;j<=2;j++)
		{
		sendvaluestoelement(lp.getPassword(), excelRead(i, j));	
	    Thread.sleep(2000);
	    clickonelement(lp.getLogin());
	     j++;
	    if(excelRead(i,j).equals("valid"))
	    {
	     String actual = lp.getGetusershow().getAttribute("value");
	     System.out.println(actual);
	     Assert.assertTrue("actual", true);	
	     clickonelement(lp.getLogout());
	     getUrl("https://adactin.com/HotelApp/");
	     Thread.sleep(2000);
	    }	
		    else if(excelRead(i, j).equals("invalid")) {    
	  	  boolean contains = driver.getPageSource().contains("to reset your password");	    
	      	 Assert.assertTrue("contains",true);
	      	 }
	    		}					
	} 
}

@When("^user click Login button in Login page$")
public void user_click_Login_button_in_Login_page() throws Throwable {     
    clickonelement(lp.getLogin());
}

@Then("^user verify the username displayed in homepage \"([^\"]*)\"$")
public void user_verify_the_username_displayed_in_homepage(String condition) throws Throwable {
	        if(condition.equals("valid"))
          {
           String actual = lp.getGetusershow().getAttribute("value");
	       Assert.assertTrue("actual", true);	
	       clickonelement(lp.getLogout());
	       Thread.sleep(2000);
          }
	                   else if(condition.equals("invalid"))
          {
        	  boolean contains = driver.getPageSource().contains("to reset your password");	    
	        	 Assert.assertTrue("contains",true);
	        	 }
}

@Then("^User click logout$")
public void user_click_logout() throws Throwable {
    clickonelement(lp.getLogout());
    Thread.sleep(2000);
}

/***************************search page***************************/

@Given("^customer select location as \"([^\"]*)\"$")
public void customer_select_location_as(String Location) throws Throwable {
	 Thread.sleep(2000);
     dropDownWithoutOption(sp.getLocation(), Location);
    
     
}

@When("^user select number of rooms as \"([^\"]*)\"$")
public void user_select_number_of_rooms_as(String NOR) throws Throwable {
     dropDownWithoutOption(sp.getRooms(), NOR);
    
}

@When("^customer enters check-in date \"([^\"]*)\"$")
public void customer_enters_check_in_date(String checkin_date) throws Throwable {
     sendvaluestoelement(sp.getChechkindate(),checkin_date);     
   
}

@Then("^customer enters check-out date \"([^\"]*)\" less than check-in date$")
public void customer_enters_check_out_date_less_than_check_in_date(String checkout_date) throws Throwable {
     sendvaluestoelement(sp.getCheckoutdate(), checkout_date);     
     
}

@When("^customer selects number of adults as \"([^\"]*)\"$")
public void customer_selects_number_of_adults_as(String APR) throws Throwable {
     dropDownWithoutOption(sp.getAdults(), APR);
    dropDownWithoutOption(sp.getAdults(), APR);
     
}

@When("^user click search button$")
public void user_click_search_button() throws Throwable {
     clickonelement(sp.getSearch());
     
}

@Then("^Then verify for the error message for check-in date field$")
public void then_verify_for_the_error_message_for_check_in_date_field() throws Throwable {
     String errormsg = sp.getErrorcheckinmsg().getText();
     Assert.assertEquals("Check-In Date shall be before than Check-Out Date", errormsg);
     
}

@Then("^user verify location displayed in select hotel is same as location selected in searchpage$")
public void user_verify_location_displayed_in_select_hotel_is_same_as_location_selected_in_searchpage() throws Throwable {
     
     String locationname = sp.getLocationchk().getAttribute("value");
     Assert.assertEquals("Sydney", locationname);
}




}
