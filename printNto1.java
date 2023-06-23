//WAP that take an integer as argument and return the value from n to 1
// Example:- n=5;
// Output:- 5 4 3 2 1


import java.util.Scanner;

public class printNto1 {
    public static void printNto1(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.print(n + " ");
        printNto1(n-1);
    }
    public static void main(String[] args)
    {
        int x;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        printNto1(x);
    }
}
