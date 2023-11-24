import java.util.Scanner;
class LinearSearch {
    public static int linearSearching(int[] arr, int target) {
    for(int i=0; i<arr.length; i++)
    {
        if(arr[i] == target) {
            return i;
            //it return the index if the element is found 
        }
    }   
    return -1;
    //Return -1 if the targat element is not in the array
}
}


class Linear_Searching1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n=sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the element of the array:");
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the element of " + i +" ");
            arr[i] = sc.nextInt();
        }

        System.out.println("The array is :");
        for (int i=0; i<n; i++) {
            System.out.print(+ arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the element to search for :");
        int target = sc.nextInt();
        int result = LinearSearch.linearSearching(arr, target);
        if(result != -1) {
            System.out.println("Element " + target + " found  at index " + result);
        }
        else { 
            System.out.println("Element " + target + " is not found in an array :");
        }
    }
}