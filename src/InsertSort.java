public class InsertSort {
	public static int insertSortCount = 0;
	static void insertSort(int[]arr, int size){
		int temp=0;
		for (int i=1; i<size;i++){
			for (int j=i; j>0; j--){
				if(arr[j]<arr[j-1])
				{
					insertSortCount++;
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1]=temp;
				}
				else{ 
					insertSortCount++;
					break;}
			}
		}
	}
	
}
