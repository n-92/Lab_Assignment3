package mergeandinsert;

import java.util.Scanner;

public class MainProgram {

	public static int counter =0; //counter to keep track of number of comparisons
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int S = 10; //threshold value 
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
					 
		
		MergeSort.mergeSortOptimised(numbers, S);
		System.out.println("\nOptimised Version");
		PrintList.printList(numbers);
			
		MergeSort.mergeSort(numbersCopy);
		System.out.println("\nNormal Version");
		PrintList.printList(numbersCopy);
		
		
			
			
		}
		
		
	}


