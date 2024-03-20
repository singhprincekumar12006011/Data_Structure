public class bubblesort2 {
    public static void fun(int arr[], int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,3,8,5,2,9,6};
        int n = arr.length;
        fun(arr, n);

        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
}
