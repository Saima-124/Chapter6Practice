import java.util.Scanner;
public class ReverseWord {
    public static void main(String [] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word :");
        String s = in.nextLine();
        StringBuilder r = new StringBuilder();
        for(int i = s.length()-1;i>=0;i--){
            r.append(s.charAt(i));
        }
        System.out.println("Reversed word = " + r);
    }

}
