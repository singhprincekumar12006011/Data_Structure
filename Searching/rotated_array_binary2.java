/*
let a rotated array 'arr' is given.
arr[] = {30,40,50,60,10,20};
find the index of x
where x = 10.

algorithm:- 
take low and high as 0 and n-1 respectively where n is length of an array.
while(low <= high)
{
 take mid = (low + high)/2;
 if(arr[mid] == x )
 return mid;
now find the which side is sorted. 
if(x >= arr[low] && x < arr[mid])                                           -----------condition (1)
{
    then is present in left side 
    so, change high = mid-1;
    else if it is not true then,
    change low = mid+1;
}
if condition 1 is not satisfied then it is present in right side 
so, 
else{
    if(x > arr[mid] && x <= arr[high])
    then set low = mid + 1;
    else
    high  = mid-1
}

}
if all above condition is not satisfied then return -1.



*/
public class rotated_array_binary2 {
    static int search(int arr[], int x, int n)
    {
        int low =0;
        int high = n-1;
        while(low <= high)
        {
            int mid=(low+high)/2;
            if(arr[mid] == x)
            return mid;

            if(arr[low]<=arr[mid])
            {
                if(x >= arr[low] && x < arr[mid])
                high = mid-1;
                else
                low = mid+1;
            }
            else
            {
                if(x > arr[mid] && x <= arr[high])
                low=mid+1;
                else
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = { 30,40,50,60,10,20};
        int x = 10;
        int n = arr.length;
        System.out.println(search(arr, x, n));
    }
}
