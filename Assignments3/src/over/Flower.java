package over;
//Program of overriding
public class Flower 
{
	public void color() {
		System.out.println("Flowers are Beautiful");
	}
}
class Rose extends Flower{
	public void color() {
		System.out.println("Roses are  Red and Beautiful");
	}
}