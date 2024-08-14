package com.abinav;

public class Main4 {
	void myMethod(String name) {
		System.out.println("welcome: "+name);
	}
	
	void myMethod(int a,int b) {
		System.out.println("addition: "+(a+b));
	}
	
	void myMethod(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("factorial: "+fact);
	}
	public static void main(String[] args) {
		Main4 obj=new Main4();
		obj.myMethod(5);
		obj.myMethod("abinav");
		obj.myMethod(10,20);
	}

}
