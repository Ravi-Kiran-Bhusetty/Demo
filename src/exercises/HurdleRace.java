package exercises;

import java.util.Scanner;

public class HurdleRace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int height = sc.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int max = height;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>max)
				max = array[i];
		}
		//System.out.println(max);
		System.out.println(max-height);

	}

}
