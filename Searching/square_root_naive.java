// write a function that takes number as an arrgument and return the square root of the number.
// if x is not a perfect square then find floor square root.

import java.util.*;
public class square_root_naive {

    static int square(int x)
    {
        int i = 1;
        while(i * i <= x)
        {
            i++;
        }
        return i-1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the number :");
        int x = sc.nextInt();
        int result = square(x);
        System.out.println(result);
    }  
}
