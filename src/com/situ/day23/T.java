package com.situ.day23;

import java.util.ArrayList;
import java.util.List;

public class T {
	public static void main(String[] args) {
		/*LinkedList<String> list = new LinkedList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");*/
		
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		/*Iterator<String> iterator = list.iterator();
	    while (iterator.hasNext()) {
	        String value = iterator.next();
	        if ("A".equals(value)) {
	           iterator.remove();
	        }
	    }*/

		
		for (int i = 0; i < list.size(); i++) {
			String value = list.get(i);
			System.out.println(value);
			if ("B".equals(value)) {
				list.remove(value);
			}
		}
	}
}
