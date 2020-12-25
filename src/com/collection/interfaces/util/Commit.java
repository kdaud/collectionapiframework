/**
 * 
 */
package com.collection.interfaces.util;


/**
 * @author opensource
 *
 */
public class Commit {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer [] marks= {84,83,82,88,90,87};
		Float [] result= {1.0f, 3.8f,7.4f, 9.0f};
		Double[] myres = { 39.6d, 33.7, 99.6d, 88.6, 54.2, 64.3d };
		Coder coder = new Coder();
		coder.push2Origin(marks);
		System.out.println("************");
		coder.push2Origin(marks);
		System.out.println("************");
		//coder.push2Origin(grade);
		coder.push2Origin(marks);
		System.out.println("************");
		coder.push2Origin(result);
		coder.push2Origin(marks);
		System.out.println("************");
		coder.push2Origin(myres);
	}
	
}
