/*
import java.util.Scanner;

public class NonTailRecursive {
    public static void fun(int n)
    {
        if(n == 0)
        {
            return;
        }
        fun(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args)
    {
        int x;
        System.out.println("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        fun(x);
    }
}
 */
//The above program is non tail recursive.
//the tail recursive of the above program is

import java.util.Scanner;

public class TailRecursive {
    public static void fun(int n, int k)
    {
        if(n == 0)
        {
            return;
        }
        System.out.print(k + " ");
        fun(n-1, k+1);
    }
    public static void main(String[] args)
    {
        int x;
        int y=1;
        System.out.println("Enter the value of x");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        System.out.println("Enter the value of y");

        fun(x,y);
    }
}
