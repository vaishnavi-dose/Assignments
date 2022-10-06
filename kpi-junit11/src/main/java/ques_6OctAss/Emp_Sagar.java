package ques_6OctAss;

public class Emp_Sagar extends Employee_Abs implements Runnable {

	@Override
	String emp_name() {
		// TODO Auto-generated method stub
		return "Sagar Patil";
	}

	@Override
	int emp_id() {
		// TODO Auto-generated method stub
		return 9187;
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
		return "Android Developer";
	}

	@Override
	String emp_Mail() {
		// TODO Auto-generated method stub
		return "yvy@gmail.com";
	}

	@Override
	String emp_address() {
		// TODO Auto-generated method stub
		return "Mumbai";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 30000;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running");
	}

	public static void main(String args[]) {
		Thread t8= new Thread("Employee is Android Developer");
		t8.start();
	}
}
