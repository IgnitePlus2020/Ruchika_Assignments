import java.util.Scanner;

/**
 * Created by user on 3/18/2020.
 */
public class SplitWholeFraction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n;
        System.out.println("Enter the number to split: ");
        n = in.nextDouble();
        int whole = (int)n;
        double fraction = n - whole;
        System.out.println("Whole part:" + whole +"\nFractional part:"+fraction);

    }
}
