public class selectionSort3 {

    static void fun(int arr[], int n)
    {
        for(int i=0; i<n; i++)
        {
            int min = i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }
    public static void main(String[] Prince)
    {
        int arr[] = {10,19,3,9,8,20,5};
        int n = arr.length;
        fun(arr, n);

        for(int i:arr)
        {
            System.out.print(i+ " ");
        }
    }
}
