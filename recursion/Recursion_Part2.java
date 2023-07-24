import java.util.Scanner;

public class Recursion_Part2 {
    public static void fun(int n){
        if(n == 0)
            return;
        fun(n/2);
        System.out.print(n%2);
    }

    public static void main(String[] args)
    {
        int x;
        Scanner sc = new Scanner(System.in);
        x =sc.nextInt();
        fun(x);
    }
}
