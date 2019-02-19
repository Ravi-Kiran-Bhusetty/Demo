package exercises;

import java.util.Scanner;

public class BirthdayCandles {
	static int count = 0;

	static int birthdayCakeCandles(int[] ar) {
		int temp;
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] >= ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[ar.length - 1] == ar[i])
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		int candle[] = new int[year];
		for (int i = 0; i < candle.length; i++) {
			candle[i] = sc.nextInt();
		}
		int c = birthdayCakeCandles(candle);
		System.out.println(c);
	}

}
