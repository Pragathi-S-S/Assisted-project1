package com.projectphase1;

public class InnerClass {
	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		InnerClass obj=new InnerClass();
		InnerClass.Inner in=obj.new Inner();  
		in.hello(); 
		 UsingInnerClasses2  ob=new UsingInnerClasses2();  
			ob.display();  
			
		


		//anonymous inner class
		abstract class AnonymousInnerClass {
			   public abstract void display();
			}

		AnonymousInnerClass i = new AnonymousInnerClass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	}
}
class  UsingInnerClasses2 {

private String msg="Inner Classes";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }
}

