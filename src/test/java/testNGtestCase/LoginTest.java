package testNGtestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class LoginTest {
    private WebDriver driver;

    
    By uName;
	
	//Locator for password field
	By pswd;
	
	//Locator for login button
	By loginBtn;
    @Test
    
        public void enterUsername(String user) {
            driver.findElement(uName).sendKeys(user);
        }
    
        //Method to enter password
        public void enterPassword(String pass) {
            driver.findElement(pswd).sendKeys(pass);
        }
        
        //Method to click on Login button
        public void clickLogin() {
            driver.findElement(loginBtn).click();
        }
        
        @BeforeTest
            public void Login(WebDriver driver){
                uName = By.id("userName");
	
	//Locator for password field
	pswd = By.id("password");
	
	//Locator for login button
	loginBtn = By.id("login");
            }

    @AfterTest
	public void tearDown() {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.quit();
	}
}
