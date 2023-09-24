package Objects;

import java.time.LocalDateTime;
import java.util.List;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class HomePage extends PagesBase {
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e f4552b6561']")
	WebElement b2indexPage;

	@FindBy(name = "ss")
	WebElement txt_destination;

	@FindBy(xpath = "//span[@class='fcd9eec8fb a804864eef c2cc050fb8 c696a7d242']")
	WebElement picker;

	@FindBy(xpath = "//button[@class='a83ed08757 c21c56c305 a4c1805887 f671049264 d2529514af c082d89982 aa11d0d5cd']")
	WebElement btnsearch;

	@FindBy(xpath = "//span[@class='cf06f772fa']")
	List<WebElement> activedate;
	@FindBy(xpath = "//ol[contains(@class, 'ef2dbaeb17')]")
	WebElement ul_element;

	@FindBy(xpath = "//li[contains(@class, 'b16a89683f')]")
	List<WebElement> allpages;

	@FindBy(xpath = "//div[@data-testid='title']")
	List<WebElement> hotel_titles;

	@FindBy(xpath = "//a[@data-testid='availability-cta-btn']")
	List<WebElement> availability_btn;
	@FindBy(id = "hp_book_now_button")
	WebElement book;

	@FindBy(xpath = "//a[@data-testid='select-room-trigger']")
	WebElement selectroom;

	@FindBy(xpath = "//*[@id=\"group_recommendation\"]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/a")
	WebElement button__text;

	@FindBy(xpath = "//button[@class='txp-bui-main-pp bui-button bui-button--primary  hp_rt_input px--fw-cta js-reservation-button']")
	WebElement SubmitBtn;

	@FindBy(xpath = "//span[@class='bui-date__title']")
	List<WebElement> date_title;

	public void enter_Depart_city(String value)

	{

		setTextElementText(txt_destination, value);
	}

	public void click_On_close()

	{

		clickButton(b2indexPage);

	}

	public void openCalendarButton()

	{

		clickButton(picker);

	}

	public void selectDate(String dateToSelect, String dateToReturn)

	{
		String firstDate = dateToSelect;
		String returnDate = dateToReturn;

		// Getting list of the active dates and iterating one by one

		for (WebElement ele : activedate) {

			WebElement checkIn = ele.findElement(By.xpath("//span[@data-date='" + firstDate + "']"));
			WebElement checkOut = ele.findElement(By.xpath("//span[@data-date='" + returnDate + "']"));

			if (checkIn.isDisplayed() && checkOut.isDisplayed()) {
				checkIn.click();
				checkOut.click();
				break;
			}

		}

	}

	public void clickOnsearchBtn()

	{

		clickButton(btnsearch);

	}

	public void openBookingDetails(String value) throws InterruptedException

	{

		for (WebElement ele : hotel_titles) {

			if (ele.getText().contains(value)) {

				break;

			} else {

				allpages.get(1).click();

				Thread.sleep(5000); // Just to demo a long running task of 4 seconds.

				for (WebElement var : hotel_titles) {
					if (var.getText().contains(value)) {
						var.click();

					}

				}

				break;
			}
		}
	}

	public void selectAmount() throws InterruptedException

	{
		Thread.sleep(5000); // Just to demo a long running task of 4 seconds.

		clickButton(book);
		Select drop = new Select(selectroom);

		drop.selectByIndex(1);

	}

	public void clicOnReserveBtn()

	{
		clickButton(button__text);
	}

	public void clicOnReserveBtn2()

	{
		clickButton(SubmitBtn);
	}

	
		
	
		 
	
}

	
