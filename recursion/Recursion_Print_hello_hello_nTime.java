

//write the program to print prince 5 time.
import java.util.Scanner;
public class Recursion_Print_hello_hello_nTime {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        fun(x);

        
    }

    public static void fun(int n)
        {
            if(n == 0)
            return;
            System.out.println("Prince ");
            fun(n-1);
            
        }
    
}
