import java.util.Scanner;

public class A_Bear_and_Big_Brother{
   public static void  main(String [] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int counter = 0;

        while ( a <= b){
            a *= 3;
            b *= 2;
            counter++;
        }
        System.out.println(counter);
        in.close();
   }
}