import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testing {


	WebDriver driver = new EdgeDriver();
	String name="standard_user";
	String pass="secret_sauce";
	
	
	@BeforeTest
	public void mysetup() {
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		
	}
	
	@Test(priority = 1 )
	public void login(){
		WebElement usernameInput = driver.findElement(By.id("user-name"));
		WebElement PasswordInput = driver.findElement(By.id("password"));	
		WebElement LoginButton = driver.findElement(By.id("login-button")); 
		usernameInput.sendKeys(name);
		PasswordInput.sendKeys(pass);
		LoginButton.click();
	}
	@Test(priority = 2 )
	public void AddAllItemsToCart() throws InterruptedException {
		
		Thread.sleep(2000);

		
		List<WebElement> all_items = driver.findElements(By.className("btn_primary"));
		for(int i = 0 ; i<all_items.size();i++) {
			
			all_items.get(i).click();
			
		}
		Thread.sleep(2000);
	}
	@Test (priority = 3 )
	public void RemoveAllItemsFromCart() {
		
		List<WebElement> all_added_items = driver.findElements(By.className("btn_secondary"));
		List<WebElement> all_item_names = driver.findElements(By.className("inventory_item_name"));

		for(int i = 0 ; i<all_added_items.size();i++) {
			
			all_added_items.get(i).click();
			System.out.println(all_item_names.get(i).getText()+"has been removed successfully");
			
		}
	}
	
	@AfterTest 
	public void AfterTestingDone() {
		
		driver.close();
		
	}



	
	
}
