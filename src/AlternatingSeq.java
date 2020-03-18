import java.util.Scanner;

/**
 * Created by user on 3/19/2020.
 */
public class AlternatingSeq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number: ");
        n = in.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % 2 == 1)
                System.out.print(-i + " ");
            else
                System.out.print(i + " ");
        }

    }
}
