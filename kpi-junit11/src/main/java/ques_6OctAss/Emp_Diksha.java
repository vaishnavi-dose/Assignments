package ques_6OctAss;

public class Emp_Diksha extends Employee_Abs implements Runnable {

	@Override
	String emp_name() {
		// TODO Auto-generated method stub
		return "Diksha Patil";
	}

	@Override
	int emp_id() {
		// TODO Auto-generated method stub
		return 9175;
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
		return "Ios Developer";
	}

	@Override
	String emp_Mail() {
		// TODO Auto-generated method stub
		return "abc@gmail.com";
	}

	@Override
	String emp_address() {
		// TODO Auto-generated method stub
		return "Kusumba,Jlg";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
	
		return 29000;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running");
	}
	
	public static void main(String args[]) {
		Thread t1= new Thread("Employee is Ios Developer");
		t1.start();
	}

}
