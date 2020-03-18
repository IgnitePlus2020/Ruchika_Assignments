import java.util.Scanner;

/**
 * Created by user on 3/19/2020.
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        String res = "";
        System.out.println("Enter the string: ");
        s = in.next();
        for(int i = s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        System.out.println("The reverse is:" + res);
    }
}
