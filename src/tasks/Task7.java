package tasks;

public class Task7 {
    public static void main(String[] args){
        int[] arr = {1,4,6,2};
        reverseArray(arr, 0, arr.length - 1); // Reverse the array
        printArray(arr); // Print the reversed array
    }
    public static void reverseArray(int[] arr, int start, int end){
        // Base case
        if (start >= end){
            return;
        }
        // Swap elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Reverse recursively
        reverseArray(arr, start + 1, end - 1);

        // Time complexity: O(n)

    }

    // This method prints the elements of an array
    public static void printArray(int[] arr) {
        double startTime = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // Convert nanoseconds to milliseconds
        System.out.println("\nTime taken: " + duration + " milliseconds");
    }

}


