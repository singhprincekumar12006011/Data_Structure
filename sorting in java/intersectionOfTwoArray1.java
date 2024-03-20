public class intersectionOfTwoArray1 {

    static void fun(int a[], int b[], int m, int n){
        //running the first loop till the length of array 'a'.
        for(int i=0; i<m; i++)
        {
            if(i>0 && a[i] == a[i-1])
            continue;
            {
                //running the second loop till length of array 'b' length.
                for(int j=0; j<n; j++)
                {
                    //checking the equal element of both array.
                    if(a[i] == b[j])
                    {
                        System.out.print(a[i]+" ");
                        break;
                    }
                }
            }
        }
    }
    public static void main(String[] Prince)
    {
        int a[] = new int[]{3,5,10,10,10,15,15,20};
        int b[] = new int[]{5,10,10,15,30};
        int m = a.length;
        int n = b.length;
        fun(a, b, m, n);
    }
}
