package exceptions;

class Exception_Handling {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x=7, y=0;
		
		try {
			System.out.println(x/y);
		}
		
		catch(Exception eh) {
			eh.printStackTrace();
		}
		
		finally {
			System.out.println("Exception happens or Not");
		}
	}

}
