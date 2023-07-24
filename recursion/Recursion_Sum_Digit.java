/*WAP to find the sun of digit using recursion. Take the input from user.

LOGIC:-
    {
        if(num == 0)
        {
            return 0;
        }
        return fun(num/10) + num%10;
    }
 */
import java.util.Scanner;

public class Recursion_Sum_Digit {
    public static int fun(int num)
    {
        if(num == 0)
        {
            return 0;
        }
        return fun(num/10) + num%10;
    }
    public static void main(String[] args)
    {
        int x;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        x= sc.nextInt();
        int y = fun(x);
        System.out.println(y);
    }
}
