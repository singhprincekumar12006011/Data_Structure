public class binary_lastOccur_recursive {
    static int lSearch(int arr[], int low, int high, int x, int n)
    {
        int mid=(low+high)/2;
        if(arr[mid] < x)
        return lSearch(arr, mid + 1, high, x, n);
        else if(x<arr[mid])
        return lSearch(arr, low, mid-1, x, n);
        else
        {
            if(mid == n-1 || arr[mid + 1] != arr[mid])
            return mid;
            else
            return lSearch(arr, mid + 1, high, x, n);
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {10,20,20,20,20,30,40,50};
        int n = arr.length;
        int x = 20;
        int low = 0;
        int high = n-1;
        System.out.println(lSearch(arr, low, high, x, n));

    }
}
