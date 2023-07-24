//WAP to print the hello world! 5 time using recursion

public class Recursion_First {
    public static void fun1(int x)
    {
        if (x==0)   // base case
        {
            return; // When the if condition is satisfied then the program will terminate.
        }
        System.out.println("Hello World!");
        fun1(x-1); // calling the recursive function by changing the parameter.
    }
    public static void main(String[] args)
    {
        int n=5;
        fun1(n);
    }
}
