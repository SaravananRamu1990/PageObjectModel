package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LogInTestCase {

	@Test
public void login() throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "D:\\seleniumtut\\chrome driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in");
Thread.sleep(3000);
PageFactory.initElements(driver, LogInPageObjects.class);
LogInPageObjects.signincheckbox.click();
LogInPageObjects.phonenumber.sendKeys("987654321");
LogInPageObjects.phonenumber.submit();
LogInPageObjects.password.sendKeys("********");
LogInPageObjects.password.submit();
LogInPageObjects.signin.click();

}
}