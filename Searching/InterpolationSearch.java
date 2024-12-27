package Searching;

public class InterpolationSearch {
	public static int interpolationSearch(int[] arr,int item,int n) {
		int lowend=0;
		int highend=n-1;
		int element = item;
		
		while(item>=arr[lowend] && item<=arr[highend] && lowend<=highend) {
			int probe=lowend+(((highend-lowend)*(element-arr[lowend]))/(arr[highend]-arr[lowend]));
			
			if(lowend==highend) {
				if(arr[probe]==element)return probe;
				else return -1;
			}
			
			if(arr[probe]==element)return probe;
			
			if(arr[probe]<item) {
				lowend=probe+1;
			}else {
				highend=probe-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] array = {1,20,50,60,600,1000};
        int key = 60;

        int result = interpolationSearch(array, key,array.length);

        if (result != -1) {
            System.out.println("Key found at index " + result);
        } else {
            System.out.println("Key not found in the array");
        }
	}
}
