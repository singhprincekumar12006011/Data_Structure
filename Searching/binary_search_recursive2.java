
import java.util.*;
public class binary_search_recursive2 {

    //create a function that takes an array,low, high and x as an argument
    static int bSearch (int arr[], int low, int high, int x)
    {

        if(low > high)
        return -1;

        //now we will find the mid and then compare it with x
        int mid = (low +  high)/2;
        if( arr[mid] == x)
        {
            return mid;
        }

        //compare the mid > x , if mid > x then x must be in the left side of the id
        //so we will change the value of high.
        else if (arr[mid] > x) {
            return bSearch(arr, low, mid - 1, x);
        }

        // here we will change the value of low becuase if it is not found in the left hand of mid 
        //then we have to check right hand of the array.
        else 
        return bSearch(arr, mid + 1, high, x);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        // in for each the i represent element not index of an element.
        for( int i = 0; i < n; i++)
        {
            System.out.println("Enter the element of " + i + " index :");
            arr[i] =sc.nextInt();
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\n"+"Enter the element to search :");
        int x = sc.nextInt();
        int low = 0;
        int high = n -1;

        int result  = bSearch(arr, low, high, x);
        System.out.println(result);
    }
    
}
