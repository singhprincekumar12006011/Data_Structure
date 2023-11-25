public class binary_last_occur2 {

    static int lSearch(int arr[] , int n, int x)
    {
        int low = 0;
        int high = n-1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(x > arr[mid])
            low = mid + 1;
            else if(x < arr[mid])
            high = low -1;
            else
            {
                if(mid == n-1 || arr[mid + 1] != arr[mid] )
                return mid;
                else 
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {

        int arr[] = {1, 20,20,20,30,40};
        int n = arr.length;
        int x = 20;
        System.out.println(lSearch(arr, n, x));

    }
}
