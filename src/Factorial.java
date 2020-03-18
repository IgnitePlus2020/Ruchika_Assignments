import java.util.Scanner;

/**
 * Created by user on 3/19/2020.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number: ");
        n = in.nextInt();
        System.out.println("The factorial is:" + fact(n));
    }
    static int fact(int n){
        if(n <= 1)return 1;
        return n * fact(n-1);
    }
}
