package ques_6OctAss;

public class Emp_Dipak extends Employee_Abs implements Runnable {

	@Override
	String emp_name() {
		// TODO Auto-generated method stub
		return "Dipak Kandele";
	}

	@Override
	int emp_id() {
		// TODO Auto-generated method stub
		return 9177;
	}

	@Override
	String gender() {
		// TODO Auto-generated method stub
		return "Male";
	}

	@Override
	int emp_age() {
		// TODO Auto-generated method stub
		return 23;
	}

	@Override
	String emp_role() {
		// TODO Auto-generated method stub
		return "Testing";
	}

	@Override
	String emp_Mail() {
		// TODO Auto-generated method stub
		return "xyz@gmail.com";
	}

	@Override
	String emp_address() {
		// TODO Auto-generated method stub
		return "Buldana";
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
		Thread t2= new Thread("Employee is Tester");
		t2.start();
	}

}
