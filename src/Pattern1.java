/**
 * Created by user on 3/15/2020.
 */
import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n: ");
        n = in.nextInt();
        for(int i = 1; i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//Comment to test branch
/* Output

Enter the value of n:
5
*
* *
* * *
* * * *
* * * * *

 */
