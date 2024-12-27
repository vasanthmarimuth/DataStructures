package Searching;

public class BinarySearch {
	public static int binarySearch(int[] arr,int target) {
		int low=0;
		int high=arr.length-1;
		 while(low<=high) {
			 int mid=low+(high-low)/2;
			 if(arr[mid]==target)return mid;
			 else if(arr[mid]<target)low=mid+1;
			 else high=mid-1;
		 }
		 return -1;
	}
	public static void main(String[] args) {
		int[] array = {1,20,50,60,600,1000};
        int key = 20;

        int result = binarySearch(array, key);

        if (result != -1) {
            System.out.println("Key found at index " + result);
        } else {
            System.out.println("Key not found in the array");
        }
	}
}
