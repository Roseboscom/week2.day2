package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Title : " + title);

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");

		WebElement loginbtn = driver.findElement(By.className("decorativeSubmit"));
		loginbtn.click();
		String title1 = driver.getTitle();
		System.out.println("Title : " + title1);

		WebElement crmlink = driver.findElement(By.linkText("CRM/SFA"));
		crmlink.click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Vidya");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String title2 = driver.getTitle();
		System.out.println("Title : " + title2);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS new");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2000);

		String s = driver.findElement(By.id("viewLead_companyName_sp")).getText();

		if (s.contains("TCS new"))
			System.out.println("The company name got updated successfully");
		else
			System.out.println("The company name didnot get updated successfully");
		driver.close();

	}

}
