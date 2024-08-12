import java.util.Scanner;
public class MyArrays{
public static void main(String args[]){
int arr[] = new int[5];
int sum=0;

Scanner sb = new Scanner(System.in);

System.out.println("enter the 5 elements");
for(int i=0;i<arr.length;i++){
arr[i]=sb.nextInt();
}
System.out.println("arrays elements are");
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
sum = sum+arr[i];
}
System.out.println(sum);
}
}