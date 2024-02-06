package PomClasses;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	public class formFillUp {

		
		//Click on Learn more button
		@FindBy(xpath="(//a[text()='Learn More'])[1]") private WebElement more;
		
		
		//Fill the all form
		
		@FindBy(id="FirstName") private WebElement fn;
		@FindBy(id="LastName") private WebElement ln;
		@FindBy(id="Email") private WebElement email;
		@FindBy(id="Company") private WebElement company;
		@FindBy(xpath="//input[@name='Phone']") private WebElement ph;
		@FindBy(id="Unit_Count__c") private WebElement sel;
		 @FindBy(id="Title") private WebElement title;
		
		
		
		public formFillUp(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void clickOnLearnMore() throws InterruptedException {
			Thread.sleep(3000);
			more.click();
		}
		
		
		public void fillTheForm(WebDriver driver) throws InterruptedException {
			fn.sendKeys("Vaibhav");
			Thread.sleep(1000);
			ln.sendKeys("Auti");
			Thread.sleep(1000);
			email.sendKeys("vaibhavbauti99@gmail.com");
			Thread.sleep(1000);
			company.sendKeys("Affidabile solution PVT LTD");
			Thread.sleep(1000);
			ph.sendKeys("7499167879");
			Thread.sleep(1000);
			
			
			  Select dropdown = new Select(sel);
		         dropdown.selectByIndex(1);
		         title.sendKeys("SDET");
			
			
		         Thread.sleep(1000);
			
		}
		
		
		
	}


