import java.util.Scanner;

/**
 * Created by user on 3/18/2020.
 */
public class Sumofseries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int noodd = 0, noeven = 0;
        System.out.println("Enter the value: ");
        n = in.nextInt();
        int oddseries = 0, evenseries = 0;
        if(n % 2 == 1){
            noodd = 1 + ((n - 1)/2);
            noeven = Math.max(0,1 + ((n - 1)/2));
            oddseries = ((n+1)/2)*noodd;
            evenseries = (n - 1)*(noeven/2);
        }
        else{
            noeven = 1 + (n/2);
            noodd = ((n-2)/2)+1;
            oddseries = (n/2)*noodd;
            evenseries = (n/2)*noeven;
        }
        System.out.println("Odd series sum is:" + oddseries+"\nEven series sum is:" + evenseries);
    }
}
