package com.abinav;

public class Main6 {
	 Main6(String name) {
		System.out.println("welcome: "+name);
	}
	
	Main6(int a,int b) {
		this("abinav");
		System.out.println("addition: "+(a+b));
	}
	
	Main6(int n) {
		this(10, 20);
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("factorial: "+fact);
	}
	public static void main(String[] args) {
		Main6 obj=new Main6(5);
		
		
		
	}

}

