
import java.util.Scanner;
public class Array_DS_Deletion {
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :" + "\n" + " \n");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array : ");


        //this is for assigning the value to an array.
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the element of [" + i + "] index");
            arr[i]=sc.nextInt();//this will assign the value to the every i index.
        }

        System.out.println("Enter the element to delete :");

        //This will store the element to delete 
        int del = sc.nextInt();

        for(int j=0; j<n; j++)
        {
            if(arr[j] == del)//it will find the element in an array and if it is found then control goes to next line .
            {
                arr[j]=arr[j+1];// once the element is found then it will assign the element of 'i+1'th index to the 'i'th index.
                j++;// this increament will repeat the loop till the last element of an array.
            }

            // this line will print the new array whose element is removed.
            System.out.print(arr[j]);
        }
        
    
    }
}