package com.projectphase1;

public class Constructor2 {
	int val=90;
	int empId;
	String name;
	void display() {
		System.out.println(empId+":"+name);
	}
	public static void main(String []args) {
		System.out.println(new Constructor2().val);
		Constructor2 ref=new Constructor2();
		System.out.println(ref.val);
		 Constructor2 emp1=new Constructor2();
		 emp1.display();
		 paraConstructor emp2=new paraConstructor(1734980,"abcde");
			 
		 }
	}
class paraConstructor{
	int empId;
	String name;
	private int val;

	paraConstructor(int empId,String name){
		this.empId=empId;
		this.name=name;
		System.out.println(empId+":"+name);
		
		
	}
   void UsingConstructor2(int val) {
		this.val=val;
	}
   
}

