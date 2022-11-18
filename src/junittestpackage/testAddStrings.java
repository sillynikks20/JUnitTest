package junittestpackage;
import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	junitfunction t = new junitfunction();
	@Test
	public void test() {
		assertEquals( "Regular string addition should work", t.AddStrings("a","b"),"ab");
	}

}