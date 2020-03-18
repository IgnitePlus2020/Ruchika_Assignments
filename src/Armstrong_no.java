import java.util.Scanner;

/**
 * Created by user on 3/19/2020.
 */
public class Armstrong_no {
    public static void main(String[] args) {
        int n, arm_no = 0, temp, digit;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any value:\t");
        n = in.nextInt();
        temp = n;
        while (temp > 0) {
            digit = temp % 10;
            temp = temp / 10;
            arm_no = arm_no + (digit * digit * digit);
        }
        if (n == arm_no)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
    }
}
