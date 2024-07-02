import java.util.Scanner;
public class CalculateEvenOddNumbers {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int oddNumbers = 0;
        int evenNumbers = 0;
        System.out.println("Enter numbers : ");
        while(in.hasNextInt()){
            int num = in.nextInt();
            if(num%2==0){
                evenNumbers++;
            }
            else{
                oddNumbers++;
            }
        }
        System.out.println("Odd numbers = " + oddNumbers);
        System.out.println("Even numbers = " + evenNumbers);
    }
}
