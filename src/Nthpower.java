import java.util.Scanner;

/**
 * Created by user on 3/19/2020.
 */
public class Nthpower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number: ");
        n = in.nextInt();
        int a[] = new int[100];
        a[0] = 1;
        a[1] = 4;
        a[2] = 7;
        for(int i = 0; i < 3; i++){
            System.out.print(a[i] + " ");
        }
        for(int i = 3; i < n;i++){
            a[i] = a[i-1] + a[i-2] + a[i-3];
            System.out.print(a[i] + " ");
        }

    }
}
