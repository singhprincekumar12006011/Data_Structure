//WAP to find the maximum number of cut in a riope of n length using recursion.



import java.util.Scanner;

public class Recursion_Rope_Cut_max {
    public static int fun(int n, int a, int b, int c)
    {
        if(n == 0)
            return 0;
        if(n <= 1)
            return 1;
        int result = Math.max(fun(n-a,a,b,c),Math.max(fun(n-b,a,b,c), fun(n-c,a,b,c)));
        if( result  == -1)
            return -1;
        return result+1;

    }
    public static void main(String[] args)
    {
        int x,y,z,p;
        System.out.println("Give the length of rope :");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        System.out.println("Enter the size of 1st cut");
        y=sc.nextInt();
        System.out.println("Enter the size of 2nd  cut");
        z=sc.nextInt();
        System.out.println("Enter the size of 3rd cut");
        p=sc.nextInt();
        int cut = fun(x,y,z,p);
        System.out.println(cut);
    }
}
