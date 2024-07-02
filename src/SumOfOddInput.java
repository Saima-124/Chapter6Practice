import java.util.Scanner;
public class SumOfOddInput {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a input :");
        int num = in.nextInt();
        int result = 0;
        while(num!=0){
            int digit = num%10;
            if(digit%2!=0){
                 result = result+digit;
            }
            num = num/10;
        }
        System.out.println("Sum of odd numbers of an input = " + result);
    }
}
