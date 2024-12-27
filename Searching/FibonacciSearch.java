package Searching;

import java.util.Scanner;

public class FibonacciSearch {
	public static int fibonacciSearch(int[] arr,int target) {
		int fk2=0;
		int fk1=1;
		int fk=fk2+fk1;
		
		while(fk<=arr.length) {
			fk2=fk1;
			fk1=fk;
			fk=fk2+fk1;
		}
		 // Marks the eliminated range from front
		int offset = -1;
		while(fk>1) {
			// Check if fk2 is a valid location
			int i=Math.min(offset+fk2,arr.length-1);
			
			if(arr[i]<target) {
				fk=fk1;
				fk1=fk2;
				fk2=fk-fk1;
				offset=i;
			}else if(arr[i]>target) {
				fk=fk2;
				fk1=fk1-fk2;
				fk2=fk-fk1;
			}
			else {
				return i;
			}
			
		}
		return -1;	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr = {10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100, 105, 109, 120};
		int target=120;
		int res=fibonacciSearch(arr,target);
		if(res!=-1) {
			System.out.print(res);
		}else {
			System.out.print("Element not found");
		}
	}
}
