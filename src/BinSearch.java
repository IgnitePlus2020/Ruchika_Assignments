import java.util.Scanner;

/**
 * Created by user on 3/19/2020.
 */
public class BinSearch {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of values:");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter values in sorted fashion:");
        for(int i = 0; i < n;i++)
            a[i] = in.nextInt();
        int key;
        System.out.println("Enter key to search:\t");
        key = in.nextInt();
        int l = 0, h = n-1,mid;
        while(l <= h){
            mid = (l + h)/2;
            if(a[mid] == key){
                System.out.println("Key found at index:" +mid);
                System.exit(0);
            }
            else if(a[mid] < key)
                l = mid+1;
            else
                h = mid - 1;
        }
        System.out.println("Key not found");
    }
}
