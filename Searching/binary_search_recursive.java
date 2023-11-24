public class binary_search_recursive {

    static int bSearch(int arr[], int low, int high, int x)
    {
        if(low > high)
        return -1;

        int mid = (low +high)/2;
        if(arr[mid] == x)
        return mid;

        else if (arr[mid] > x) {
            return bSearch(arr, low, mid-1, x);
        }

        else 
        return bSearch(arr, mid + 1, high, x);
    }

    public static void main(String[] args)
    {
        int arr[] = {10,20,30,40,50,60};
        int n = arr.length;
        int x = 50;
        int low = 0;
        int high = n-1;
        int result = bSearch(arr, low, high, x);
        System.out.println(result);
        
    }

    
}
