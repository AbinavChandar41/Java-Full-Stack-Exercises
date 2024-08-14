package com.abinav;

public class Main3{
    String name;
    
    Main3(String name){
        this(10,20);
        this.name=name;
        this.greeting();
    }
    Main3(int a,int b){
        System.out.println("sum"+(a+b));
    }
    void greeting(){
        System.out.println("welcome"+name);
    }
    public static void main(String[] args){
        Main3 obj=new Main3("abinav");
    }
}