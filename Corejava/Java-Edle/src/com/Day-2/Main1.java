package com.abinav;

public class Main1{
    int b=20;
    static int c=30;
    
    
    public static void main(String[] arg){
        int a=10;
        System.out.println("local variable :"+a);
        
        Main1 obj=new Main1();
        System.out.println(obj.b);
        
        System.out.println(Main1.c);
    }
}