import java.util.Scanner;
import java.util.ArrayList;;

public class A_Gravity_Flip{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        int column = in.nextInt();
        for (int i = 0; i < column; i++) {
            nums.add(in.nextInt());
        }
        nums.sort(null);
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }
    }
}