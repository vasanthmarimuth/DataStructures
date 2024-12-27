package Searching;

// Linear search compare in each iteration but not each iteration in sentinel search
// Sentinel search == காவலாளி தேடல்

public class SentinelLinearSearch {
	public static int sentinelSearch(int[] arr,int x){
		int n=arr.length;
		int last=arr[n-1];
		arr[n-1]=x;
		
		int i=0;
		while(arr[i]!=x) {
			i++;
		}
		
		arr[n-1]=last;
		
		if(i<n-1 || arr[n-1]==x) return i;
		
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {12,23,45,56,67,89};
		int target = 89;
		int index=sentinelSearch(arr,target);
		if(index!=-1) {
			System.out.print("Element found at the index of:"+index);
		}else {
			System.err.print("Element not found");
		}
	}
}
