package mergeandinsert;

public class MergeSort {
	
	public static int mergeSortCount = 0;

	static void mergeSort(int[] arr){
			
			if (arr.length <=1) return;
			int mid = (arr.length)/2;
			int[] left =new int[mid];
			int[] right = new int[arr.length-mid];
			
			for (int i = 0; i< mid; i++)
				left[i] = arr[i];
			
			for (int i = mid; i< arr.length ; i++)
				right[i-mid] = arr[i];
			
			mergeSort(left);
			mergeSort(right);
			merge(arr,left,right);
	}
	
	static void mergeSortOptimised(int[] arr, int threshhold){
		
		if (arr.length > threshhold){
			if (arr.length <=1) return;
			int mid = (arr.length)/2;
			int[] left =new int[mid];
			int[] right = new int[arr.length-mid];
			
			for (int i = 0; i< mid; i++)
				left[i] = arr[i];
			
			for (int i = mid; i< arr.length ; i++)
				right[i-mid] = arr[i];
			
			mergeSortOptimised(left,threshhold);
			mergeSortOptimised(right,threshhold);
			merge(arr,left,right);
		}
		else{
			InsertSort.insertSort(arr, arr.length);
		}
	}
	
	private static void merge(int[] arr, int[] left, int[] right){
		int l = 0;
		int r = 0;
		int a = 0;
		
		while(l < left.length && r < right.length){
			if (left[l] <= right[r]){
				mergeSortCount++;
				arr[a] = left[l];
				l++; 
			}else{
				arr[a] = right[r];
				r++;
			}
			a++;
		}
		
		while(l < left.length){
			arr[a] = left[l];
			l++; a++;
		}
		
		while(r < right.length){
			arr[a] = right[r];
			r++; a++;
		}
	}
}
