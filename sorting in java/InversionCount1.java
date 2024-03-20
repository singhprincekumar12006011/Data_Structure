//WAP to count the inversion in an array.
//a pair(a[i], a[j]) form an inversion if i < j and a[i] > a[j].
//it means that the number of pair form from the element of an array, if greater element come before the smaller number.

public class InversionCount1 {

    static void fun(int arr[], int n)
    {
        int p=0;
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(arr[i] > arr[j])
                {
                    p++;
                }
            }
        }
        System.out.println(p);
    }
    public static void main(String[] Prince) 
    {
        int arr[] = {2,4,1,3,5};
        int n=arr.length;
        fun(arr, n);
    }
    
}
