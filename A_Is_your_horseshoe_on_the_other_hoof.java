import java.util.Scanner;
import java.util.HashSet;

public class A_Is_your_horseshoe_on_the_other_hoof{

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < 4; i++) {
            set.add(in.nextInt());
        }
        System.out.println(4 - set.size());
        in.close();
    }
}