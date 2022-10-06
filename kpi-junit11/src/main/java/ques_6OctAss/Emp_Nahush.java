package ques_6OctAss;

public class Emp_Nahush extends Employee_Abs implements Runnable  {

	@Override
	String emp_name() {
		// TODO Auto-generated method stub
		return "Nahush Patil";
	}

	@Override
	int emp_id() {
		// TODO Auto-generated method stub
		return 9183;
	}

	@Override
	String gender() {
		// TODO Auto-generated method stub
		return "Male";
	}

	@Override
	int emp_age() {
		// TODO Auto-generated method stub
		return 22;
	}

	@Override
	String emp_role() {
		// TODO Auto-generated method stub
		return "Chemist";
	}

	@Override
	String emp_Mail() {
		// TODO Auto-generated method stub
		return "hgv@gmail.com";
	}

	@Override
	String emp_address() {
		// TODO Auto-generated method stub
		return "Nashik";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 27000;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running");
	}

	public static void main(String args[]) {
		Thread t5= new Thread("Employee is Chemist");
		t5.start();
	}
}
