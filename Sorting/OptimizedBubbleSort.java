package Sorting;

public class OptimizedBubbleSort {
	public static int[] optimizedBubbleSort(int[] arr) {
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			boolean swapped=false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					
					// swap using XOR
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j]^arr[j+1];
					arr[j]=arr[j]^arr[j+1];
					swapped=true;
				}
			}
			if(swapped==false) {
				break;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[]= {64, 34, 25, 12, 22, 11, 90 };
		arr=optimizedBubbleSort(arr);
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}
}
