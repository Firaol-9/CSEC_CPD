import java.util.Scanner;

public class A_Buy_a_Shovel{

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        int priceOfShovel = in.nextInt();
        int r = in.nextInt();
        int count = 1, x = 0;

        if ( priceOfShovel%10 == 0){
            System.out.println();
        }
        else if ( priceOfShovel% 5 == 0) x = 2;
        
        while ( true  ){
            if ((priceOfShovel*count - r)%10 == 0 || (count* priceOfShovel)%10 == 0){
                System.out.println(count);
                break;
            }
            count++;
        }
        in.close();
    }
}