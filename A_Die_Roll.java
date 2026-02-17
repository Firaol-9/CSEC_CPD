import java.util.Scanner;

public class A_Die_Roll{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        int w = in.nextInt();
        int c = 7 - Math.max(y, w) ;

        if ( c == 1 || c == 5) System.out.println( c + "/" + 6);
        else if ( c == 2) System.out.println( c + "/" + 3);
        else if ( c == 3) System.out.println(1 + "/" + 2);
        else if ( c == 4) System.out.println(2 + "/" + 3);
        else System.out.println( 1 + "/" + 1);
        in.close();
    }
}