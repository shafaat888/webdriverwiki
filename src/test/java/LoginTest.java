import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mhussain\\eclipse-workspace\\Webdriverwiki\\geckodriver.exe" );
		driver=new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L,TimeUnit.SECONDS);
	}
@Test
public void testwiki() throws InterruptedException
{
	//driver.findElement(By.xpath("//*[@id='searchLanguage']")).click();
	Select select=new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
	select.selectByValue("cs");
	Thread.sleep(4000);
}
@AfterTest
public void teardown()
{
	driver.quit();
}
}
