package ques_6OctAss;

public class Emp_Pratiksha extends Employee_Abs implements Runnable {

	@Override
	String emp_name() {
		// TODO Auto-generated method stub
		return "Pratiksha Koli";
	}

	@Override
	int emp_id() {
		// TODO Auto-generated method stub
		return 9185;
	}

	@Override
	String gender() {
		// TODO Auto-generated method stub
		return "Female";
	}

	@Override
	int emp_age() {
		// TODO Auto-generated method stub
		return 22;
	}

	@Override
	String emp_role() {
		// TODO Auto-generated method stub
		return "Developer";
	}

	@Override
	String emp_Mail() {
		// TODO Auto-generated method stub
		return "esc@gmail.com";
	}

	@Override
	String emp_address() {
		// TODO Auto-generated method stub
		return "Pune";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 25000;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running");
	}

	public static void main(String args[]) {
		Thread t7= new Thread("Employee is Developer");
		t7.start();
	}
}
