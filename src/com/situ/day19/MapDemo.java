package com.situ.day19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class MapDemo {
	public static void main(String[] args) {
		// CN 中华人民共和国 US 美利坚合众国
		// key value
		Map map = new HashMap();
		map.put("CN", "中华人民共和国");
		map.put("US", "美利坚合众国");
		map.put(new Stu(), new Teacher());

		String value = (String) map.get("CN");
		System.out.println(value);
	}

	@Test
	public void test() {
		// CN 中华人民共和国 US 美利坚合众国
		// key value
		Map<String, String> map = new HashMap<String, String>();
		map.put("CN", "中华人民共和国");
		map.put("US", "美利坚合众国1");
		map.put("US", "美利坚合众国2");

		String value1 = map.get("CN");
		//System.out.println(value1);
		
		//entrySet得到一个包含多个键值对元素的set的集合
		for (Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key: " + key + ", value: " + value);
		}
		
		System.out.println("-----------");
		//keySet获得map中所有的键,后面的set隐含是key不能重复的
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		System.out.println("-----------");
		for (String key : keySet) {
			System.out.println(key);
		}
	}
}
