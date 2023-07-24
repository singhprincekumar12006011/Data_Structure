///WAP to check the element of an array is sorted or not.


import java.util.*;
public class Array_check_Sorted {

    static boolean isSorted(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    return false;
                }
            }
            return true;
        }


    public static void main(String[] args) 
    {

        int x=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        x=sc.nextInt();
        int[] arr = new int[x];
        //assing the element of arrray

        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter the element of an " + i + " index :");
            arr[i]=sc.nextInt();
        }

        //printing array
        for(int element:arr)
        {
            System.out.print(element + " ");
        }

        System.out.println();

        boolean sorted = isSorted(arr);

        if (sorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }

        
        
    }
}
