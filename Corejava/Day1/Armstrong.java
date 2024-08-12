import java.util.Scanner;
public class Armstrong{
    public static void main(String args[]){
        Scanner sb = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sb.nextInt();
        int check=0;
        int temp;
        int ori=num;
        while(num>0){
            temp=num%10;
            check=check+(temp*temp*temp);
            num=num/10;
        }
        if(ori==check){
            System.out.println("it is armstrong number");
        }
        else{
            System.out.println("it is not armstrong number");
        }
    }
}