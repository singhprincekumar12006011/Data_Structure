
//wap to find the number trailing zero.
import java.util.*;
public class CountZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p;
        int x = p = sc.nextInt();
        int f = 1;
        int n = 0;
        //finding the fectorial of the number.
        while(x > 0)
        {
            f = f * x;
            x--;
        }
        System.out.println("The fectorial of " +  p + " = " + f);
        // finding the number of trailing zero.
        while(f % 10 == 0)
        {
            f=f/10;
            n = n + 1;
            
        }
        System.out.println(n);
    }
}

