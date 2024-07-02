import java.util.Scanner;
public class MinMaxFinder {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        System.out.println("Enter integers : ");
        while(scanner.hasNextInt()){
            int num = scanner.nextInt();
            if(num<min){
                min = num;
            }
            else{
                max = num;
            }
        }
        if(min==Integer.MIN_VALUE && max==Integer.MAX_VALUE){
            System.out.println("No valid input entered");
        }
        else{
            System.out.println("Smellest integer = " + min);
            System.out.println("Largest integer = " + max);
        }
    }
}
