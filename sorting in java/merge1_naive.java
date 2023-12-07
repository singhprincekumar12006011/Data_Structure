import java.util.Arrays;

public class merge1_naive {

    static void merge(int a[], int b[], int m, int n)
    {
        int c[] = new int[m+n];
        for(int i=0; i<m; i++)
        c[i]=a[i];
        for(int j=0; j<n; j++)
        c[j+m]=b[j];

        //sort the array
        Arrays.sort(c);

        //println the array
        for(int i=0; i<m+n; i++)
        System.out.print(c[i]+" ");
    
    }
        
    public static void main(String[] args)
    {
        int a[] = {5,6,7,8,2};
        int b[] = {3,7,5};
        int m=a.length;
        int n=b.length;
        merge(a, b, m, n);
    }
}
