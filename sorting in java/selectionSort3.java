import java.util.Scanner;

public class selectionSort3 {

    static void selectionSort(int arr[], int n)
    {
        for(int i=0; i<n; i++)
        {
            int min = i;

            for(int j=i+1; j<n; j++)
            {
                if(arr[j]<arr[min])
                min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of the array :");

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the element for index " + i);
            arr[i]=sc.nextInt();
        }

        selectionSort(arr, n);
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
