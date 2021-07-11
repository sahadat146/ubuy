package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo2 {
    @Test
	public void test5() {
		System.out.println("im inside test 5");
	}
    @Test
	public void test6() {
		System.out.println("im inside test 6");
	Assert.assertTrue(false);
    }
    @Test

	public void test7() {
		System.out.println("im inside test 7");
	throw new SkipException(" this test is skipped");
    }

    @Test
	public void test8() {
		System.out.println("im inside test 8");
	}
}
