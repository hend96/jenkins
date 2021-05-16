package Test;

import org.testng.annotations.Test;

import POM.BaseClass;
import POM.PreHome;

public class TestPreHome extends BaseClass {
	PreHome p;

	@Test
	public void clickOnBtn() {
		
		 p=new PreHome();
		 p.clickOnLoginBtn();
		
		
	}

}
