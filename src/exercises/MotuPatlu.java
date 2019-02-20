package exercises;

import java.util.Scanner;

public class MotuPatlu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bricks");
		int n = sc.nextInt();
		if(n==1)
			System.out.println("Patlu");
		else {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + i + i*2;
			if(sum>=n)
			{
				if(sum - i*2 >=n) {
					System.out.println("Patlu");
					break;}
				else {
					System.out.println("Motu");
					break;}
			}
		}}
	}

}
