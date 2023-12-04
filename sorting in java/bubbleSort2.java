public class bubbleSort2 {

    static void bubbleSort( int arr[], int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-1-i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        //create an array.
        int arr[] = {10,2,8,3,7,1,9,12};
        int n = arr.length;
        bubbleSort(arr, n);
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
