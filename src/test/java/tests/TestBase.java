package tests;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import com.github.javafaker.Faker;

public class TestBase {

	public static WebDriver driver;
	public static Actions action;
	JavascriptExecutor js;
	protected Faker faker = new Faker(new Locale("en-US"));
	String baseUrl = "https://www.booking.com/index.en.html";
	// Store current project workspace location in a string variable ‘path’
	String workingDir = System.getProperty("user.dir");
	String driverPath = workingDir + "\\drivers\\chromedriver.exe";
	String autoIt = workingDir + "\\drivers\\";

	@SuppressWarnings("deprecation")
	@BeforeSuite
	public void startDriver() {
		// Mention the location of GeckoDriver in localsystem
		System.setProperty("webdriver.chrome.driver", driverPath);
		// Object is created- Chrome browser is opened
		driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// Open Site in new chrome window
		driver.get(baseUrl);
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

}
