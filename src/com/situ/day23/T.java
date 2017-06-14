package com.situ.day23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import com.situ.day22.Student;

public class T {
	@Test
	public void test() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		/*for (String string : list) {
			System.out.println(list.poll());
		}*/
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
	}
	
	@Test
	public void test2() {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
	    Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String value = iterator.next();
			if ("A".equals(value)) {
				iterator.remove();
			}
		}
		
		/*for (String string : list) {
			if ("B".equals(string)) {
				list.remove(string);
			}
		}*/
		for (int i = 0; i < list.size(); i++) {
			String value = list.get(i);
			if ("B".equals(value)) {
				list.remove(value);
			}
		}
		
		for (String string : list) {
			System.out.println(string);
		}
	}
	
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
