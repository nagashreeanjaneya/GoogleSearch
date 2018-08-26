package testScript;

import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GooglePagePO;
import pom.TwitterPagePO;

public class TestTwitter extends BaseTest {
	@Test
	public void testTwitter() {
		try {
			driver.get(TEST_URL);
			GooglePagePO googlePagePO =new GooglePagePO(driver);
			googlePagePO.sendTxt("twitter");
			TwitterPagePO pagePO =new TwitterPagePO(driver);
			Reporter.log("Total no of links = "+pagePO.allLinkSize(), true);
			pagePO.firstLink().click();
			/*try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(driver.getTitle());*/
			String eTitle = "Login on Twitter";
			pagePO.checkTitle(eTitle);
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	}
}
