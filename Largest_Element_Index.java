


//wap to print the index of largest element of an array.
import java.util.*;
public class Largest_Element_Index {
    public static void main(String[] args)
    {
        int[] arr = {2,5,3,5,6,8,2,9};
        int x=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > x)
            {
                x = i;
            }
            
        }
        System.out.println(x);

    }
}
