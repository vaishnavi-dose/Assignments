package que6;

import java.util.ArrayList;

public class ArrList {
	
	public int same_list() {
		ArrayList<String>list1 = new ArrayList<String>();
		list1.add("x");
		list1.add("y");
		list1.add("z");
		list1.add("s");
		list1.add("a");
		list1.add("b");
		ArrayList<String>list2 = new ArrayList<String>();
		list2.add("p");
		list2.add("q");
		list2.add("s");
		list2.add("r");
		list2.add("t");
		ArrayList<String>list3 = new ArrayList<String>();
		list3.add("l");
		list3.add("m");
		list3.add("n");
		list3.add("s");
		ArrayList<String>list4 = new ArrayList<String>();
		list4.add("s");
		list4.add("f");
		list4.add("d");
		ArrayList<String>list5 = new ArrayList<String>();
		list5.add("u");
		list5.add("s");

		list1.retainAll(list2);
		list1.retainAll(list3);
		list1.retainAll(list4);
		list1.retainAll(list5);

		System.out.println("Common Element:"+list1);
		String s= list1.get(0);
		int index = list3.indexOf(s);
		System.out.println("Index Element of List 3:"+index);
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrList ar= new ArrList();
		ar.same_list();
	}

}
