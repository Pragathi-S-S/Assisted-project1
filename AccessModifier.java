package com.projectphase1;

class AccessModifier {
	public int flag;// Public Scope
	private int data=40;
	private void msg() {// Private Access Modifier
		System.out.println("Private Scope...");
	}

	public static void main(String[] args) {
	     AccessModifier obj=new AccessModifier();
	     System.out.println(obj.data);
		 obj.msg();
		 new Other().func();
	}
	protected void func() {// Protected Scope
		System.out.println("Protected Scope....");
	}
	void met() {// Package Scope
		System.out.println("Package Scope....");
	}
}
class Other{
	void func() {
		AccessModifier ref=new AccessModifier();
		ref.flag=80;
		ref.met();
		ref.func();
	}
}
