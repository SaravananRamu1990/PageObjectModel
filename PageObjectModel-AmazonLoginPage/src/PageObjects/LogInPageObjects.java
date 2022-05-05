package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPageObjects {
	@FindBy(id = "nav-link-accountList-nav-line-1")
	public static WebElement signincheckbox;
	@FindBy(name = "email")
	public static WebElement phonenumber;
	@FindBy(name = "password")
	public static WebElement password;
	@FindBy(id = "signInSubmit")
	public static WebElement signin;
	
}