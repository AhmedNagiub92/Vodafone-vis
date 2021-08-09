package Voda_Vis.Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;


public class Task2 
{
    public static void main( String[] args ) throws InterruptedException
    {

    			System.setProperty("webdriver.chrome.driver",".\\resources\\chromedriver92.exe");
    			WebDriver driver = new ChromeDriver();
    	        String baseUrl = "https://opensource-demo.orangehrmlive.com/";   
    	        driver.manage().window().maximize();
    	        driver.get(baseUrl);
    	        WebElement userName= driver.findElement(By.id("txtUsername"));
    	        WebElement password= driver.findElement(By.id("txtPassword"));
    	        userName.sendKeys("Admin");
    	        password.sendKeys("admin123");
    	        WebElement loginbtn= driver.findElement(By.id("btnLogin"));
    	        loginbtn.click();
    	        WebElement admin= driver.findElement(By.id("menu_admin_viewAdminModule"));
    	        admin.click();
    	        WebElement userManagement= driver.findElement(By.id("menu_admin_UserManagement"));
    	        userManagement.click();
    	        WebElement users= driver.findElement(By.id("menu_admin_viewSystemUsers"));
    	        users.click();
    	        WebElement addBtn= driver.findElement(By.id("btnAdd"));
    	        addBtn.click();
    	        WebElement employeeName= driver.findElement(By.id("systemUser_employeeName_empName"));
    	        employeeName.sendKeys("Aaliyah Haq");
    	        WebElement systemUserName= driver.findElement(By.id("systemUser_userName"));
    	        systemUserName.sendKeys("AhmedNaguib");
    	        WebElement systemPassword= driver.findElement(By.id("systemUser_password"));
    	        systemPassword.sendKeys("Ahmed123");
    	        WebElement systemConfirmPassword= driver.findElement(By.id("systemUser_confirmPassword"));
    	        systemConfirmPassword.sendKeys("Ahmed123");
    	        WebElement saveBtn= driver.findElement(By.id("btnSave"));
    	        saveBtn.click();
    	        driver.navigate().refresh();
    	        Thread.sleep(1000);
    	        WebElement searchUserName= driver.findElement(By.id("searchSystemUser_userName"));
    	        searchUserName.sendKeys("AhmedNaguib");
    	        WebElement searchBtn= driver.findElement(By.id("searchBtn"));
    	        searchBtn.click();
    	        WebElement selectCreatedUser= driver.findElement(By.id("ohrmList_chkSelectRecord_52"));
    	        selectCreatedUser.click();
    	        WebElement deleteBtn= driver.findElement(By.id("btnDelete"));
    	        deleteBtn.click();
    	        WebElement okBtnToDelete= driver.findElement(By.id("dialogDeleteBtn"));
    	        okBtnToDelete.click();
    	        driver.close();
    	     
    }
}
