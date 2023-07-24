public class Recursion_Subset_Sum {
    public static int Subset(int arr[], int n, int sum)
    {
        if(n==0)
        return sum == 0? 1 : 0;

        return Subset(arr, n-1, sum) + Subset(arr, n-1, sum - arr[n-1]);
    }
    public static void main(String[] args)
    {
        int n=3, arr[]={10,20,15}, sum=25;
        System.out.println(Subset(arr,n,sum));
    }
}

	