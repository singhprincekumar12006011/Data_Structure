
//WAP a program to demonstrate the linear search.

import java.util.Scanner;
public class Array_LinearSearch {
    public static void main(String[] args)
    {
        int n;
        int p;
        System.out.println("Enter the size of an array");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[] arr = new int[ n];

        System.out.println("Enter the element of an array is :");
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the element of [" + i + "] :");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        p=sc.nextInt();
        System.out.println(fun(arr, p, n));

    }
    public static int fun(int array[] , int x, int len)
    {
        for(int i=0; i<len-1; i++)
        {
            if(array[i]==x)
            {
                return i;
            }
        }
        return 0;
    }
    
}
