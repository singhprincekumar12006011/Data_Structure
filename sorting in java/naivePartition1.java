public class naivePartition1 {
    static void fun(int arr[], int low, int mid, int high)
    {
        //creating a temp array.
        int arr1[] = new int[high+1];
        int x=0;
        
        //storing the element smaller or eqaul to the mid element in the temp array.
        for(int i=0; i<high; i++)
        {
            if(arr[i]<=arr[mid])
            {
                arr1[x]=arr[i];
                x++;
            }
        }

        //storing the element larger then mid in the temp array.
        for(int j=0; j<high; j++)
        {
            if(arr[j]>arr[mid])
            {
                arr1[x] = arr[j];
                x++;
            }
        }

        //copying the element of temp array into original array.
        for(int k=0; k<high; k++)
        {
            arr[k]=arr1[k];
        }

        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] Prince)
    {
        int arr[] = {5,13,6,9,12,11,8};
        int low=0, high=arr.length, mid=arr.length;
        fun(arr,low,mid-1,high-1);
    }
}
