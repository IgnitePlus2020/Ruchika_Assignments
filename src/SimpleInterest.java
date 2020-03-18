import java.util.Scanner;

/**
 * Created by user on 3/18/2020.
 */
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p,r,t;
        double si = 0.0;
        System.out.println("Enter the value of Principal amount: ");
        p = in.nextInt();
        System.out.println("Enter the value of Rate of interest: ");
        r = in.nextInt();
        System.out.println("Enter the Time period in years: ");
        t = in.nextInt();
        si = (p*r*t)/100;
        System.out.println("The simple interest is:" + si);
        }
    }

/*
Enter the value of Principal amount:
1000
Enter the value of Rate of interest:
5
Enter the Time period in years:
2
The simple interest is:100.0
 */