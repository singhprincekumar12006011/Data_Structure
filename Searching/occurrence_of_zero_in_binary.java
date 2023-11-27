//wap to find the number of zero occurrence in binary number(0,1).



public class occurrence_of_zero_in_binary {

    static int occurrence(int arr[], int n)
    {
        int low = 0;
        int high = n-1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(arr[mid] == 0)
            low = mid + 1;
            else
            {
                if(mid == 1 || arr[mid - 1] != arr[mid])
                return (n - mid)+1;

                else
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = {0,0,0,0,0,1,1,1,1};
        int n = arr.length;
        int r = occurrence(arr, n);
        System.out.println(r);
    }
}
