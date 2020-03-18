import java.util.Scanner;

/**
 * Created by user on 3/19/2020.
 */
public class Seq14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number: ");
        n = in.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print(Math.pow(i,i));
        }

    }
}
