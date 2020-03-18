import java.util.Scanner;

/**
 * Created by user on 3/19/2020.
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int res = 0;
        System.out.println("Enter the decimal number: ");
        n = in.nextInt();
        int bin[] = new int[32];
        int i = 0;
        while (n > 0) {
            bin[i] = n % 2;
            n = n / 2;
            i++;
        }
        System.out.println("The decimal is:");
        for (int j = i - 1; j >= 0; j--)
            System.out.print(bin[j]);

    }
}
