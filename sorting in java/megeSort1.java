public class megeSort1 {
    static void mergeSort(int arr[], int low,int l)
    {
        if(low>l){
            int m=low+(l-low)/2;
            mergeSort(arr, low, m);
            mergeSort(arr, m+1, l);
            meger(arr, low, m, l);
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {10,5,30,15,7};
        int l = arr.length;
        int low = 0;
        mergeSort(arr, low, l);
    }
}
