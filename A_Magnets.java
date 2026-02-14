import java.util.Scanner;
public class A_Magnets{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int numOfMagnets = in.nextInt();
        int magnets[] = new int[numOfMagnets];
        int numOfGroupsOfMagnets = 1;

        for (int i = 0; i < numOfMagnets; i++) {
            magnets[i] = in.nextInt();
        }

        for (int i = 1; i < magnets.length; i++) {
            if( magnets[i] != magnets[i-1]) numOfGroupsOfMagnets++;
        }
        System.out.println(numOfGroupsOfMagnets);
        in.close();
    }
}