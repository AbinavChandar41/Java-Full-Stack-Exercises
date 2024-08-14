package com.abinav;

import java.util.Arrays;
import java.util.Scanner;

class Student{
	int regNumber;
	String StudentName;
	int[] Subject=new int[5];
	
	Student(int regNumber,String StudentName) {
		this.regNumber=regNumber;
		this.StudentName=StudentName;
	}
	void getmarks() {
		Scanner sb = new Scanner(System.in);
		for(int i=0;i<Subject.length;i++) {
			Subject[i]=sb.nextInt();
		}
	}
	void displayGrade() {
		int sum=0;
		int avg=0;
	    System.out.println("student name: "+StudentName);
	    System.out.println("Student regNumber: "+regNumber);
	    
		for(int i=0;i<Subject.length;i++) {
			sum=sum+Subject[i];
		}
		avg=(sum*100)/500;
		
		System.out.println("total mark of student is "+sum);
		System.out.println("total avg of student mark is "+avg);
		System.out.println("Each subject mark list "+Arrays.toString(Subject));
		
		if(sum>400) {
			System.out.println("a grade");
		}
		else if(sum>300 && sum<400) {
			System.out.println("b grade");
			
		}
		else if(sum>200 && sum>300) {
			System.out.println("c grade ");
		}
		else {
			System.out.println("sorry to say you are fail");
		}
	}
}

public class Assignment {
	public static void main(String args[]) {
		Student obj=new Student(765,"abinav");
		obj.getmarks();
		obj.displayGrade();
		
		
	}
	
}

