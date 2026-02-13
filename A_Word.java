import java.util.Scanner;


public class A_Word{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int numOfLowercase = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if ( c >= 'a' && c <= 'z'){
                numOfLowercase++;
            }
        }

        if (numOfLowercase >= word.length() - numOfLowercase) System.out.println(word.toLowerCase());
        else System.out.println(word.toUpperCase());
        in.close();
    }
}