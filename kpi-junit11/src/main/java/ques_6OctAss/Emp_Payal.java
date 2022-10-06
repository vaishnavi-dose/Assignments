package ques_6OctAss;

public class Emp_Payal extends Employee_Abs implements Runnable {

	@Override
	String emp_name() {
		// TODO Auto-generated method stub
		return "Payal Pitale";
	}

	@Override
	int emp_id() {
		// TODO Auto-generated method stub
		return 9183;
	}

	@Override
	String gender() {
		// TODO Auto-generated method stub
		return "Female";
	}

	@Override
	int emp_age() {
		// TODO Auto-generated method stub
		return 24;
	}

	@Override
	String emp_role() {
		// TODO Auto-generated method stub
		return "Data Engineer";
	}

	@Override
	String emp_Mail() {
		// TODO Auto-generated method stub
		return "uhf@gmail.com";
	}

	@Override
	String emp_address() {
		// TODO Auto-generated method stub
		return "Indore";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 28800;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running");
	}

	public static void main(String args[]) {
		Thread t6= new Thread("Employee is Data Engineer");
		t6.start();
	}
}
