package AdactinPagelocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpage {
	
public WebDriver driver;
	
	public Searchpage(WebDriver Idriver)
	{
		this.driver= Idriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="room_nos")
	private WebElement rooms;
	
	@FindBy(id="datepick_in")
	private WebElement chechkindate;
	
	@FindBy(id="datepick_out")
	private WebElement checkoutdate;
	
	@FindBy(id="adult_room")
	private WebElement adults;
		
	@FindBy(id="Submit")
	private WebElement search;
	
	@FindBy(id="checkin_span")
	private WebElement errorcheckinmsg;
	
	@FindBy(id="location_1")
	private WebElement locationchk;

	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getChechkindate() {
		return chechkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getSearch() {
		return search;
	}
	
	public WebElement getErrorcheckinmsg() {
		return errorcheckinmsg;
	}	
		public WebElement getLocationchk() {
			return locationchk;
		}

	}
	
	


