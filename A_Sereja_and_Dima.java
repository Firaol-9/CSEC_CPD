import java.util.Scanner;
import java.util.ArrayList;

public class A_Sereja_and_Dima{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> cards = new ArrayList<>();
        int numOfCards = in.nextInt();
        int sereja = 0, dima = 0;

        for (int i = 0; i < numOfCards; i++) {
            cards.add(in.nextInt());
        }

        for (int i = 0; i < numOfCards; i++) {
            int first = cards.get(0);
            int last = cards.get(cards.size() - 1);

            if ( first > last){
                if ( i % 2 == 0) sereja += first;
                else dima += first;
                cards.remove(0);
            }else{
                if ( i % 2 == 0) sereja += last;
                else dima += last;
                cards.remove(cards.size() - 1);
            }
        }
        System.out.println(sereja + " " + dima);
        in.close();
    }
}