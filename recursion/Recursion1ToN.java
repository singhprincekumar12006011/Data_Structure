
//Wap that takes an integer as argument and return the value from 1 to n.
//Example:- n=5;
//Output:- 1 2 3 4 5

import java.util.Scanner;

public class Recursion1ToN {
    public static void fun(int n)
    {
        if( n == 0 )
        {
            return;
        }
        fun(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args)
    {
        int x;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        fun(x);
    }
}
