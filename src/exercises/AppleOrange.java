package exercises;

import java.util.Scanner;

public class AppleOrange {

	static void appleOrangeCount(int s, int t, int a, int b, int[] apple, int[] orange)
	{
		int appleCount = 0, orangeCount = 0;
		for (int i = 0; i < apple.length; i++) {
			if ((a+apple[i]) >= s && (a+apple[i]) <= t)
				appleCount++;
		}
		for (int i = 0; i < orange.length; i++) {
			if ((b+orange[i]) >= s && (b+orange[i]) <= t)
				orangeCount++;
		}
		System.out.println(appleCount);
		System.out.println(orangeCount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt();
		int t=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int noOfApples=sc.nextInt();
		int noOfOranges=sc.nextInt();
		int apple[] = new int[noOfApples];
		int orange[] = new int[noOfOranges];
		for (int i = 0; i < apple.length; i++) {
			apple[i] = sc.nextInt();
		}
		for (int i = 0; i < orange.length; i++) {
			orange[i] = sc.nextInt();
		}
		appleOrangeCount(s, t, a, b, apple, orange);
	}

}
