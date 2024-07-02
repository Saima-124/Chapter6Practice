package Number3;
import java.util.Scanner;
public class UpperCaseLetters {
    public static void main(String [] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string :");
        String s = in.nextLine();
        for(int i=0 ; i<s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                System.out.println(ch);
            }
        }
    }

}
