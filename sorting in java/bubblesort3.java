public class bubblesort3 {
    static void fun(int arr[], int n)
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
    public static void main(String[] args)
    {
        int arr[] = {14,5,33,21,54,1,2,7,8,3};
        int n = arr.length;

        fun(arr, n);

        for(int p : arr)
        {
            System.out.print(p+" ");        }

    }
}
