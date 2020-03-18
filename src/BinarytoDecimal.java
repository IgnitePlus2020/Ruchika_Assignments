import java.util.Scanner;

/**
 * Created by user on 3/19/2020.
 */
public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n;
        int res = 0;
        System.out.println("Enter the binary number: ");
        n = in.next();
        int index = 0;
        for(int i = n.length()-1;i>=0;i--){
            if(n.charAt(i) == '0'){index++;
                continue;
            }
             res+=Math.pow(2,index);
            index++;
        }
        System.out.println("The decimal is:" + res);
    }
}
