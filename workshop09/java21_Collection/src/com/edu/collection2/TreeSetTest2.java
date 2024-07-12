package com.edu.collection2;

import java.util.Set;
import java.util.TreeSet;

/*
 * 		Set
 * 		 |
 * 		HashSet
 * 		|
 * 		TreeSet(중복 x , 정렬, 순서 x)
 */
public class TreeSetTest2 {

	public static void main(String[] args) {
	
		TreeSet set = new TreeSet();
		/*
		set.add("BBB");
		set.add("AAA");
		set.add("CCC");
		set.add("AAA");
		set.add("PPP");
		System.out.println(set);
		*/
	//	set.add(new Integer(11)); 
		set.add(22); //Boxing
		set.add(3);
		set.add(10);
		set.add(20);
		set.add(100);
		System.out.println(set.higher(10));
		System.out.println(set.higher(50));
		System.out.println(set.headSet(20)); //미만
		System.out.println(set.tailSet(20)); //이상
		
	}

}
