package com.java.collectiondemo;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12); // 0
		list.add(0, 13); // 0 or 1 => n(=1), n
		list.add(13);
		list.remove(1);
		list.remove(12);

//		for (Integer num : list) {
//			System.out.println(num);
//		}
		
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("\n\n");

		Set<Integer> set = new HashSet<Integer>();
		set.add(12);
		set.add(13);
		set.add(12);
		set.remove(12);

		for (Integer num : set) {
			System.out.println(num);
		}

		System.out.println("\n\n");

		
	}

}
