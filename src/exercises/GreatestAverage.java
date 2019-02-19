package exercises;

import java.util.Scanner;

public class GreatestAverage {

	public static void main(String[] args) {
		moreThanAverage(accept());
	}

	private static double[] accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		double arr[] = new double[size];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		return arr;
	}

	private static void moreThanAverage(double[] arr) {
		
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		double avg = (double)sum/arr.length;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > avg)
				System.out.println(arr[i]+" ");
		}
		
	}

}
