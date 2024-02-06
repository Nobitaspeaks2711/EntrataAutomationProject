package Base;



	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class baseClass {
	public WebDriver driver;
		public void launchTheBrowser() {
			
			
			 WebDriverManager.chromedriver().setup();
		        driver = new ChromeDriver();

		        
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        driver.manage().window().maximize();
		        driver.get("https://www.entrata.com");
		  
		
		}
		

}
