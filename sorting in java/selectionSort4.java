public class selectionSort4 {
    static void fun(int arr[], int n)
    {
        for(int i=0; i<n; i++)
        {
            int min=i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {10,2,4,6,3,8,9,1};
        int n = arr.length;
        fun(arr, n);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
