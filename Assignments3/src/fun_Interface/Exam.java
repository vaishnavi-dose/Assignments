package fun_Interface;

public class Exam 
{
	public static void main(String args[])
	{
		new Thread(new Runnable() {
			public void run()
			{
				System.out.println("Exam is Scheduled");
			}
		}).start();
	}
}
