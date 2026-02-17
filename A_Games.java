import java.util.Scanner;

public class A_Games{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int numOfClubs = in.nextInt();
        in.nextLine();
        int[][] list = new int[numOfClubs][2];
        int num = 0;

        for (int i = 0; i < numOfClubs; i++) {
            list[i][0] = in.nextInt();
            list[i][1] = in.nextInt();
            in.nextLine();
        }

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                num += list[i][0] == list[j][1] ? 1 : 0;
            }
        }
        System.out.println(num);
        in.close();
    }
}