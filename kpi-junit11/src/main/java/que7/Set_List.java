package que7;
import java.util.HashSet;
import java.util.Set;

public class Set_List {
	
	public int set() {
		Set<Integer> No = new HashSet<Integer>();
		
		No.add(201);
		No.add(201);
		No.add(202);
		No.add(202);
		No.add(203);
		No.add(203);
		No.add(204);
		No.add(204);
		No.add(205);
		No.add(205);
		No.add(206);
		No.add(206);
		No.add(207);
		No.add(207);
		No.add(208);
		No.add(208);
		No.add(209);
		No.add(209);
		No.add(210);
		No.add(210);
		
		int last=0;
		
		for(int a : No) {
			last= a;
		}
		return last;
	}
	
	public static void main(String args[]) {
		Set_List s= new Set_List();
		int sol = s.set();
		System.out.println(sol);
	}
}
