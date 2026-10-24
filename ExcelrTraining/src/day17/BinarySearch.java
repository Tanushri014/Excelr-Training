package day17;

public class BinarySearch {

	public static void main(String[] args) {
		 int arr[] = {10, 20, 30, 40, 50, 60, 70};
	        int key = 50;

	        int low = 0;
	        int high = arr.length - 1;
	        int mid;
	        int flag = 0;

	        while (low <= high) {

	            mid = (low + high) / 2;

	            if (arr[mid] == key) {
	                System.out.println("Element found at index: " + mid);
	                flag = 1;
	                break;
	            }
	            else if (arr[mid] < key) {
	                low = mid + 1;
	            }
	            else {
	                high = mid - 1;
	            }
	        }

	        if (flag == 0) {
	            System.out.println("Element not found");
	        }
	}

}
