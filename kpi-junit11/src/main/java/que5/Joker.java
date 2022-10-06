package que5;

public class Joker implements JokerInt {
	String Jname;
	String Jdance;
	Joker()
	{
		
	}
	Joker(String Jname,String Jdance)
	{
		this.Jname= Jname;
		this.Jdance= Jdance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joker x = new Joker();
		Joker x1 = new Joker("Joker1","Bhangda");
		Joker y = new Joker();
		Joker y1 = new Joker("Joker2","Garba");
		Joker z = new Joker();
		Joker z1 = new Joker("Joker3","Katthak");
		Joker p = new Joker();
		Joker p1 = new Joker("Joker4","Odissi");
		Joker q = new Joker();
		Joker q1 = new Joker("Joker5","Bharatnatyam");
		Joker r = new Joker();
		Joker r1 = new Joker("Joker6","Kuchipudi");
		Joker s = new Joker();
		Joker s1 = new Joker("Joker7","Mohiniattam");
		Joker t = new Joker();
		Joker t1 = new Joker("Joker8","Sattriya");
		
		System.out.println(x.Jname+" "+"Dancing"+" "+x.Jdance);
		System.out.println(x.Jname+" "+"Dancing"+" "+x1.Jdance);
		System.out.println(x.Jname+" "+"Dancing"+" "+y.Jdance);
		System.out.println(x.Jname+" "+"Dancing"+" "+y1.Jdance);
		System.out.println(x.Jname+" "+"Dancing"+" "+z.Jdance);
		System.out.println(x.Jname+" "+"Dancing"+" "+z1.Jdance);
		System.out.println(x.Jname+" "+"Dancing"+" "+p.Jdance);
		System.out.println(x.Jname+" "+"Dancing"+" "+p1.Jdance);
		System.out.println(x.Jname+" "+"Dancing"+" "+q.Jdance);
		System.out.println(x.Jname+" "+"Dancing"+" "+q1.Jdance);
		System.out.println(x.Jname+" "+"Dancing"+" "+r.Jdance);
		System.out.println(x.Jname+" "+"Dancing"+" "+r1.Jdance);
		System.out.println(x.Jname+" "+"Dancing"+" "+s.Jdance);
		System.out.println(x.Jname+" "+"Dancing"+" "+s1.Jdance);
		System.out.println(x.Jname+" "+"Dancing"+" "+t.Jdance);
		System.out.println(x.Jname+" "+"Dancing"+" "+t1.Jdance);
	}
	
	public String Jdance1() {
		return "Bhangda";
	}
	public String Jdance2() {
		return "Garba";
	}
	public String Jdance3() {
		return "Katthak";
	}
	public String Jdance4() {
		return "Odissi";
	}
	public String Jdance5() {
		return "Bharatnatyam";
	}
	public String Jdance6() {
		return "Kuchipudi";
	}
	public String Jdance7() {
		return "Mohiniattam";
	}
	public String Jdance8() {
		return "Sattriya";
	}
	@Override
	public void dance(String Jname, String Jdance) {
		// TODO Auto-generated method stub
		
	}
	
}
