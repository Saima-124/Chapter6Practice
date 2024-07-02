package Number3;
import java.util.Scanner;
public class SecondLetters {
    public static void main(String [] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string :");
        String s = in.nextLine();
        for(int i=0 ; i<s.length() ; i=i+2)
        {
            char ch = s.charAt(i);


                System.out.println(ch);

        }
    }
}
