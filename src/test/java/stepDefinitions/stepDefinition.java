package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.FileReader;
import java.time.Duration;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefinition {
		
		WebDriver driver = new ChromeDriver();
		JSONParser parser = new JSONParser();
		String[] categories = {"Alimentos y Bebidas", "Libros" , "Electrónicos", "Planea y Ahorra", "Amazon Segunda Vida"};
		
		
		@Given("Amazon web page")
		public void amazon_web_page() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Calam\\Desktop\\SELENIUM\\chromedriver.exe");
		    driver.get("https://www.amazon.com.mx/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.findElement(By.id("nav-hamburger-menu")).click();
		}

		@When("validate categories menu")
		public void validate_categories_menu() {
			for (int i = 0; i < categories.length; i++) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				String element = driver.findElement(By.xpath("//*[contains(text(), '"+ categories[i] +"')]")).getText().toString();
				Assert.assertEquals(categories[i], element);
			}
			}



	
}
