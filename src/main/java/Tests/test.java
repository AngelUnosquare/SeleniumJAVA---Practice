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
    
        
        try {
        	 WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
             searchBox.sendKeys(querySearch);
		} catch (Exception e) {
			System.out.println("No se encontró el elemento de busqueda");
		}
        
        try {
            WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
            searchButton.click();
		} catch (Exception e) {
			System.out.println("No se encontró el elemento para hacer click");
		}
        
        try {
            WebElement firstResult = driver.findElement(By.tagName("data-csa-c-pos"));
            firstResult.click();
        } catch (Exception e) {
        	System.out.println(e + " No se encontró el primer resultado");
        }

  }
}
