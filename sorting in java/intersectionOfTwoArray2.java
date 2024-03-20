public class intersectionOfTwoArray2 {

    static void fun(int arr1[], int arr2[], int m, int n)
    {
        for(int i=0; i<m; i++)
        {
            if(i>0 && arr1[i] == arr1[i-1])
            continue;

            for(int j=0; j<n; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
    public static void main(String[] Prince)
    {
        int arr1[] = {2,2,3,5,5,5,7,7,8};
        int arr2[] = {3,3,5,5,7,8,8,9};
        int m=arr1.length;
        int n=arr2.length;
        fun(arr1,arr2,m,n);  
    }
}
