public class Recursion_2nd {
    public static void fun(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }



    public static void main(String[] args)
    {
     int x=3;
     fun(x);
    }
}
