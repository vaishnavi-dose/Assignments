package over;
// Program for OverLoading

public class Multiplication {
	
	public int mul(int a, int b)
	{
		return(a*b);
	}
	
	public double mul(double a, double b)
	{
		return(a*b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplication m= new Multiplication();
		System.out.println(m.mul(6,5));
		System.out.println(m.mul(5.4, 4.3));
	}

}
