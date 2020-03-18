import java.util.Scanner;

/**
 * Created by user on 3/19/2020.
 */
public class Seq16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number: ");
        n = in.nextInt();
        int i = 1, j = 1;
        if (n > 0) {
            while (i <= n) {
                if (j % 3 != 0) {
                    System.out.print(i + " ");
                    i = i + 4 * j;
                }
                j++;
            }
        }
    }
}
