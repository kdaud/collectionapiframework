/**
 * 
 */
package com.collection.interfaces.util;


/**
 * @author opensource
 *
 */
public class TesterF {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Contributer<Integer> mynumber = new Contributer<>(20);
		Contributer<String>course=new Contributer<String>("Software Engineering");
		System.out.println("Integer: "+mynumber.getM());
		System.out.println("String Value: " + course.getM());
		Contributer<Object> object = new Contributer<Object>(true);
		System.out.println("Object Value: " + object.getM());
		
	}
	
}
