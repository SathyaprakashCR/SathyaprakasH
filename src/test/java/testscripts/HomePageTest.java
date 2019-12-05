package testscripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobject.BasepageAutomationPractices;
import pageobject.HomePageObject;

public class HomePageTest extends BasepageAutomationPractices {

	HomePageObject hp;

	BasepageAutomationPractices bp;
	//Boolean = true;

	public HomePageTest() {
		hp =new HomePageObject();
		bp =new BasepageAutomationPractices();
		
	}
	
	@BeforeMethod (enabled=false)
	public void verifyhomologo() {
		hp.clickhomelogo();
		System.out.println(" homelogo ");
	}
	
@Test(enabled=false)

public void VerifyTag() {
	Assert.assertTrue(bp.elementFound(hp.getWomentab()));
	
	Assert.assertTrue(bp.elementFound(hp.getDressestab()));
	
	Assert.assertTrue(bp.elementFound(hp.getTshirttab()));
	
}

@Test
public void verifynavigation1() {
	hp.clicktagwomen();
	Assert.assertTrue(bp.getTitle().contains("Women"));
	hp.clicktagdresses();
	Assert.assertTrue(bp.getTitle().contains("Dresses"));
	hp.clicktagTshirt();
	Assert.assertTrue(hp.elementFound(hp.getTshirttab()));
}
//@Test
//public void verifynavigation2() {
	//hp.clicktagdresses();
	//Assert.assertTrue(bp.getTitle().contains("Dresses"));
//}

//@Test
//public void verifynavigation3() {
//	hp.clicktagTshirt();
//	Assert.assertTrue(hp.elementFound(hp.getTshirttab()));
//}

@Test(enabled=false)
public void verifymailid() {
	hp.setNewsletter();
	hp.clickbutton();
	Assert.assertTrue(hp.getmessage().contains("already registered"));
	
	
}


}