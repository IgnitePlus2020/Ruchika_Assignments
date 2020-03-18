import java.util.Scanner;

/**
 * Created by user on 3/18/2020.
 */
public class OddorEven {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number: ");
        n = in.nextInt();
        if (n % 2 == 1) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }
    }
}

/*
Enter the number:
3
The number is odd
 */