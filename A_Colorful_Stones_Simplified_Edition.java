import java.util.Scanner;

public class A_Colorful_Stones_Simplified_Edition{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();
        int currentIndex = 0;

        for (int i = 0; i < t.length(); i++) {
            if ( t.charAt(i) == s.charAt(currentIndex)){
                currentIndex++;
            }
        }
        System.out.println(currentIndex + 1);
    }
}