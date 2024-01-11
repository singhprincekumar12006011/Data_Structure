
import java.util.*;
public class trailingZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int f = 1;
        //find the fectorial 
        while(x>0)
        {
            f = f*x;
            x--;
        }
        
        System.out.println("the fectorial is = " + f);

        //checking the number is trailing or not
        if(f % 10 > 0)
        {
            System.out.println("the number is having zero at end...");
        } else
        {
            System.out.println("the number is having trailing zero.....");
        }
    }
}
