import java.util.Scanner;
public class A_Beautiful_Matrix{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int input, shiftNeeded = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                input = in.nextInt();
                if (input == 1) {
                    shiftNeeded = Math.abs(i - 2) + Math.abs(j - 2);
                    break;
                }
            }
            in.nextLine();
        }
        System.out.println(shiftNeeded);
    }
}