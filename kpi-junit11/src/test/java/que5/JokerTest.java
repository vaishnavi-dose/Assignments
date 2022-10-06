package que5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JokerTest {
	@Test
	public void checkTest() {
		Joker j1= new Joker();
		
		String a= j1.Jdance1();
		assertEquals("Bhangda",a);
		
	}
	@Test
	public void checkTest1() {
		Joker j2= new Joker();
		
		String b= j2.Jdance2();
		assertEquals("Garba",b);
		
	}
	@Test
	public void checkTest2() {
		Joker j3= new Joker();
		
		String c= j3.Jdance3();
		assertEquals("Katthak",c);
		
	}
	@Test
	public void checkTest3() {
		Joker j4= new Joker();
		
		String d= j4.Jdance4();
		assertEquals("Odissi",d);
		
	}
	@Test
	public void checkTest4() {
		Joker j5= new Joker();
		
		String e= j5.Jdance5();
		assertEquals("Bharatnatyam",e);
		
	}
	@Test
	public void checkTest5() {
		Joker j6= new Joker();
		
		String f= j6.Jdance6();
		assertEquals("Kuchipudi",f);
		
	}
	@Test
	public void checkTest6() {
		Joker j7= new Joker();
		
		String g= j7.Jdance7();
		assertEquals("Mohiniattam",g);
		
	}
	@Test
	public void checkTest7() {
		Joker j8= new Joker();
		
		String h= j8.Jdance8();
		assertEquals("Sattriya",h);
		
	}
}
