import java.util.Scanner;

public class Recursion_N_to_1 {
    public static void fun(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.print(n + " ");
        fun(n-1);
    }
    public static void main(String[] args)
    {
        int num;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        fun(num);

    }
}
