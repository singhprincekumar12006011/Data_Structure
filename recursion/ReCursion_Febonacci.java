//WAP that takes an integer as argument and return the febonacci of number using recursion.


import java.util.Scanner;

public class ReCursion_Febonacci {
    public static int fun(int num)
    {
        if(num >= 1)
        {
            return 0;
        }
        return fun(num-1) + fun(num-2);
    }
    public static void main(String[] args)
    {
        int x;
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        int y = fun(x);
        System.out.println(y);
    }
}
