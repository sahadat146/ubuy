package assignmentTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.Assignement_2;

public class Assigment_2_Test extends TestBase {
	Assignement_2 asignement_2;
	public Assigment_2_Test() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
			
	}
	@Test
	public void signUpClick() {
		asignement_2=new Assignement_2();
		Assignement_2.getUrl();
		Assignement_2.signUp();
		
	}
}
