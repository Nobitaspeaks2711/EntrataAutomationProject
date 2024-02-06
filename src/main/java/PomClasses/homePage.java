package PomClasses;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class homePage {

	//Click on cookies
	@FindBy(xpath="//button[text()='Accept Cookies']") private WebElement cooki;
	
	
	//click on MArketing
	@FindBy(xpath="(//div[@class='content-cap'])[5]")private WebElement scroll;
	@FindBy(xpath="//div[@title='Marketing & Leasing Explore Link']")private WebElement leasing;
	
	
	//verify logo using assertion
	
	//@FindBy(xpath ="//img[@id='Header_Logo']")private WebElement logo;
	
	
	public homePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCookies() throws InterruptedException {
		Thread.sleep(1500);
		cooki.click();
	
	}
	
	/*public void verifyLogo(WebDriver driver) {
				    
		    String actualHeaderText = logo.getText();

		    
		    String expectedHeaderText = "entrata";

		    // Assert that the actual text matches the expected text
		    Assert.assertEquals(actualHeaderText, expectedHeaderText, "Header text mismatch");*/
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void moveUptoLeasing(WebDriver driver) throws InterruptedException {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
	        js.executeScript("arguments[0].scrollIntoView(true);", scroll);
	        Thread.sleep(3000);
		
	}
	
	
	
	public void clickOnLeasing() {
		
		leasing.click();
		
		
	}

	
	
}


