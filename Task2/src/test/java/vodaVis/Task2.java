package vodaVis;


import org.testng.annotations.Test;

import POM.pages;


public class Task2 extends pages {

	@Test(priority = 0)
	public void login() {
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		loginbtn.click();
	}

	@Test(priority = 1)
	public void usersPage() {
		admin.click();
		userManagement.click();
		users.click();

	}

	@Test(priority = 2)
	public void addUser() {
		addBtn.click();
		employeeName.sendKeys("Aaliyah Haq");
		systemUserName.sendKeys("AhmedNaguib");
		systemPassword.sendKeys("Ahmed123");
		systemConfirmPassword.sendKeys("Ahmed123");
		saveBtn.click();
		driver.navigate().refresh();

	}

	@Test(priority = 3)
	public void deleteUser() {
		searchUserName.sendKeys("AhmedNaguib");
		selectCreatedUser.click();
		users.click();
		searchBtn.click();
		deleteBtn.click();
		okBtnToDelete.click();

	}

}
