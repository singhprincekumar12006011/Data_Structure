//WAP to find the sum of n number using recursion.



import java.util.Scanner;

public class Recursion_Sum_of_N {
    public static int fun(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        return n+fun(n-1);
    }
    public static void main(String[]  aags) {
        int x;
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        int y = fun(x);
        System.out.println(y);
    }
}
