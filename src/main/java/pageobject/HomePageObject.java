package pageobject;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageObject extends BasepageAutomationPractices {
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement Womentab;
	
	public WebElement getWomentab() {
		return Womentab;
	}
	
	@FindBy(xpath ="//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement Dressestab;
	
	public WebElement getDressestab() {
		return Dressestab;
	}
	
	@FindBy(xpath ="//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement Tshirt;
	
	public WebElement getTshirttab() {
		return Tshirt;
	}
	
	
	@FindBy(xpath="//*[@id='center_column']/h1/span[2]")
	private WebElement textcount;
	
	public WebElement gettextcount() {
		return textcount;
	}
		
	
	public void clicktagwomen() {
		Womentab.click();
	}
	
	public void clicktagdresses() {
		Dressestab.click();
	}
	
	public void clicktagTshirt() {
		Tshirt .click();
	}
	
	@FindBy(id = "newsletter-input")
	private WebElement Newsletter;
	
	public void setNewsletter() {
		setText(Newsletter, "sathyaprakashcr01@gmail.com");
	}
	
	@FindBy(name = "submitNewsletter")
	private WebElement pressbutton;
	
	public void clickbutton() {
		pressbutton.click();
	}
	
	@FindBy(xpath="//*[@id='columns']/p")
	private WebElement message;
	
	public String getmessage() {
		String mess =message.getText();
		return mess;
		
	}
	
	@FindBy(xpath="//*[@id='header_logo']/a/img")
	private WebElement homeLogo;
	
	public void clickhomelogo() {
		homeLogo.click();
	}
	
	
	
	
}


