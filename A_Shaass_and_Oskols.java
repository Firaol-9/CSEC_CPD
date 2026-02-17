import java.util.Scanner;

public class A_Shaass_and_Oskols{

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        int n = in.nextInt();//number of wires
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int m = in.nextInt();//number of birds shot
        in.nextLine();

        for (int i = 0; i < m; i++) {
            int x = in.nextInt() - 1;
            int y = in.nextInt();
            in.nextLine();

            int temp = a[x];
            int left = y - 1;
            int right = temp - y;
            a[x] = 0;

            if ( x != 0  ) a[x - 1] =  a[ x -1] + left;
            if ( x != n - 1) a[x + 1] = a[x + 1] + right;
        }

        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }
    }
}