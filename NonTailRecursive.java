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
