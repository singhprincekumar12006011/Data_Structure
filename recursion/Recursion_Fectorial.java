//WAP that take the integer  as argument from the user and find the factorial using recursive function.

import java.util.Scanner;

public class Recursion_Fectorial {
    public static void main(String[] args)
    {
        int x;
        System.out.println("Enter the number to find trhe factorial");
        Scanner sc=new Scanner(System.in);
        x= sc.nextInt();
        System.out.println(fun(x));

    }
    public static int fun(int n)
    {
        if (n == 0)
        {
            return 1;
        }
        return n*fun(n-1);

    }
}
