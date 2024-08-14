package com.abinav;

public class Main5 {
	 Main5(String name) {
		System.out.println("welcome: "+name);
	}
	
	Main5(int a,int b) {
		System.out.println("addition: "+(a+b));
	}
	
	Main5(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("factorial: "+fact);
	}
	public static void main(String[] args) {
		Main5 obj=new Main5(5);
		Main5 obj1=new Main5("abinav");
		Main5 obj2=new Main5(5,10);
		
		
	}

}

