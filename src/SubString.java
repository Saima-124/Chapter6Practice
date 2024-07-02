import java.util.Scanner;
public class SubString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String s = in.nextLine();
        printSubString(s);
    }
        public static void printSubString(String str){
        int l = str.length();
        for(int i = 0; i<l; i++){
            for(int j = i+1; j<=l; j++){
                String substring = str.substring(i,j);
                System.out.println(substring);
            }
        }
        }

    }

