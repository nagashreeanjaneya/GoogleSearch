package testScript;


import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.FacebookPagePO;
import pom.GooglePagePO;

public class TestFacebook extends BaseTest {
	@Test
	public void testFacebook() {
		try {
			driver.get(TEST_URL);
			GooglePagePO po =new GooglePagePO(driver);
			po.sendTxt("facebook");
			FacebookPagePO pagePO=new FacebookPagePO(driver);
			Reporter.log("Total no.of links= "+ pagePO.allLinkSize(), true);
			pagePO.firstLink().click();
			/*try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(driver.getTitle());*/
			String eTitle = "Facebook – log in or sign up";
			pagePO.checkTitle(eTitle);
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	}
}
