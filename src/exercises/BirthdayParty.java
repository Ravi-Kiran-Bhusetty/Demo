package exercises;

import java.util.Scanner;

public class BirthdayParty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of friends");
		int n = sc.nextInt();
		System.out.println("Enter the number of chocolates in the pack");
		int c = sc.nextInt();
		if(c%n==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
