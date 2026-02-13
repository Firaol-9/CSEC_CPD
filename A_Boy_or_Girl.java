import java.util.Scanner;
import java.util.HashSet;

public class A_Boy_or_Girl{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        HashSet<Character> list = new HashSet<>();

        String word = in.nextLine();

        for (int i = 0; i < word.length(); i++) {
            list.add(word.charAt(i));
        }
        if (list.size()%2 == 1){
            System.out.println("IGNORE HIM!");
        }else{
            System.out.println("CHAT WITH HER!");
        }
    }
}