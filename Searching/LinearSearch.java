package Searching;

public class LinearSearch {
	public static int linearSearch(int[] arr,int target) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array = {1,20,50,60,600,1000};
        int key = 600;

        int result = linearSearch(array, key);

        if (result != -1) {
            System.out.println("Key found at index " + result);
        } else {
            System.out.println("Key not found in the array");
        }
	}
}
