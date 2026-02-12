import java.util.Scanner;

public class A_Anton_and_Danik {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int numOfGames = in.nextInt();
        int anton = 0, danik = 0;
        in.nextLine();

        String word = in.nextLine();
        char c;
        for (int i = 0; i < numOfGames ; i++) {
            c = word.charAt(i);
            if (c == 'A') anton++;
            else danik++;
        }
        if ( anton > danik) System.out.println("Anton");
        else if ( anton < danik) System.out.println("Danik");
        else System.out.println("Friendship");
    }
}
