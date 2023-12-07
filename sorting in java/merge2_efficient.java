import java.util.Arrays;

public class merge2_efficient {

    static void merge(int a[], int b[], int m, int n)
    {
        int i=0,j=0;
        while (i<m && j<n) {
            if(a[i]<b[j])
            System.out.print(a[i++]+" ");
            else
            System.out.print(b[j++]+" ");          
        }
        while (i<m) {
            System.out.print(a[i++]+" ");
        }
        while (j<n) 
        {
            System.out.print(b[j++]+" ");
        }
    }
    public static void main(String[] args)
    {
        int a[] = {14,2,4,61,42,20};
        int b[] = {15,14,16,17,18};
        int m=a.length;
        int n=b.length;

        Arrays.sort(a);
        Arrays.sort(b);
        merge(a, b, m, n);

    }
}
