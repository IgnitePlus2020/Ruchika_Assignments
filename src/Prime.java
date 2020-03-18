import java.util.Scanner;

/**
 * Created by user on 3/19/2020.
 */
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m;
        System.out.println("Enter the lower value: ");
        n = in.nextInt();
        System.out.println("Enter the upper value: ");
        m = in.nextInt();

        int primes[] = new int[m+1];
        for(int i = 0; i <= m;i++)
            primes[i] = 1;
        primes[0] = primes[1] = primes[2] = 0;
        for(int i = 2; i*i < m; i++){
            if(primes[i] == 0)continue;
            for(int j = i*i; j <= m; j+=i){
                primes[j] = 0;
            }
        }
        for(int i = n+1; i < m;i++){
            if(primes[i] == 1)
                System.out.println(i + " ");
        }
    }
}
