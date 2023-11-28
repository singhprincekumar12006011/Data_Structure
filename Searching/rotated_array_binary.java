public class rotated_array_binary {

    static int search(int arr[], int x, int n)
    {
        int low = 0;
        int high = n-1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(arr[mid] == x)
            return mid;
            if(arr[low] < arr[mid])
            {
                if(x > arr[low] && x < arr[mid])
                high = mid-1;
                else
                low = mid + 1;
            }
            else 
            {
                if(x > arr[mid] && x < arr[high])
                low = mid +1;
                else
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = { 30,40,50,60,10,20};
        int x = 10;
        int n = arr.length;
        int r = search(arr, x, n);
        System.out.println(r);
    }
}
