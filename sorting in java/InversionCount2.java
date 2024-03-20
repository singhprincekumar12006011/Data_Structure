
//write a program to count the pair whose imidiate next is smaller then it.
// ex = 

public class InversionCount2 {

    public static void fun(int arr[], int n)
    {
        int i=0;
        //int j=0;
        int p=0;
        while(i<n-1)
        {
            int j=arr[i];
            if(j>arr[i+1])
            {
                p++;
            }
            i++;
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
