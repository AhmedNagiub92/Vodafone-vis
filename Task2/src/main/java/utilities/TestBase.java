package utilities;

import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;

public class TestBase {
	public  WebDriver driver;
	@BeforeTest
    public  void initialization() 
    {

	System.setProperty("webdriver.chrome.driver",".\\resources\\chromedriver92.exe");
	driver = new ChromeDriver();
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";   
    driver.manage().window().maximize();
    driver.get(baseUrl);

}
	
@AfterTest
public void close() {
	driver.close();
}


}
