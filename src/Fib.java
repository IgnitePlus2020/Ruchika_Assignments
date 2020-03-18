import java.util.Scanner;

/**
 * Created by user on 3/19/2020.
 */
public class Fib {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = in.nextInt();
        for(int i = 0; i < n;i++)
            System.out.print(fib(i) + " ");
    }
    static int fib(int n){
        if(n < 2)return n;
        return fib(n - 1)+fib(n-2);
    }
}
