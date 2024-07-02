public class SumOfOddNumbers {
    public static void main(String [] arg){
        int sum=0;
        for(int i=2;i<=100;i=i+2){
            sum=sum+i;
        }
        System.out.println("Sum of even numbers between 2 to 100 = " + sum);
    }
}
