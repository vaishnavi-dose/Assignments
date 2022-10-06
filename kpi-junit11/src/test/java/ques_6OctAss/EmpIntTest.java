package ques_6OctAss;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmpIntTest {
	@Test
	public void Emp1() {
		E1 e = new E1();
		
		int ei= e.emp_id();
		String name= e.name();
		String dob= e.date_of_birth();
		int nl= e.no_of_leaves();
		int wd= e.working_days();
		int hd= e.no_of_holidays();
		String sd= e.salary_date();
		int ac= e.Acc_No();
		
		assertEquals(11,ei);
		assertEquals("Emp1",name);
		assertEquals("25 May 1999",dob);
		assertEquals(5,nl);
		assertEquals(5,wd);
		assertEquals(15,hd);
		assertEquals("30th of month end",sd);
		assertEquals(2345675,ac);
	}
	
	@Test
	public void Emp2() {
		E2 e1 = new E2();
		
		int ei= e1.emp_id();
		String name= e1.name();
		String dob= e1.date_of_birth();
		int nl= e1.no_of_leaves();
		int wd= e1.working_days();
		int hd= e1.no_of_holidays();
		String sd= e1.salary_date();
		int ac= e1.Acc_No();
		
		assertEquals(13,ei);
		assertEquals("Emp2",name);
		assertEquals("3 April 2000",dob);
		assertEquals(4,nl);
		assertEquals(5,wd);
		assertEquals(10,hd);
		assertEquals("1st of month",sd);
		assertEquals(674873,ac);
	}

	@Test
	public void Emp3() {
		E3 e2 = new E3();
		
		int ei= e2.emp_id();
		String name= e2.name();
		String dob= e2.date_of_birth();
		int nl= e2.no_of_leaves();
		int wd= e2.working_days();
		int hd= e2.no_of_holidays();
		String sd= e2.salary_date();
		int ac= e2.Acc_No();
		
		assertEquals(15,ei);
		assertEquals("Emp3",name);
		assertEquals("10 Dec 2000",dob);
		assertEquals(6,nl);
		assertEquals(5,wd);
		assertEquals(15,hd);
		assertEquals("15th of Month",sd);
		assertEquals(43587675,ac);
	}
	
	@Test
	public void Emp4() {
		E4 e3 = new E4();
		
		int ei= e3.emp_id();
		String name= e3.name();
		String dob= e3.date_of_birth();
		int nl= e3.no_of_leaves();
		int wd= e3.working_days();
		int hd= e3.no_of_holidays();
		String sd= e3.salary_date();
		int ac= e3.Acc_No();
		
		assertEquals(17,ei);
		assertEquals("Emp4",name);
		assertEquals("21 July 1995",dob);
		assertEquals(3,nl);
		assertEquals(5,wd);
		assertEquals(10,hd);
		assertEquals("30th of month end",sd);
		assertEquals(56765434,ac);
	}
	
	@Test
	public void Emp5() {
		E5 e4 = new E5();
		
		int ei= e4.emp_id();
		String name= e4.name();
		String dob= e4.date_of_birth();
		int nl= e4.no_of_leaves();
		int wd= e4.working_days();
		int hd= e4.no_of_holidays();
		String sd= e4.salary_date();
		int ac= e4.Acc_No();
		
		assertEquals(19,ei);
		assertEquals("Emp5",name);
		assertEquals("11 Nov 1997",dob);
		assertEquals(3,nl);
		assertEquals(6,wd);
		assertEquals(10,hd);
		assertEquals("30th of month end",sd);
		assertEquals(4567896,ac);
	}
	
	@Test
	public void Emp6() {
		E6 e5 = new E6();
		
		int ei= e5.emp_id();
		String name= e5.name();
		String dob= e5.date_of_birth();
		int nl= e5.no_of_leaves();
		int wd= e5.working_days();
		int hd= e5.no_of_holidays();
		String sd= e5.salary_date();
		int ac= e5.Acc_No();
		
		assertEquals(21,ei);
		assertEquals("Emp6",name);
		assertEquals("30 May 1998",dob);
		assertEquals(4,nl);
		assertEquals(5,wd);
		assertEquals(15,hd);
		assertEquals("1st of month",sd);
		assertEquals(987655,ac);
	}
	
	@Test
	public void Emp7() {
		E7 e6 = new E7();
		
		int ei= e6.emp_id();
		String name= e6.name();
		String dob= e6.date_of_birth();
		int nl= e6.no_of_leaves();
		int wd= e6.working_days();
		int hd= e6.no_of_holidays();
		String sd= e6.salary_date();
		int ac= e6.Acc_No();
		
		assertEquals(23,ei);
		assertEquals("Emp7",name);
		assertEquals("11 June 2000",dob);
		assertEquals(6,nl);
		assertEquals(5,wd);
		assertEquals(10,hd);
		assertEquals("1st of month",sd);
		assertEquals(176543,ac);
	}
	
	@Test
	public void Emp8() {
		E8 e7 = new E8();
		
		int ei= e7.emp_id();
		String name= e7.name();
		String dob= e7.date_of_birth();
		int nl= e7.no_of_leaves();
		int wd= e7.working_days();
		int hd= e7.no_of_holidays();
		String sd= e7.salary_date();
		int ac= e7.Acc_No();
		
		assertEquals(25,ei);
		assertEquals("Emp8",name);
		assertEquals("2 Oct 1994",dob);
		assertEquals(6,nl);
		assertEquals(6,wd);
		assertEquals(10,hd);
		assertEquals("15th of Month",sd);
		assertEquals(798765,ac);
	}
}
