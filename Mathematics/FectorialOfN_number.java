//wap to find the fectorial of n number

import java.util.*;
public class FectorialOfN_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number........");
        int x = sc.nextInt();
        int fect = 1;
        while (x>0) {
            fect = fect*x;
            x--;
        }
        System.out.println(fect);
    }
}
//time complexity = O(n).
