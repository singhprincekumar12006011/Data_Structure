
import java.util.*;
public class sortBubble2 {

    public static void bubbleSort(int arr[], int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter the element of an array at index: " + i);
            arr[i] = sc.nextInt();
        }

        //calling the method.
        bubbleSort(arr, n);

        //printing the array
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}
