import static org.junit.jupiter.api.Assertions.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;

@RunWith(JUnit4.class)
class LoginTest {
	
	static WebDriver driver=new FirefoxDriver();
/*
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		Util u = new Util();
		u.Screenshot1(driver);
		
	}
*/

	static void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Swati\\workspace\\selenium-java-3.0.0-beta2\\lib\\geckodriver.exe");
		driver.get("http://demo.guru99.com/V4/");
	    //String actualTitle = driver.getTitle();
	      
	   
	}


	static  void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	static void Logintest1() throws Exception {
		
		setUp();
		String actualTitle = Login.Login("mngr108288", "Ypuzege", driver);
		 assertEquals("Guru99 Bank Manager HomePage", actualTitle, "Title found" );
		 assertEquals(driver.findElement(By.xpath("//*[@id='errorMessage']")).getText(),"Wrong username or password!");
		 tearDown();
	}
	
	@Test
	static void Logintest2() throws Exception {
		
		setUp();
		String actualTitle = Login.Login("mngr108280", "Ypuzegi", driver);
		 assertEquals("Guru99 Bank Manager HomePage", actualTitle, "Title found" );
		 assertEquals(driver.findElement(By.xpath("//*[@id='errorMessage']")).getText(),"Wrong username or password!");
		 tearDown();
	}
	
	@Test
	static void Logintest3() throws Exception {
		
		setUp();
		String actualTitle = Login.Login("mngr10828u", "Ypuzegi", driver);
		 assertEquals("Guru99 Bank Manager HomePage", actualTitle, "Title found" );
		 assertEquals(driver.findElement(By.xpath("//*[@id='errorMessage']")).getText(),"Wrong username or password!");
		 tearDown();
	}

	@Test
	public void Logintest4() throws Exception {
		
		setUp();
		String actualTitle = Login.Login("mngr108280", "Ypuzege", driver);
		 assertEquals("Guru99 Bank Manager HomePage", actualTitle, "Title found" );
		 assertEquals(driver.findElement(By.xpath("//*[@id='errorMessage']")).getText(),"Wrong username or password!");
		 tearDown();
	
	}
}
