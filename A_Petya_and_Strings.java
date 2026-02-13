import java.util.Scanner;

public class A_Petya_and_Strings{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String firstWord = in.nextLine();
        String secondWord = in.nextLine();

        for (int i = 0; i < firstWord.length(); i++) {

            if (firstWord.equalsIgnoreCase(secondWord)){
                System.out.println("0");
                break;
            }

            if ( firstWord.toLowerCase().charAt(i) < secondWord.toLowerCase().charAt(i) ){
                System.out.println("-1");
                break;
            }else if(firstWord.toLowerCase().charAt(i) > secondWord.toLowerCase().charAt(i)){
                System.out.println("1");
                break;
            }
        }
    }
}