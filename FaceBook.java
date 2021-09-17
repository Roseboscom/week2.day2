package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Title : " + title);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Rose");
		driver.findElement(By.name("lastname")).sendKeys("Bosco");
		driver.findElement(By.name("reg_email__")).sendKeys("m.rose@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("m.rose@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("mrose@1234");
		
		WebElement dropDown1=driver.findElement(By.id("day"));
		Select drop1=new Select(dropDown1);
		drop1.selectByVisibleText("28");
		
		WebElement dropDown2=driver.findElement(By.id("month"));
		Select drop2=new Select(dropDown2);
		drop2.selectByVisibleText("Mar");
		
		WebElement dropDown3=driver.findElement(By.id("year"));
		Select drop3=new Select(dropDown3);
		drop3.selectByVisibleText("1995");
		
		driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).click();
	}

}
