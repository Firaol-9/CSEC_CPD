import java.util.Scanner;
public class A_Team{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int numOfProblems = in.nextInt();
        
        int temp;
        int totalAgreed = 0;
        for (int i = 0; i < numOfProblems; i++) {
            temp = 0;
            for (int j = 0; j < 3; j++) {
                temp += in.nextInt();
            }
            totalAgreed += temp/2;
        }
        System.out.println(totalAgreed);
        in.close();
    }
}