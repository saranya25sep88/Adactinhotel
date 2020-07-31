package AdactinStepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import AdactinBaseclass.BaseClass;
import AdactinPagelocators.LoginPage;
import AdactinPagelocators.Searchpage;
import junit.framework.Assert;

public class Logindatadriven extends BaseClass {	
	
	

	public static void main(String[] args) throws Exception, Throwable {
		LoginPage lp = new LoginPage(driver);
		Searchpage sp = new Searchpage(driver);
		launchBrowser("chrome");		
		getUrl("https://adactin.com/HotelApp/");
		for(int i=1;i<=3;i++)
		{		
		    int j=0;
		    sendvaluestoelement(lp.getUsername(), excelRead(i,j));	
		    Thread.sleep(2000);
			for(j=1;j<=1;j++)
			{
			sendvaluestoelement(lp.getPassword(), excelRead(i, j));	
		    Thread.sleep(2000);
		    {
		    clickonelement(lp.getLogin());
		    }
			}
		}}}
		    /*for(int k=1;k<=3;k++)
			{		
			int l=2;
			if(excelRead(i, l).equals("valid"))
		    {
		     String actual = lp.getGetusershow().getAttribute("value");
		     System.out.println(actual);
		     Assert.assertTrue("actual", true);	
		     clickonelement(lp.getLogout());
		     Thread.sleep(2000);
		    }	
			    else if(excelRead(i, j).equals("invalid")) {    
		  	  boolean contains = driver.getPageSource().contains("to reset your password");	    
		      	 Assert.assertTrue(contains);
		      	 }
		}
		    }
			}}}}	*/	
			
