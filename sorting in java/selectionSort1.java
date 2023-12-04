public class selectionSort1 {

    static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 2, 5, 1, 7, 9, 5};
        
        // Call the selectionSort method
        selectionSort(arr);

        // Print the sorted array
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
