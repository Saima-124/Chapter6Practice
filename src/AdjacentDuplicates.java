import java.util.Scanner;
public class AdjacentDuplicates {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int previousNumber = in.nextInt();
        System.out.println("Enter numbers : ");
        while(in.hasNext()){
            int num = in.nextInt();
            if(num==previousNumber){
                System.out.println(num + "");
            }
            previousNumber = num;
        }
    }
}
