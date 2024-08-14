package com.abinav;

class MyClass {
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	MyClass(int employeeId,String employeeName,float employeeSalary){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
		
	}
	
	void display() {
		System.out.println("employee id:"+employeeId);
		System.out.println("employee id:"+employeeName);
		System.out.println("employee id:"+employeeSalary);
		
		
		
	}

}
public class Main{
	public static void main(String args[]) {
		MyClass obj=new MyClass(101,"abinav",2000.00f);
		obj.display();
		
	}
}
