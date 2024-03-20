
//WAP to merge the two sorted array in such a way so that the resultant array must be sorted order.

import java.util.Arrays;

public class mergeSortedArray1 {
    static void fun(int arr1[], int arr2[])
    {
        //creating a new array of size m+n
        int m=arr1.length;
        int n=arr2.length;
        int arr[] = new int[m+n];
        //copy the element of first array.
        for(int i=0; i<m; i++)
        {
            arr[i] = arr1[i];
        }
        //copy the element of second element
        for(int j=0; j<n; j++)
        {
            arr[m+j] = arr2[j];
        }
        //sort the final array.
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
    public static void main(String[] Prince)
    {
        int arr1[] = {12,13,15,16};
        int arr2[] = {1,2,3,4,5,7};

        //calling the method.
        fun(arr1, arr2);
    }
}
