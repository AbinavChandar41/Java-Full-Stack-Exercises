import java.util.Scanner;
import java.util.Random;
public class NumRandom{
    public static void main(String args[]){
        Random rand = new Random();
        Scanner sb = new Scanner(System.in);
        System.out.println("enter the number");
        int num1 = sb.nextInt();
        int num=rand.nextInt(100);
        System.out.println("the random value of given number is"+" "+num);
        
    }
}