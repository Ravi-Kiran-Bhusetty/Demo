package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class SmallLarge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array Elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter required smallest and largest numbers");
		int small = sc.nextInt();
		int large = sc.nextInt();
		Arrays.sort(arr);
		requiredSmallest(arr, small);
		requiredLargest(arr, large);

	}

	private static void requiredLargest(int[] arr, int large) {
		System.out.println(arr[(arr.length - 1) - (large - 1)]);

	}

	private static void requiredSmallest(int[] arr, int small) {
		// TODO Auto-generated method stub
		System.out.println(arr[small - 1]);
	}

}
