package parraylist;

import java.util.ArrayList;

public class ArrayListApp {

	public ArrayListApp() {
		ArrayList<String> familyList = new ArrayList<String>();
//		String[] myArray = new String[5];
	}

	public void doStuff(ArrayList<String> familyList) {

		familyList.add("test1");
		familyList.add("test2");
		familyList.add("test3");
		familyList.add("test4");
		familyList.add("test5");

		System.out.println(familyList);
		
		familyList.remove(2);
		
		for(String family : familyList){
			System.out.println(family);
		}
		
		familyList.indexOf("test3");
		
		String three = familyList.get(3);
		System.out.println(three);
	}

}
