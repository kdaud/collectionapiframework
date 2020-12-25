package com.collection.interfaces.util;


public class Coder {
	
	public <E extends Number> void push2Origin(E[] number) {
		for (E es : number) {
			System.out.println("Element: " + es);
		}
	}
	
}
