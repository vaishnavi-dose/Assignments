package que6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrListTest {
	@Test
	public void evaluatesExpression() {
		ArrList sl= new ArrList();
		int sol = sl.same_list();
		assertEquals(3,sol);
	}
}
