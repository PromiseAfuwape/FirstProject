package firstAutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws Exception {
		// Create a new instance of the Chrome driver
				System.setProperty("webdriver.chrome.driver","C:\\Users\\pafuwape\\eclipse-workspace\\FirstProject\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
		        //Launch the Online Store Website
				driver.get("http://www.store.demoqa.com");
		 
		        // Print a Log In message to the screen
		        System.out.println("Successfully opened the website www.Store.Demoqa.com");
		 
				//Wait for 5 Sec
				Thread.sleep(5000);
				
		        // Close the driver
		        driver.quit();

	}

}
