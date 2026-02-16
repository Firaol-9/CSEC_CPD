import java.util.Scanner;

public class A_Black_Square{

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        String nums[] = in.nextLine().split(" ");
        String str = in.nextLine();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            int x = Integer.valueOf(str.charAt(i) + "");
            sum += Integer.valueOf(nums[x - 1]);
        }
        System.out.println(sum);
        in.close();
    }
}