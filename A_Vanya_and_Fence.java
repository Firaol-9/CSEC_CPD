import java.util.Scanner;

public class A_Vanya_and_Fence {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int numOfFriends = in.nextInt();
        int height = in.nextInt();
        int width = 0;
        in.nextLine();

        int x;
        for (int i = 0; i < numOfFriends ; i++) {
            x = in.nextInt();
           if( x > height) width += 2;
           else width++;
        }
        System.out.println(width);
        in.close();
    }
}
