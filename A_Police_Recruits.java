import java.util.Scanner;

public class A_Police_Recruits{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int numofEvents = in.nextInt();
        in.nextLine();
        int unreatedCrimes = 0;
        int freeOfficers = 0;

        String events []= in.nextLine().split(" ");
        for (int i = 0; i < numofEvents; i++) {
            if ( events[i].equals("-1") && freeOfficers == 0){
                unreatedCrimes++;
            }else if ( events[i].equals("-1") && freeOfficers != 0){
                freeOfficers--;
            }else{
                freeOfficers += Integer.valueOf(events[i]);
            }
        }
        System.out.println(unreatedCrimes);
        in.close();
    }
}