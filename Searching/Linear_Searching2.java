import java.util.Scanner;
class LinearSearch {
    public static int linearSearching(int arr[], int target) {
    for(int i=0; i<arr.length; i++)
    {
        if ( arr[i] == target);
        {
            return 1;

        }
    }
    return -1;
}
}
public class Linear_Searching2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of an element :");
        int n=sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the element of index " + i+1 + " :");
            arr[i]=sc.nextInt();
        }

        System.out.println("The array is :");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

    
    }
}
