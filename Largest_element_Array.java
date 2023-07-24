//WAP to find the largest element of an array.

public class Largest_element_Array {
    public static void main(String[] args){
        int arr[] = {2,5,2,5,7,8,1,4,6,0};
        int x=0;
        for(int element:arr)
        {
            System.out.print(element + " ");
        }

        System.out.println();

        //find the largest element of an array.
        for(int i=0; i<arr.length; i++) 
        {
            if(arr[i] > x)
            {
                x=arr[i];
            }
        }
        System.out.println("The largest element of an array is : " + x);
    }
}
