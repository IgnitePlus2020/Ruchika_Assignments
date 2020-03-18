import java.util.Scanner;

/**
 * Created by user on 3/19/2020.
 */
public class EvenSquares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number: ");
        n = in.nextInt();
        for(int i = 2; i <= n; i+=2){
            System.out.print(i*i + " ");
        }

    }
}
