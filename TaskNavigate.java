package seleniumjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskNavigate {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().refresh();
		//Object pageTitle = null;
		if (driver.getTitle().contains("STORE")) {
            System.out.println("Page landed on correct website");
        } else {
            System.out.println("Page not landed on correct website");
        }
	}}

