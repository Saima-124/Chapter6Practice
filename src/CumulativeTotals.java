import java.util.Scanner;
public class CumulativeTotals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  cumulativeTotal = 0;
        System.out.println("Enter numbers :");
        while(in.hasNextInt()){
            int num = in.nextInt();
            cumulativeTotal = cumulativeTotal+num;
            System.out.println(cumulativeTotal + "");
        }
    }
}
