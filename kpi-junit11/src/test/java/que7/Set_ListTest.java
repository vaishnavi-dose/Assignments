package que7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Set_ListTest {
	@Test
	public void set_Test() {
		Set_List s= new Set_List();
		
		assertEquals(207, s.set());
	}
}
