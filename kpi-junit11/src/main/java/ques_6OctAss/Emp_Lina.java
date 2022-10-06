package ques_6OctAss;

public class Emp_Lina extends Employee_Abs implements Runnable{

	@Override
	String emp_name() {
		// TODO Auto-generated method stub
		return "Lina Chaudhari";
	}

	@Override
	int emp_id() {
		// TODO Auto-generated method stub
		return 9181;
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
		return "grs@gmail.com";
	}

	@Override
	String emp_address() {
		// TODO Auto-generated method stub
		return "Kinod";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 27000;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Runnning");
	}
	
	public static void main(String args[]) {
		Thread t4= new Thread("Employee is Developer");
		t4.start();
	}
}
