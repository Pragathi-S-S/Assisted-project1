package com.projectphase1;

public class StringToPriDataType {
	public static void main(String[] args) {
		String str1="true";
		String str2="4566";
		String str3="45.66";
		boolean b1=Boolean.parseBoolean(str1);
		int num1=Integer.parseInt(str2);
		double num2=Double.parseDouble(str3);
		System.out.println(b1);
		System.out.println();
		System.out.println(num1);
		System.out.println();
		System.out.println(num2);

	}

}

