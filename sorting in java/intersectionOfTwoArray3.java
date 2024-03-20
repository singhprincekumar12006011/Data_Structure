public class intersectionOfTwoArray3 {
    public static void fun(int a[], int b[], int m, int n)
    {
        for(int i=0; i<m; i++)
        {
            if(i>0 && a[i] == a[i-1])
            continue;
            for(int j=0; j<n; j++)
            {
                if(a[i] == b[j])
                {
                    System.out.print(a[i]+ " ");
                    break;
                }
            }
        }
    }
    public static void main(String[] Prince)
    {
        int a[] ={3,5,5,5,8,8,8,9,10,10,11};
        int b[] = {4,4,5,5,6,7,8,8,8,10,10,11};
        int m=a.length;
        int n=b.length;

        fun(a, b, m, n);
    }
}
