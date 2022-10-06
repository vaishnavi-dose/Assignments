package ques_6OctAss;

public class Emp_Vaishnavi extends Employee_Abs implements Runnable {

	@Override
	String emp_name() {
		// TODO Auto-generated method stub
		return "Vaishnavi Dose";
	}

	@Override
	int emp_id() {
		// TODO Auto-generated method stub
		return 9191;
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
		return "Data Engineer";
	}

	@Override
	String emp_Mail() {
		// TODO Auto-generated method stub
		return "vas@gmail.com";
	}

	@Override
	String emp_address() {
		// TODO Auto-generated method stub
		return "Hydrabad";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 28000;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running");
	}
	
	public static void main(String args[]) {
		Thread t10= new Thread("Employee is Data Engineer");
		t10.start();
	}

}
