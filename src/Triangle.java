import java.util.Scanner;

/**
 * Created by user on 3/18/2020.
 */
public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n: ");
        n = in.nextInt();
        for(int i = 1;i <= n;i++){
            //Print spaces
            for(int j = 0;j < n-i;j++){
                System.out.print(" ");
            }
            //Print pattern
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

/* Enter the value of n:
4
   *
  * *
 * * *
* * * *

*/