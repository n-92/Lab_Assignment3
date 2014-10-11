

public class ListPopulate {
	
	static void populate(int[] arr,int[] arrCopy,int size,int range, int min){
		for (int i =0; i<size; i++){
			arrCopy[i] = arr[i] =(int)(Math.random() * range) + min;
		}
	}
}
