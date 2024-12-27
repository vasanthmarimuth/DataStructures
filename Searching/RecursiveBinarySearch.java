package Searching;

public class RecursiveBinarySearch {
	public static int recursiveBinarySearch(int[] arr, int x,int left,int right) {
		
			if(left>right)return -1;
		
			int n=arr.length;
			int mid=left+(right-left)/2;
			
			if(arr[mid]==x) {
				return mid;
				}
			else if(arr[mid]<x) {
				return recursiveBinarySearch(arr,x,mid+1,right);
				}
			else {
				return recursiveBinarySearch(arr,x,left,mid-1);
				}
	}
	public static void main(String[] args) {
		int[] array = {1,20,50,60,600,1000};
        int key = 1000;

        int result = recursiveBinarySearch(array, key,0,array.length-1);

        if (result != -1) {
            System.out.println("Key found at index " + result);
        } else {
            System.out.println("Key not found in the array");
        }
	}
}
