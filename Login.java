import java.util.concurrent.TimeUnit;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.*;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	
public class Login {
	
	public static String  Login(String Uname, String Password, WebDriver driver)
	{
		String actualTitle;
		 WebElement username = driver.findElement(By.name("uid"));
		    username.sendKeys(Uname);
		    WebElement password = driver.findElement(By.name("password"));
		    password.sendKeys(Password);
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.findElement(By.name("btnLogin")).click();
		 	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 	actualTitle = driver.getTitle();
		 	
		 	return actualTitle;
	}

	
}
