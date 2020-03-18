import java.util.Scanner;

/**
 * Created by user on 3/18/2020.
 */
public class LargestAndSecond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the 3 numbers: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        int largest = (a > b) ? (a > c ? a : c ) : (b > c ? b : c);
        System.out.println("Largest:" + largest);
        int second = (largest == a) ? (b > c ? b : c) : (largest == b ? (c > a ? c : a) : (a > b ? a : b));
        System.out.println("Second Largest:" + second);
    }

}
