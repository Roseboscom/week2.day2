package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.name("UserFirstName")).sendKeys("Rose");
		driver.findElement(By.name("UserLastName")).sendKeys("Bosco");
		driver.findElement(By.name("UserEmail")).sendKeys("roseboscom@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("TCS");
		driver.findElement(By.name("UserPhone")).sendKeys("906148598");

		WebElement dropDown1 = driver.findElement(By.name("UserTitle"));
		Select drop1 = new Select(dropDown1);
		drop1.selectByVisibleText("IT Manager");

		WebElement dropDown2 = driver.findElement(By.name("CompanyEmployees"));
		Select drop2 = new Select(dropDown2);
		drop2.selectByVisibleText("15 - 100 employees");
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();

		WebElement dropDown3 = driver.findElement(By.name("CompanyCountry"));
		Select drop3 = new Select(dropDown3);
		drop3.selectByVisibleText("American Samoa");
		

		driver.close();

	}

}
