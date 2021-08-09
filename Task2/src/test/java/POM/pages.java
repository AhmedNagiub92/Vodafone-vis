package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.TestBase;

public class pages extends TestBase {
	
	
	public WebElement   userName= driver.findElement(By.id("txtUsername"));
	public   WebElement password= driver.findElement(By.id("txtPassword"));
	public   WebElement loginbtn= driver.findElement(By.id("btnLogin"));
	public   WebElement admin= driver.findElement(By.id("menu_admin_viewAdminModule"));
	public  WebElement userManagement= driver.findElement(By.id("menu_admin_UserManagement"));
	public  WebElement users= driver.findElement(By.id("menu_admin_viewSystemUsers"));
	public  WebElement addBtn= driver.findElement(By.id("btnAdd"));
	public  WebElement employeeName= driver.findElement(By.id("systemUser_employeeName_empName"));
	public  WebElement systemUserName= driver.findElement(By.id("systemUser_userName"));
	public WebElement systemPassword= driver.findElement(By.id("systemUser_password"));
	public WebElement systemConfirmPassword= driver.findElement(By.id("systemUser_confirmPassword"));
	public WebElement saveBtn= driver.findElement(By.id("btnSave"));
	public WebElement searchUserName= driver.findElement(By.id("searchSystemUser_userName"));
	public WebElement searchBtn= driver.findElement(By.id("searchBtn"));
	public WebElement selectCreatedUser= driver.findElement(By.id("ohrmList_chkSelectRecord_52"));
	public WebElement deleteBtn= driver.findElement(By.id("btnDelete"));
	public WebElement okBtnToDelete= driver.findElement(By.id("dialogDeleteBtn"));
}
