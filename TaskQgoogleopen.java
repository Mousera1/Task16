	package seleniumjava;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class TaskQgoogleopen {
	
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(3000);
			
			System.out.println(driver.getTitle());
			
			driver.close();
		}
	
	}