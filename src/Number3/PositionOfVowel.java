package Number3;
import java.util.Scanner;
public class PositionOfVowel {
    public static void main(String [] arg){
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string :");
        String s = in.nextLine();
        for(int i=0 ; i<s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch=='a' || ch=='A' || ch=='i' || ch=='I' || ch=='e' || ch=='E' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
                System.out.println(i);
            }
        }

    }
}
