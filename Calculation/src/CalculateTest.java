import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class CalculateTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link Calculate#add(java.lang.String)}.
	 */
	@Test
	public void testAdd() {
		assertEquals(Calculate.add("0"), 0);
		assertEquals(Calculate.add(""), 0);
		assertEquals(Calculate.add("0,1,22,3"), 26);
		assertEquals(Calculate.add("1"), 1);
		assertEquals(Calculate.add("1\n2;3\n4,5,6"), 21);
		assertEquals(Calculate.add("1\n2;3\n4,1001,5,6"), 21);
		assertEquals(Calculate.add("1\n2;3\n4,1001,5%%%%6"), 21);
		assertEquals(Calculate.add("1\n2;3\n4,1001,5%%%%6***3"), 24);
		assertEquals(Calculate.add("1,\n"), 1);
	}

}
