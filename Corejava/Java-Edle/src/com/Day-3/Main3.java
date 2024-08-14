package com.abinav1;

class A{
	int a=10;
	A(String name){
		System.out.println("welcome "+name);
	}
	void myMethod1() {
		System.out.println("i am a super class method");
	}
}
class B extends A{
	B(){
		super ("abinav");
	}
	void myMethod2() {
		System.out.println("super class variable "+super.a);
		super.myMethod1();
	}
}





public class Main3 {
	public static void main(String args[]) {
		B b = new B();
		b.myMethod2();
	}

}
