package mergeandinsert;

import java.util.Random;

public class ListPopulate {
	
	static void populate(int[] arr,int size,int range, int min){
		Random rand = new Random();
		for (int i =0; i<size; i++){
			arr[i] =(int)(Math.random() * range) + min;
		}
	}
}
