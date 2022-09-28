package super_key;


  public class SuperKey 
  { String car="Audi";
  
  } 
  class Brand extends SuperKey 
  { 
	  String car= "BMW"; void wheel() 
	  {
  
		  System.out.println(car); System.out.println(super.car); 
		  
	  } 
	  
  } 
  class SuperKey1 
  {
  
	  public static void main(String args[]) 
	  { 
		  Brand b= new Brand(); b.wheel();
		  
	  } 
	  
  }
 
