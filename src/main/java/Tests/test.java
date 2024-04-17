package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Calam\\Desktop\\SELENIUM\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        String querySearch = "Iphone 15 Pro Max";
        
        driver.get("https://www.amazon.com.mx/");
        driver.manage().window().maximize();
    
        
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        
        searchBox.sendKeys(querySearch);
        searchButton.click();
        
        WebElement firstResult = driver.findElement(By.tagName("data-csa-c-pos"));
        firstResult.click();
	}

}
