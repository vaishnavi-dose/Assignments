package fun_Interface;

interface FI 
{
	int total(int a);
}
class Test{
	public static void main(String args[]) {
		int x=4;
		
		FI add=(int a)-> a*a;
		
		int total = add.total(x);
		System.out.println(total);
	}
}