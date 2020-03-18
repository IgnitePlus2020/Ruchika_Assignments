import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by user on 3/18/2020.
 */
public class NuminWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n;
        System.out.println("Enter the number: ");
        n = in.next();
        HashMap<Character,String>set = new HashMap<Character, String>();
        set.put('1',"One");
        set.put('2',"Two");
        set.put('3',"Three");
        set.put('4',"Four");
        set.put('5',"Five");
        set.put('6',"Six");
        set.put('7',"Seven");
        set.put('8',"Eight");
        set.put('9',"Nine");
        set.put('0',"Zero");
        String res = "";
        for(int i = 0; i < n.length();i++){
            res+=set.get(n.charAt(i))+" ";
        }
        System.out.println("The num in words is:" + res);
    }
}
