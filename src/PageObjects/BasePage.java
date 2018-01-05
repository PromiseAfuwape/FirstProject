package PageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

		public BasePage() {}
	protected static WebDriver _driver;
	protected static String BaseURL = "";
	
	public BasePage(WebDriver driver)
    {
        _driver = driver;
        PageFactory.initElements(_driver, this);
    }
	
    @BeforeClass 
    public static void setUp(){ 
    	_driver = new ChromeDriver(); 
    	_driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); } 
    
    @After public void cleanUp(){ 
    	_driver.manage().deleteAllCookies(); } 
    
    @AfterClass public static void tearDown(){ 
    	_driver.close();
    }
    public void OpenPage(String url){
        _driver.navigate().to(url);
    }
}
