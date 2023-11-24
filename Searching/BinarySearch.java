import java.util.Scanner;

public class BinarySearch {
    // method
    static int binrySearch (int arr[], int target) {
        int left=0, right=arr.length-1;
        while(left <= right) {
            int mid = left +(right-left)/2;

            //chech if the target is at middle
            if(arr[mid] == target){
                return mid;
            }

            //if the target is greater,, igonore the left half
            if(arr[mid] < target){
                left=mid+1;
            }

            //if the target is  smaller, ignore the right half
            else {
                right=mid-1;
            }
        }
        // if the target is not in the array 
        return -1;
    }


    //main method
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        //assinning the value to the array 

        for(int i=0; i<n; i++)
        {
            System.out.print("Enter the element of " + i + " :");
            arr[i]=sc.nextInt();
        }

        //printing the array 
        System.out.println("The array that you have entered is :");
        for(int i=0;i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.println("Enter the element to search :");
        int target=sc.nextInt();
        int result = binrySearch(arr, target);

        if(result == -1) {
            System.out.println("Element not found in the array :");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
