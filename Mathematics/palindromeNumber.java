//WAP to check the number is palindrme or not.

import java.util.*;
public class palindromeNumber {
    public static boolean palin(int original, int reverse)
    {
        if(original == reverse)
        {
        return true;
        }else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int original = sc.nextInt();
        int x = original;
        int y , reverse=0;
        while (x > 0) {
            y = x%10;
            reverse = reverse*10 + y;
            x=x/10;
        }
        boolean  b = palin(original, reverse);
        System.out.println(b);
    }
}
