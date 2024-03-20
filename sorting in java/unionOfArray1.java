//WAP to print the union of two array. the output should me in sorted order and also remove the duplicates.

import java.util.*;
public class unionOfArray1 {
    static void fun(int a[],int b[], int m, int n)
    {
        int c[] = new int[m+n];
        //copying the element of both array into new array 
        for(int i=0; i<m; i++)
        {
            c[i] = a[i];
        }
        for(int j=0; j<n; j++)
        {
            c[m+j] = b[j];
        }
        //sorting the array
        Arrays.sort(c);
        for(int k=0; k<m+n; k++)
        {
            if(k == 0 || c[k] != c[k-1])
            {
                System.out.print(c[k]+" ");
            }
        }
    }
    public static void main(String[] Prince)
    {
        int a[] = {2,3,6,9,10,15};
        int b[] = {3,4,6,6,9,11,18};
        int m=a.length;
        int n=b.length;
        fun(a,b,m,n);

    }
}
