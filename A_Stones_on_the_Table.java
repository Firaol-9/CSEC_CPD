import java.util.Scanner;

public class A_Stones_on_the_Table{

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        in.nextLine();//pick the number of stones
        String stones = in.nextLine();
        int stonesToBePicked = 0;

        for (int i = 1; i < stones.length(); i++) {
            if ( stones.charAt(i) == stones.charAt(i-1)) stonesToBePicked++;
        }
        System.out.println(stonesToBePicked);
        in.close();
    }
}