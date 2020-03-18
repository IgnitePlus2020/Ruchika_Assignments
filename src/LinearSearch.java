import java.util.Scanner;

/**
 * Created by user on 3/19/2020.
 */
public class LinearSearch {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of values:");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter values:");
        for(int i = 0; i < n;i++)
            a[i] = in.nextInt();
        int key;
        System.out.println("Enter key to search:\t");
        key = in.nextInt();
        for(int i = 0; i < n;i++){
            if(a[i] == key){
                System.out.println("Key found at index:" +i);
                System.exit(0);
            }
        }
        System.out.println("Key not found");
    }
}
