package ques_6OctAss;

public class Emp_Shri extends Employee_Abs implements Runnable  {

	@Override
	String emp_name() {
		// TODO Auto-generated method stub
		return "Shrivats Nigam";
	}

	@Override
	int emp_id() {
		// TODO Auto-generated method stub
		return 9189;
	}

	@Override
	String gender() {
		// TODO Auto-generated method stub
		return "Male";
	}

	@Override
	int emp_age() {
		// TODO Auto-generated method stub
		return 24;
	}

	@Override
	String emp_role() {
		// TODO Auto-generated method stub
		return "Data Scientist";
	}

	@Override
	String emp_Mail() {
		// TODO Auto-generated method stub
		return "sct@gmail.com";
	}

	@Override
	String emp_address() {
		// TODO Auto-generated method stub
		return "Banglore";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 45000;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running");
	}
	
	public static void main(String args[]) {
		Thread t9= new Thread("Employee is Data Scientist");
		t9.start();
	}
}
