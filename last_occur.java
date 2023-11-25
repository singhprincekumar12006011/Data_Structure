//WAP to find the index of last occurance nnumber in sorted array.
// find the index of last occurance of 40.

public class last_occur {
    
    static int lSearch(int arr[] , int n, int x)
    {
        for(int i=n-1; i >= 0; i--)
        {
            if(arr[i] == x)
            return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = {10,20,30,40,40,50,60};
        int n = arr.length;
        int x = 40;
        int y = lSearch(arr, n, x);
        System.out.println(y);
    }
}
