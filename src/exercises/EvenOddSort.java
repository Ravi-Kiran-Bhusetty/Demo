package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSort {

	public static void main(String[] args) {
		finalSort(accept());
	}

	private static void finalSort(int[] arr) {
		
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0)
				c++;
		}
		
		int[] even = new int[c];
		int[] odd = new int[arr.length-c];
		int j = 0, k = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0) {
				even[j] = arr[i];
				j++;
			}
			else {
				odd[k] = arr[i];
				k++;
			}
		}
		
		Arrays.sort(even);
		Arrays.sort(odd);
		int mergedArray[] = new int[arr.length];
		System.arraycopy(even, 0, mergedArray, 0, even.length);
		System.arraycopy(odd, 0, mergedArray, even.length, odd.length);
		/*j = 0;
		for (int i = 0; i < mergedArray.length; i++) {
			if(i<c)
				mergedArray[i] = even[i];
			else {
				mergedArray[i] = odd[j];
				j++;
			}
		}*/
		
		System.out.println(Arrays.toString(mergedArray));
		/*for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}*/
	}

	private static int[] accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
}
