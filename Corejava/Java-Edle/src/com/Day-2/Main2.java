package com.abinav;

public class Main2{
    void myMethod1(){
        System.out.println("instance or object Method");
    }
    
    static void myMethod2(){
        System.out.println("static or class method");
    }
    public static void main(String[] args){
        Main2 obj=new Main2();
        obj.myMethod1();
        
        Main2.myMethod2();
    }
}