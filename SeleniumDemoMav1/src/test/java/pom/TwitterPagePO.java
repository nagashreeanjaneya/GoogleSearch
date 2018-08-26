package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class TwitterPagePO extends BasePage {

	public TwitterPagePO(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	public int allLinkSize() {
		return allLinks.size();
	}
	
	
	@FindBy(xpath="//a[text()=\"Login on Twitter\"]")
	private WebElement firstLink;
	public WebElement firstLink() {
		return firstLink;
	}
}
