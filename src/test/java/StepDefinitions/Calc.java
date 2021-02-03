package StepDefinitions;
//import java.awt.List;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calc {
	
	public WebDriver driver;
	

	@Given("^User launce Chrome Browser$")
	public void launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "/Users/prijay/desktop/APIProject/cucumbertest/Chrome/chromedriver");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
	}

	@When("User Opens url {string}")
	public void user_opens_URL(String url) {
		driver.get(url);
	}

	@And("User enters Google Mortgage Calculator and click search")
	public void user_enters_text() {
		WebElement element =driver.findElement(By.name("q"));
		element.sendKeys("google mortgage calculator");
		element.submit();
	}
	
	@Then("Mortgage Calculator is displayed")
	public void MC_displayed() {
		try
	    {
	        WebElement element = driver.findElement(By.className("uJHgu"));

	        if(element.isDisplayed() && element.isEnabled())
	        {
	            System.out.println("element is present");
	        }
	    }
	    catch(Exception e)
	    {
	    	 System.out.println("element is not present");
	    }
	}
	
	
	
	@And("close the browser")
	public void browser_close()
	{
		driver.close();
	}
	@And("Enter the amount and interest rate")
	public void user_enters_allfields() {
		
		driver.findElement(By.xpath("//input[@jsname='VNcJBd']")).clear();
		driver.findElement(By.xpath("//input[@jsname='VNcJBd']")).sendKeys("1000");
		
		// Enter value 4 in the interest rate  of the Mortgage Calculator
		driver.findElement(By.xpath("//input[@jsname='gSvteb']")).clear();
		driver.findElement(By.xpath("//input[@jsname='gSvteb']")).sendKeys("4");
		

		
	}
	@And("Enter the invalid mortgage amount and valid interest rate")
	public void user_enters_invalidamount(){
		// Enter value 1000 in the mortgage amount of the Mortgage Calculator
//		driver.findElement(By.xpath("//label[text()='Mortgage amount']/following-sibling::input")).sendKeys("amount to be sent");
//		driver.findElement(By.xpath("//label[text()='Mortgage amount']/preceding-sibling::input")).getAttribute("class");
		
		driver.findElement(By.xpath("//input[@jsname='VNcJBd']")).clear();
		driver.findElement(By.xpath("//input[@jsname='VNcJBd']")).sendKeys("ABC");
		
		// Enter value 4 in the interest rate  of the Mortgage Calculator
		driver.findElement(By.xpath("//input[@jsname='gSvteb']")).clear();
		driver.findElement(By.xpath("//input[@jsname='gSvteb']")).sendKeys("4");
	}
	@And("Enter the mortgage amount and invalid interest rate")
	public void user_enters_invalidinterest(){
		// Enter value 1000 in the mortgage amount of the Mortgage Calculator
//		driver.findElement(By.xpath("//label[text()='Mortgage amount']/following-sibling::input")).sendKeys("amount to be sent");
//		driver.findElement(By.xpath("//label[text()='Mortgage amount']/preceding-sibling::input")).getAttribute("class");
		
		driver.findElement(By.xpath("//input[@jsname='VNcJBd']")).clear();
		driver.findElement(By.xpath("//input[@jsname='VNcJBd']")).sendKeys("1000");
		
		// Enter value 4 in the interest rate  of the Mortgage Calculator
		driver.findElement(By.xpath("//input[@jsname='gSvteb']")).clear();
		driver.findElement(By.xpath("//input[@jsname='gSvteb']")).sendKeys("ABC"); //System takes default value to zero for invalid input
		
		
	}
	
	@Then("Check the Monthly payments")
	public void check_the_payment()
	{
	String result = driver.findElement(By.xpath("//div[@jsname='WXEYme']")).getText();
	// Print a Log In message to the screen
	System.out.println(" The Result is " + result);

	 if(result.equals("%5"))
	 {
	 System.out.println(" The Result is Pass");
	 }
	 else
	 {
	 System.out.println(" The Result is Fail");
	 }
	 }
	
	@Then("No amount is displayed")
		public void invalidentry()
		{
		String result = driver.findElement(By.xpath("//div[@jsname='WXEYme']")).getText();
		// Print a Log In message to the screen
		System.out.println(" The Result is " + result);

		 if(result.equals("NA"))
		 {
		 System.out.println(" The Result is Pass");
		 }
		 else
		 {
		 System.out.println(" The Result is Fail");
		 }
		 }
		
		
	
@Then("check the monthly payments for default interest rate value")
public void default_interest_value()
{
String result = driver.findElement(By.xpath("//div[@jsname='WXEYme']")).getText();
// Print a Log In message to the screen
System.out.println(" The Result is " + result);

 if(result.equals("NA"))
 {
 System.out.println(" The Result is Pass");
 }
 else
 {
 System.out.println(" The Result is Fail");
 }
 }


}

