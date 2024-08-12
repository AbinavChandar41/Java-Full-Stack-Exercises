import java.util.Scanner;
public class Palindrome{
public static void main(String args[]){
System.out.println("enter the number");
Scanner sb = new Scanner(System.in);
int num=sb.nextInt();
int sum=0;
int ori=num;
while(num>0){
int rem=num%10;
sum=sum*10+rem;
num=num/10;
}
if(sum==ori){
System.out.println("it is palindrome");
}
else{
System.out.println("it is not palindrome");
}
}
}
