public class insertionSort2 {
    static void fun(int arr[], int n)
    {
        for(int i=1; i<n; i++)
        {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {10,15,2,4,3,9,7,5,13,85,20};
        int n = arr.length;
        //calling the function.

        fun(arr, n);
        //printing the element of an array 
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
