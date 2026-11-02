package day22;

public class BinarySearchRecursion {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean ans = findBinary(arr, 0, arr.length - 1, 9);

        System.out.println(ans);
    }

    private static boolean findBinary(int arr[], int low, int high, int target) {

        // Base condition: Element not found
        if (low > high) {
            return false;
        }

        int mid = (low + high) / 2;

        // Element found
        if (arr[mid] == target) {
            System.out.println("Element found at index: " + mid);
            return true;
        }

        // Search in right half
        else if (arr[mid] < target) {
            return findBinary(arr, mid + 1, high, target);
        }

        // Search in left half
        else {
            return findBinary(arr, low, mid - 1, target);
        }
    }
}