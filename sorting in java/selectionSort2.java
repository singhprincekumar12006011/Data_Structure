public class selectionSort2 {

    static void selectionSort(int arr[], int n)
    {
        for(int i=0; i<n; i++)
        {
            int min=i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[j] < arr[min])
                {
                    min=j;
                }
            }

            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {10, 2, 5, 1, 7, 9, 5};
        int n=arr.length;


        selectionSort(arr, n);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
