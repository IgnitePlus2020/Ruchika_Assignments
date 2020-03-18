import java.util.Scanner;

/**
 * Created by user on 3/18/2020.
 */
public class Swap {
    public static void main(String args[]) {
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the corresponding choice");
        while(true) {
            System.out.println("1. Swap 2 numbers\n2: Swap 3 numbers\n3: Exit");
            choice = in.nextInt();
            if (choice == 1) {
                int a,b,temp;
                System.out.println("Enter the first number to swap:");
                a = in.nextInt();
                System.out.println("Enter the second number to swap:");
                b = in.nextInt();
                temp = a;
                a = b;
                b = temp;
                System.out.println("The swapped numbers are:\na = "+a+"\nb = "+b);
            } else if (choice == 2) {
                int a,b,c;
                System.out.println("Enter the first number to swap:");
                a = in.nextInt();
                System.out.println("Enter the second number to swap:");
                b = in.nextInt();
                System.out.println("Enter the third number to swap:");
                c = in.nextInt();
                a = a + b + c;
                b = a - (b + c);
                c = a - (b + c);
                a = a - (b + c);
                System.out.println("The swapped numbers are:\na = "+a+"\nb = "+b+"\nc = "+c);
            }else{
                System.exit(0);
            }
        }
    }

}
/*
Enter the corresponding choice
1. Swap 2 numbers
2: Swap 3 numbers
3: Exit
1
Enter the first number to swap:
2
Enter the second number to swap:
3
The swapped numbers are:
a = 3
b = 2
1. Swap 2 numbers
2: Swap 3 numbers
3: Exit
2
Enter the first number to swap:
3
Enter the second number to swap:
4
Enter the third number to swap:
5
The swapped numbers are:
a = 5
b = 3
c = 4
1. Swap 2 numbers
2: Swap 3 numbers
3: Exit
3
 */

