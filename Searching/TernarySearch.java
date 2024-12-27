package Searching;

public class TernarySearch {
	public static int ternarySearch(int[] arr, int target, int left, int right) {
		while(left<=right) {
			int mid1=left+(right-left)/3;
			int mid2=right-(right-left)/3;
			
			if(arr[mid1]==target) {
				return mid1;
			}
			else if(arr[mid2]==target) {
				return mid2;
			}
			else if(arr[mid1]>target) {
				right=mid1-1;
			}
			else if(arr[mid2]<target) {
				left=mid2+1;
			} 
			else {
			left=mid1;
			right=mid2;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array = {1,20,50,60,600,1000};
        int key = 50;

        int result = ternarySearch(array, key,0,array.length-1);

        if (result != -1) {
            System.out.println("Key found at index " + result);
        } else {
            System.out.println("Key not found in the array");
        }
	}
}
