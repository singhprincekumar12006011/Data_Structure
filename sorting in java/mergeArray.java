import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class mergeArray {
    public static void fun(int arr1[], int arr2[], int m, int n)
    {
        //creating the array of m+n size;
        int arr[] = new int[m+n];
        for(int i=0; i<m; i++)
        {
            arr[i] = arr1[i];
        }
        for(int j=0; j<n; j++)
        {
            arr[m+j] = arr2[j];
        }
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array: ");
        int m = sc.nextInt();
        System.out.println("Enter the size of second element");
        int n = sc.nextInt();
        int arr1[] = new int[m];
        int arr2[] = new int[n];
        
        for(int i=0; i<m; i++)
        {
            System.out.println("Enter the  element of " + i + " index  : ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("you have succesfully enter all elements for first array: ");
        for(int k=0; k<n; k++)
        {
            System.out.println("Enter the  element of " + k + " index  : ");
            arr2[k] = sc.nextInt();
        }
        System.out.println("you have succesfully enter all elements for first array: ");
        //calling the function
        fun(arr1, arr2, m, n);
    }
}
