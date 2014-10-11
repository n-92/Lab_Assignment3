

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int S = 10; //threshold value
		long duration_for_optimised = 0;
		long duration_for_normal=0;
		int count_optimised_merge = 0, count_merge = 0;
		
		final int min = 0;
		final int range = 10000; //range is between min to 99999999
		int[] numbers;
		int[] numbersCopy;
		int size =0;
		
		System.out.println("Enter the size of phoneBook");
		Scanner scan = new Scanner(System.in);
		size = scan.nextInt();
		numbers = numbersCopy = new int[size];
		ListPopulate.populate(numbers,numbersCopy ,size, range, min);
		
		System.out.println("Original");
		PrintList.printList(numbers);
		
		System.out.println("\nCopy");
		PrintList.printList(numbersCopy);
					 
		CpuTimer.startTime = System.nanoTime(); 
		MergeSort.mergeSortOptimised(numbers, S);
		CpuTimer.endTime = System.nanoTime();
		duration_for_optimised = CpuTimer.duration();
		System.out.println("\n\nOptimised Version");
		PrintList.printList(numbers);
		count_optimised_merge = InsertSort.insertSortCount + MergeSort.mergeSortCount;
		System.out.println("\nTime taken ="+duration_for_optimised+" microseconds");
		System.out.println("Number of counts = "+ count_optimised_merge);
		
		CpuTimer.startTime = System.nanoTime();
		MergeSort.mergeSort(numbersCopy);
		CpuTimer.endTime = System.nanoTime();
		duration_for_normal = CpuTimer.duration();
		System.out.println("\nNormal Version");
		PrintList.printList(numbersCopy);
		count_merge = MergeSort.mergeSortCount;
		System.out.println("\nTime taken ="+duration_for_normal+" microseconds");
		System.out.println("Number of counts = "+ count_merge);
		}
		
		
	}


