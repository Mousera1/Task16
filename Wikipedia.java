package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wikipedia {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence" + Keys.ENTER);
		driver.findElement(By.id("vector-toc-pinned-container")).click();
		
		System.out.println(driver.getTitle());
	}

}
