import java.util.Scanner;

public class A_Night_at_the_Museum{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int numOfRotations = 0;
        int a, z;
        char currentChar = 'a';

        for (int i = 0; i < word.length(); i++) {
            a = Math.abs(word.charAt(i) - currentChar);
            z = Math.abs(a - 26);
            numOfRotations += a < z ? a : z;
            currentChar = word.charAt(i);
        }
        System.out.println(numOfRotations);
        in.close();
    }
}