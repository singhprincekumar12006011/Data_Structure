import java.io.*;
import java.util.*;

public class bubbleSort3 {

    static void BubbleSort( int arr[], int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-1-i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array :");
        int n=sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the element of "  + i + " index :");
            arr[i]=sc.nextInt();
        }

        BubbleSort(arr, n);
        for(int p=0; p<n; p++)
        {
            System.out.print(arr[p] + " ");
        }
    }
}
