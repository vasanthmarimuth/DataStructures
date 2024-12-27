package Searching;

// for infinite array size

public class ExponentialSearch {
	public static int exponentialSearch(int[] arr,int x) {
		int n=arr.length;
		if(n==0)return -1;
		
		
		int i=1;
		
		while(i<n && arr[i]<x) {
			i*=2;
		}
		int left = i/2;
		int right = Math.min(i, n-1);
		
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(arr[mid]==x)return mid;
			else if(arr[mid]<x)left=mid+1;
			else right=mid-1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {12,23,45,56,67,89};
		int target = 67;
		int index=exponentialSearch(arr,target);
		if(index!=-1) {
			System.out.print("Element found at the index of:"+index);
		}else {
			System.err.print("Element not found");
		}
	}
}
