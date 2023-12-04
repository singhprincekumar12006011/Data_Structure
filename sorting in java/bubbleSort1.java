import java.io.*;
class bubbleSort {
    static void bubSort(int a[], int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-1-i; j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[]={2,1,4,3};
        bubSort(a,4);
        
        for(int i=0; i<4; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}