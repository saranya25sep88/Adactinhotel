package AdactinPagelocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver driver;
	
	public LoginPage(WebDriver Idriver)
	{
		this.driver= Idriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;
	
	@FindBy(id="username_show")
	private WebElement getusershow;
	
	@FindBy(linkText="Logout")
	private WebElement logout;	
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	public WebElement getGetusershow() {
		return getusershow;
	}

	public WebElement getLogout() {
		return logout;
	}		
}
