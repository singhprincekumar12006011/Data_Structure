import java.lang.*;
import java.util.Arrays;

public class union_naive {

    static void union(int a[], int b[], int m, int n)
    {
        int c[] = new int[m+n];
        for(int i=0; i<m; i++)
        {
            c[i]=a[i];
        }
        for(int j=0; j<n; j++)
        {
            c[j+m] = b[j];
        }
        Arrays.sort(c);

        for(int i=0; i<m+n; i++)
        {
            if(i == 0 || c[i] != c[i-1])
            {
                System.out.print(c[i]+" ");
            }
        }
    }
    public static void main(String[] args)
    {
        int a[] = {10,20,20};
        int b[] = {5,20,40,40};
        int m = a.length;
        int n = b.length;

        union(a, b, m, n);
    }
}
