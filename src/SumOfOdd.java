import java.util.Scanner;
public class SumOfOdd {
    public static void main(String[] arg){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int a = in.nextInt();
        System.out.println("Enter b number : ");
        int b = in.nextInt();
        int sum=0;
        if(a%2==0){
            a++;
        }
        for(int i=a;i<=b;i=i+2){
            sum=sum+i;
        }
        System.out.println("sum of odd number between a and b =" + sum);
    }
}
