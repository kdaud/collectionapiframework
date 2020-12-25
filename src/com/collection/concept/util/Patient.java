package com.collection.concept.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

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
		
		Set<String> grade = new TreeSet<>();
		grade.add("Gama");
		grade.add("Abel");
		grade.add("Aaron");
		grade.add("Cliff");
		grade.add("Clif");
		grade.add("Amin");
		grade.add("Henry");
		grade.add("Daud");
		grade.add("Aaron");
		
		for (String ss : grade) {
			System.out.print(ss + " ");
		}
		System.out.println("\n **************\n");
	Vector<Character>mygrade=new Stack<>();
		mygrade.add('A');
		mygrade.add('A');
		mygrade.add('A');
		mygrade.add('A');
		mygrade.add('A');
		mygrade.add('A');
		
		for (char cc : mygrade) {
			System.out.print(cc + " ");
		}
		System.out.println("*************");
		Stack<String> student = new Stack<>();
		student.add("Balaba");
		student.add("Difas");
		student.add("RoseMary");
		student.pop();
		student.add("Kakuye");
		student.add("Kaliisa");
		System.out.println(" Element on Top: " + student.peek());
		for (String sss : student) {
			System.out.println(sss);
		}
		student.push("Fred");
		System.out.println(" Element on Top: " + student.peek());
		System.out.println("Hello Collection Api");
		
	}
	
}
