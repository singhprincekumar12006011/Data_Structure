//WAP to find binary number of a decimal number. take the input from user.


import java.util.Scanner;

public class DecimalToBinary {

    public static void fun(int n)
    {
        if(n == 0)
        {
            return;
        }
        fun(n/2);
        System.out.print(n%2);
    }
    public static void main(String[] args)
    {
        int x;
        System.out.println("Enter number to find its binary");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        fun(x);
    }
}
