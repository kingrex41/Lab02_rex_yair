import static org.junit.Assert.assertEquals;

import org.junit.*;

public class Testing {

	public Starter tester = new Starter();
	
	@Before
	public void setUp() {
		tester = new Starter();
	}
	
	@Test
	public void testSum() {
		int test = tester.sum(4,3);
		assertEquals(test,7);
	}
 	
}
