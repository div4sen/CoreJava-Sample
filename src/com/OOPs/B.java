package com.OOPs;

public class B extends A{

//	B(){
//		
//		System.out.println("Constructor in B");
//		
//	}
	
	B(int b){
		//super(b);
		System.out.println("Constructor B with arg"+b);
		
	}
	
	void display() {
		
		System.out.println("Display in B");
		super.display();
		
	}
	
	void anotherFunction() {
		super.display();
	}
}
