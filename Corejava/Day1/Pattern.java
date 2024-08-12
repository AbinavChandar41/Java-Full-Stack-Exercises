import java.util.Scanner;
public class Pattern{
public static void main(String args[]){
Scanner sb = new Scanner(System.in);
System.out.println("enter the number for pattern");
int num=sb.nextInt();
for(int i=0;i<num;i++){
for(int j=0;j<=i;j++){
System.out.print("* ");
}
System.out.println();
}
}
}