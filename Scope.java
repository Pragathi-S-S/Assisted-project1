package com.projectphase1;
import com.projectphase1.AccessModifier;
public class Scope {
	public static void main(String[] args) {
		AccessModifier ref=new AccessModifier();
		ref.flag=70;     //Public Scope
		System.out.println(ref.flag);

	}

}

