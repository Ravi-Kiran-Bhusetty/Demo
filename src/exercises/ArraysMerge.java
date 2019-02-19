package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMerge {

	public static void main(String[] args) {
	
		arraySort(accept());

	}

	private static void arraySort(int[] arr) {
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static int[] accept() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array 1");
		int size1 = sc.nextInt();
		int arr1[] = new int[size1];
		System.out.println("Enter 1st array elements");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the size of array 2");
		int size2 = sc.nextInt();
		int arr2[] = new int[size2];
		System.out.println("Enter 1st array elements");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int arr[] = new int[size1+size2];
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if(i<arr1.length)
				arr[i] = arr1[i];
			else {
				arr[i] = arr2[j];
				j++;
			}
		}
		return arr;
	
	}

}
