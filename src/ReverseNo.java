import java.util.Scanner;

/**
 * Created by user on 3/18/2020.
 */
public class ReverseNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number: ");
        n = in.nextInt();
        int rev = 0;
        int digit = 0;
        while(n > 0){
            digit = n%10;
            rev=(rev*10)+digit;
            n/=10;
        }
        System.out.println("The reverse is:" + rev);
    }
}
