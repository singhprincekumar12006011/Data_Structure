public class insertionSort1 {

    static  void fun(int arr[], int n)
    {
        for(int i=1; i<n; i++)
        {
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {12,2,3,8,4,6,9,1,5};
        int n = arr.length;
        fun(arr, n);

        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
}
