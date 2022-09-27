package encapsulation;

public class Constructor {

	public Constructor() {
		// TODO Auto-generated constructor stub
	}
	
	public Constructor(int no1, int no2) {
		int num1= no1;
		int num2= no2;
	}
	
	public Constructor(double x, double y) {
		double num1= x;
		double num2= y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor obj= new Constructor();   // default
		Constructor obj2= new Constructor(10, 12);
		Constructor obj3= new Constructor(21.5, 13.2);
		Constructor obj4= new Constructor(4,7);
		Constructor obj5= new Constructor();

	}

}
