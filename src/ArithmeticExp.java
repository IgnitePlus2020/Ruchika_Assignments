/**
 * Created by user on 3/19/2020.
 */
import java.util.Scanner;
import java.util.Stack;

public class ArithmeticExp {
    public static int eval(String exp) {
        char[] charexp = exp.toCharArray();
        Stack<Integer> numstack = new Stack<Integer>();
        Stack<Character> opstack = new Stack<Character>();
        for (int i = 0; i < charexp.length; i++) {
            if (charexp[i] == ' ')
                continue;
            if (charexp[i] >= '0' && charexp[i] <= '9') {
                String num = "";
                while (i < charexp.length && charexp[i] >= '0' && charexp[i] <= '9')
                    num+=(charexp[i++]);
                numstack.push(Integer.parseInt(num));
            } else if (charexp[i] == '(')
                opstack.push(charexp[i]);
            else if (charexp[i] == ')') {
                while (opstack.peek() != '(')
                    numstack.push(applyOp(opstack.pop(), numstack.pop(), numstack.pop()));
                opstack.pop();
            } else if (charexp[i] == '+' || charexp[i] == '-' ||
                    charexp[i] == '*' || charexp[i] == '/') {
                while (!opstack.empty() && hasPrecedence(charexp[i], opstack.peek()))
                    numstack.push(applyOp(opstack.pop(), numstack.pop(), numstack.pop()));
                opstack.push(charexp[i]);
            }
        }

        while (!opstack.empty())
            numstack.push(applyOp(opstack.pop(), numstack.pop(), numstack.pop()));
        return numstack.pop();
    }

    public static boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    public static int applyOp(char op, int b, int a)
    {
        switch (op)
        {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new UnsupportedOperationException("Cannot divide by zero");
                return a / b;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the expression to evaluate: ");
        String exp = in.nextLine();
        System.out.println("The answer is:" +eval(exp));
    }
}
/*
Enter the expression to evaluate:
5 + 5 + ( 2 * 4 ) - ( 2 / 2 )
The answer is:17
 */