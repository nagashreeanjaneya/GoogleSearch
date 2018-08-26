package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class FacebookPagePO extends BasePage {

	public FacebookPagePO(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	public int allLinkSize() {
		return allLinks.size();
	}
	
	@FindBy(xpath="//a[@href='https://www.facebook.com/']")
	private WebElement firstLink;
	public WebElement firstLink() {
		return firstLink;
	}
	
}
