import java.util.Scanner;

/**
 * Created by user on 3/19/2020.
 */
public class Power {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = in.nextInt();
        System.out.println("Enter the power to be taken: ");
        int n = in.nextInt();
        int res = 1;
        while(n > 0){
            res = res*x;
            n--;
        }
        System.out.println("The power is: " + res);
    }
}
