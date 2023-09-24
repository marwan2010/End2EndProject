 	package Objects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PagesBase {

	protected WebDriver driver;
	public   Actions action;
    public static WebDriverWait wait;
    
    static WebElement element = null;
    JavascriptExecutor js ;	
    

    

	
	public PagesBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action= new Actions(driver);
		 wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        js=(JavascriptExecutor)driver;	
       	
		
	}
	
	
	protected static void clickButton (WebElement button) {
		 wait.until(ExpectedConditions.visibilityOf(button));
	        
		button.click();
	}
	
	protected static void setTextElementText (WebElement textElement,String Value) {
		  wait.until(ExpectedConditions.visibilityOf(textElement));
		  textElement.clear();
		  textElement.sendKeys(Value);
}
	

	
	
	
	
	
	
	
	
    public void waitVisibility(WebElement elementBy) {
        wait.until(ExpectedConditions.visibilityOf(elementBy));
    }


    
    


    
    

}
