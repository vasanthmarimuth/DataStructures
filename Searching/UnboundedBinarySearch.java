package Searching;

public class UnboundedBinarySearch {
		public static int unboundedBinarySearch(int[] arr,int target) {
			int low=0;
			int high=1;
			
			while(high < arr.length && arr[high]<target) {
				low=high;
				high*=2;
				
			}
			
			high=Math.min(high, arr.length-1);
			
			return binarySearch(arr,target,low,high);
		}
		public static int binarySearch(int[] arr,int target,int low,int high) {
			while(low<=high) {
				int mid=low+(high-low)/2;
				if(arr[mid]==target) {
					return mid;
				}else if(arr[mid]<target){
					low=mid+1;
				}else {
					high=mid-1;
				}
			}
			return -1;
		}
		public static void main(String[] args) {
			int[] array = {1, 3, 8, 10, 15, 20, 25, 30, 35, 40, 45, 50};
	        int key = 53;

	        int result = unboundedBinarySearch(array, key);

	        if (result != -1) {
	            System.out.println("Key found at index " + result);
	        } else {
	            System.out.println("Key not found in the array");
	        }
		}
}
