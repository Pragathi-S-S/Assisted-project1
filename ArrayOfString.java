package com.projectphase1;

public class ArrayOfString {
	public static void main(String[] args) {
		
		String[] stringArray1 = new String[] {"p","q","K"};
		String[] stringArray2 = {"S","P","T"};
		
		String[] stringArray3 = new String[3];
		stringArray3[0] = "R";
		stringArray3[1] = "S";
		stringArray3[2] = "T";
		for (int i = 0; i < stringArray3.length; i++) {
			System.out.println(stringArray3[i]);
			}
		System.out.println( stringArray3.length);

	}

}

