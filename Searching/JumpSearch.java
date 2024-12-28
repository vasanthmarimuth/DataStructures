package Searching;

public class JumpSearch {
	public static int jumpSearch(int[] arr,int x){
		
		int n=arr.length;
		int block=(int)Math.sqrt(n);
		
		int left=0;
		int right=0;
		
		while(right<n && arr[right]<=x) {
			left=right;
			right+=block;
		}
		
		if(left>=n) {
			left=n-1;
		}
		
		while(arr[left]<x && left<Math.min(right,n-1)) {
			left++;
		}
		
		if(arr[left]==x) {
			return left;
		}
		
		return -1;
	}
	 public static void main(String [ ] args)
	    {
	        int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21,34, 55, 89, 144, 233, 377, 610};
	        int x = 610;
	 
	        int index = jumpSearch(arr, x);
	 
	        if(index!=-1) {
				System.out.print("Element found at the index of:"+index);
			}else {
				System.err.print("Element not found");
			}
	    }
}
