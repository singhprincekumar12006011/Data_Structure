// write a function that array, length of array and x as argument and find the index 
// of last  occurrance of number. 

public class binary_last_occur1 {

    static int lSearch(int arr[], int n, int x)
    {
        int low=0;
        int high = n - 1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(x > arr[mid])
            {
                low = mid + 1;
            }
            else if (x< arr[mid]) 
                high = mid - 1;
            else
            {
                if(mid == n-1 || arr[mid + 1] != arr[mid])
                return mid;
                else
                   low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int arr[] = {10,20,30,40,40,50,60};
        int n = arr.length;
        int x = 40;
        System.out.println(lSearch(arr, n, x));
    }
    
}
