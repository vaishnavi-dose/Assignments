package ques_6OctAss;

public class Emp_Lalit extends Employee_Abs implements Runnable{

	@Override
	String emp_name() {
		// TODO Auto-generated method stub
		return "Lalit Ingale";
	}

	@Override
	int emp_id() {
		// TODO Auto-generated method stub
		return 9179;
	}

	@Override
	String gender() {
		// TODO Auto-generated method stub
		return "Male";
	}

	@Override
	int emp_age() {
		// TODO Auto-generated method stub
		return 28;
	}

	@Override
	String emp_role() {
		// TODO Auto-generated method stub
		return "Sales Executive";
	}

	@Override
	String emp_Mail() {
		// TODO Auto-generated method stub
		return "pqr@gmail.com";
	}

	@Override
	String emp_address() {
		// TODO Auto-generated method stub
		return "Chiplun";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 35000;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running");
	}
	
	public static void main(String args[]) {
		Thread t3= new Thread("Employee is Sales Executive");
		t3.start();
	}

}
