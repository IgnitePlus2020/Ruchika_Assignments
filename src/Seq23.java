import java.util.Scanner;

/**
 * Created by user on 3/19/2020.
 */
public class Seq23 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        int sum1 = 1, sum2 = -2;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(sum1 + " ");
                sum1 += 3;
            } else {
                System.out.print(sum2 + " ");
                sum2 -= 4;
            }
        }
    }
}
