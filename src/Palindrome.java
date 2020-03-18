import java.util.Scanner;

/**
 * Created by user on 3/19/2020.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        System.out.println("Enter the string: ");
        s = in.next();
        int i = 0, j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                System.out.println("It is not a palindrome");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("It is a palindrome");
    }
}
