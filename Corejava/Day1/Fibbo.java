import java.util.Scanner;
public class Fibbo{
public static void main(String args[]){
Scanner sb = new Scanner(System.in);
System.out.println("enter the number");
int count=sb.nextInt();
int num1=0;
int num2=1;
int num3=0;
System.out.print(num1 + " " + num2);
for(int i=0;i<count;i++){
num3=num1+num2;
System.out.print(" " + num3);
num1=num2;
num2=num3;
}
}
}
