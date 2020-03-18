import java.util.Scanner;

/**
 * Created by user on 3/19/2020.
 */
public class Seq21 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        int sum=1;
        for (int i =0; i<n; i++){
            sum = sum+ i*i;
            if(i%2 == 0){
                System.out.printf("%d ",sum);
            }
            else{
                System.out.printf("%d ",-sum);
            }

        }
    }
}
