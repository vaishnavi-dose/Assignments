package ques_6OctAss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmpChildTest {

	@Test
	public void Diksha() {
		Emp_Diksha d = new Emp_Diksha();
		
		String en= d.emp_name();
		int ei= d.emp_id();
		String g= d.gender();
		int ea= d.emp_age();
		String er= d.emp_role();
		String em= d.emp_Mail();
		String eadd= d.emp_address();
		int s= d.salary();
				
		assertEquals("Diksha Patil",en);
		assertEquals(9175,ei);
		assertEquals("Female",g);
		assertEquals(22,ea);
		assertEquals("Ios Developer",er);
		assertEquals("abc@gmail.com",em);
		assertEquals("Kusumba,Jlg",eadd);
		assertEquals(29000,s);
	}
	
	@Test
	public void Dipak() {
		Emp_Dipak di = new Emp_Dipak();
		
		String en= di.emp_name();
		int ei= di.emp_id();
		String g= di.gender();
		int ea= di.emp_age();
		String er= di.emp_role();
		String em= di.emp_Mail();
		String eadd= di.emp_address();
		int s= di.salary();
		
		assertEquals("Dipak Kandele",en);
		assertEquals(9177,ei);
		assertEquals("Male",g);
		assertEquals(23,ea);
		assertEquals("Testing",er);
		assertEquals("xyz@gmail.com",em);
		assertEquals("Buldana",eadd);
		assertEquals(25000,s);
	}
	
	@Test
	public void Lalit() {
		Emp_Lalit l = new Emp_Lalit();
		
		String en= l.emp_name();
		int ei= l.emp_id();
		String g= l.gender();
		int ea= l.emp_age();
		String er= l.emp_role();
		String em= l.emp_Mail();
		String eadd= l.emp_address();
		int s= l.salary();
		
		assertEquals("Lalit Ingale",en);
		assertEquals(9179,ei);
		assertEquals("Male",g);
		assertEquals(28,ea);
		assertEquals("Sales Executive",er);
		assertEquals("pqr@gmail.com",em);
		assertEquals("Chiplun",eadd);
		assertEquals(35000,s);
	}
	
	@Test
	public void Lina() {
		Emp_Lina li = new Emp_Lina();
		
		String en= li.emp_name();
		int ei= li.emp_id();
		String g= li.gender();
		int ea= li.emp_age();
		String er= li.emp_role();
		String em= li.emp_Mail();
		String eadd= li.emp_address();
		int s= li.salary();
		
		assertEquals("Lina Chaudhari",en);
		assertEquals(9181,ei);
		assertEquals("Female",g);
		assertEquals(22,ea);
		assertEquals("Developer",er);
		assertEquals("grs@gmail.com",em);
		assertEquals("Kinod",eadd);
		assertEquals(27000,s);
	}

	@Test
	public void Nahush() {
		Emp_Nahush n = new Emp_Nahush();
		
		String en= n.emp_name();
		int ei= n.emp_id();
		String g= n.gender();
		int ea= n.emp_age();
		String er= n.emp_role();
		String em= n.emp_Mail();
		String eadd= n.emp_address();
		int s= n.salary();
		
		assertEquals("Nahush Patil",en);
		assertEquals(9183,ei);
		assertEquals("Male",g);
		assertEquals(22,ea);
		assertEquals("Chemist",er);
		assertEquals("hgv@gmail.com",em);
		assertEquals("Nashik",eadd);
		assertEquals(27000,s);
	}
	
	@Test
	public void Payal() {
		Emp_Payal p = new Emp_Payal();
		
		String en= p.emp_name();
		int ei= p.emp_id();
		String g= p.gender();
		int ea= p.emp_age();
		String er= p.emp_role();
		String em= p.emp_Mail();
		String eadd= p.emp_address();
		int s= p.salary();
		
		assertEquals("Payal Pitale",en);
		assertEquals(9183,ei);
		assertEquals("Female",g);
		assertEquals(24,ea);
		assertEquals("Data Engineer",er);
		assertEquals("uhf@gmail.com",em);
		assertEquals("Indore",eadd);
		assertEquals(28800,s);
	}
	
	@Test
	public void Pratiksha() {
		Emp_Pratiksha pr = new Emp_Pratiksha();
		
		String en= pr.emp_name();
		int ei= pr.emp_id();
		String g= pr.gender();
		int ea= pr.emp_age();
		String er= pr.emp_role();
		String em= pr.emp_Mail();
		String eadd= pr.emp_address();
		int s= pr.salary();
		
		assertEquals("Pratiksha Koli",en);
		assertEquals(9185,ei);
		assertEquals("Female",g);
		assertEquals(22,ea);
		assertEquals("Developer",er);
		assertEquals("esc@gmail.com",em);
		assertEquals("Pune",eadd);
		assertEquals(25000,s);
	}
	
	@Test
	public void Sagar() {
		Emp_Sagar sa = new Emp_Sagar();
		
		String en= sa.emp_name();
		int ei= sa.emp_id();
		String g= sa.gender();
		int ea= sa.emp_age();
		String er= sa.emp_role();
		String em= sa.emp_Mail();
		String eadd= sa.emp_address();
		int s= sa.salary();
		
		assertEquals("Sagar Patil",en);
		assertEquals(9187,ei);
		assertEquals("Male",g);
		assertEquals(23,ea);
		assertEquals("Android Developer",er);
		assertEquals("yvy@gmail.com",em);
		assertEquals("Mumbai",eadd);
		assertEquals(30000,s);
	}
	
	@Test
	public void Shri() {
		Emp_Shri sh = new Emp_Shri();
		
		String en= sh.emp_name();
		int ei= sh.emp_id();
		String g= sh.gender();
		int ea= sh.emp_age();
		String er= sh.emp_role();
		String em= sh.emp_Mail();
		String eadd= sh.emp_address();
		int s= sh.salary();
		
		assertEquals("Shrivats Nigam",en);
		assertEquals(9189,ei);
		assertEquals("Male",g);
		assertEquals(24,ea);
		assertEquals("Data Scientist",er);
		assertEquals("sct@gmail.com",em);
		assertEquals("Banglore",eadd);
		assertEquals(45000,s);
	}
	
	@Test
	public void Vaishnavi() {
		Emp_Vaishnavi v = new Emp_Vaishnavi();
		
		String en= v.emp_name();
		int ei= v.emp_id();
		String g= v.gender();
		int ea= v.emp_age();
		String er= v.emp_role();
		String em= v.emp_Mail();
		String eadd= v.emp_address();
		int s= v.salary();
		
		assertEquals("Vaishnavi Dose",en);
		assertEquals(9191,ei);
		assertEquals("Female",g);
		assertEquals(22,ea);
		assertEquals("Data Engineer",er);
		assertEquals("vas@gmail.com",em);
		assertEquals("Hydrabad",eadd);
		assertEquals(28000,s);
	}
}
