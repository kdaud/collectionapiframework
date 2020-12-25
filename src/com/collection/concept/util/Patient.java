package com.collection.concept.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Patient {
	
	public void showCode() {
		List<Integer>number=new ArrayList<>();
		number.add(4);
		number.add(1);
		number.add(4);
		number.add(8);
		number.add(2);
		number.add(3);
		//number.add("void");
		//System.out.println(number);
		
		//		for (int x = 0; x < number.size(); x++) {
		//			System.out.println(number.get(x));
		//		}
		for (int xx : number) {
			System.out.print(xx + " ");
		}
		System.out.println("\n**********");
		System.out.println("\nSet Implementation");
		
		Set<Integer> grade = new TreeSet<>();
		grade.add(40);
		grade.add(20);
		grade.add(25);
		grade.add(28);
		grade.add(55);
		grade.add(30);
		grade.add(20);
		
		for (int gg : grade) {
			System.out.print(gg + " ");
		}
		
	}
	
}
