

import java.util.*;
public class square_root_binary {
    static int square(int x)
    {
        int low=0, high=x, ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int sqr = mid*mid;
            if(sqr == x)
            return mid;
            else if(sqr > x)
            high=mid-1;
            else{
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int x = sc.nextInt();

        int r=square(x);
        System.out.println(r);
    }
}
