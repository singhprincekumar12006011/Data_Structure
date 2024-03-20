public class mergeTwoSubArray {
    
    static void fun(int arr[], int low, int mid, int high)
    {
        // Creating arrays to hold the two subarrays
        int arr1[] = new int[mid - low];
        int arr2[] = new int[high - mid];

        // Populating the first subarray
        for(int i = low; i < mid; i++)
        {
            arr1[i - low] = arr[i];
        }

        // Populating the second subarray
        for(int j = mid; j < high; j++)
        {
            arr2[j - mid] = arr[j];
        }

        // Merging the two subarrays into a new sorted array
        int i = 0, j = 0, k = low;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copying any remaining elements from arr1
        while (i < arr1.length) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        // Copying any remaining elements from arr2
        while (j < arr2.length) {
            arr[k] = arr2[j];
            j++;
            k++;
        }

        // Printing the merged array
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {5,6,8,2,9};
        int low = 0;
        int mid = (arr.length + 1) / 2;
        int high = arr.length;

        fun(arr, low, mid, high);
    }
}
