import java.util.Scanner;
public class Ascii{
    public static void main(String args[]){
        Scanner sb = new Scanner(System.in);
        System.out.println("enter the character");
        char ch=sb.next().charAt(0);
        int num=(int) ch;
        System.out.println("the ascii value of given number is"+" "+num);
    }
}