package jenkinsTests;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jenkinsTestTest {

  @Test
  public void mainTest() {
	  WebDriver driver = new ChromeDriver();
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Calam\\Desktop\\SELENIUM\\chromedriver.exe");
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  driver.findElement(By.id("firstName")).sendKeys("Carlos");
	  driver.findElement(By.id("lastName")).sendKeys("Martinez");
	  driver.findElement(By.id("userEmail")).sendKeys("test@test.com");
	  driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
	  driver.findElement(By.id("userNumber")).sendKeys("4443332112");
	  driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
	  driver.findElement(By.id("currentAddress")).sendKeys("Address test");
	  driver.findElement(By.id("submit")).click();
  }
}
