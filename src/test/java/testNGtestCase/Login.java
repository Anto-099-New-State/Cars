package testNGtestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws InterruptedException{
        //System.setProperty("webdriver.chrome.driver","");		
        WebDriver driver = new ChromeDriver();
		driver.get("https://localhost:3000");
        LoginTest logt = new LoginTest();

        driver.findElement(By.xpath("")).click();

        logt.enterUsername("---Your Username---");
		logt.enterPassword("---Your Password---");
		
		//Click on login button
		logt.clickLogin();
        
    }

}
