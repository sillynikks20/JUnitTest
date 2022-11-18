package junittestpackage;
import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	junitfunction t = new junitfunction();
	@Test
	public void test() {
		assertEquals( "Regular integer should work", t.AddNumbers(4,5),9);
	}

}