package com.thread;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) {
		/*Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "name");
		map.put(2, "age");
		map.put(3, "haha");
		for(Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		Iterator<Entry<Integer,String>> ite = map.entrySet().iterator();
		while(ite.hasNext()) {
			Entry<Integer,String> entry = ite.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}*/
	/*	String a = "abcdefg";
		int i = a.length()-1;
		int j = 0;
		for(;i>=0;i--) {
			System.out.println(a.charAt(i));
			System.out.println(++j);
		}*/
		String src = "ÑÏ";
		byte bt[] = src.getBytes();
		System.out.println(Arrays.toString(bt));
		System.out.println((int)'ºÎ');
	}

}
