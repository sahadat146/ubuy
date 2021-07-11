package assignmentTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.Assignement_1;

public class Assignment_1_Test extends TestBase {
	Assignement_1 assignement_1;
public Assignment_1_Test() {
	super();
		
	}
@BeforeTest
public void setUp() {
	initialization();
	
}
@Test
public void PageTitleTest() throws InterruptedException {
	
	assignement_1 =new Assignement_1();
	Assignement_1.verifypageTitle();
	assignement_1.navigateBrowser();
	
}

}
