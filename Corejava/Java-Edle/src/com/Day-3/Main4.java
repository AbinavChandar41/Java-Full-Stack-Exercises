package com.abinav1;

class D{
	D(){
		System.out.println("A");
	}
	D(int a){
		System.out.println("A 1");
	}
}
class C extends D {
	C(){
		super(6);
		System.out.println("B");
	}
	C(int a){
		System.out.println("B 1");
	}
}
public class Main4 {
	
	public static void main(String args[]) {
	C b = new C();
}
}
