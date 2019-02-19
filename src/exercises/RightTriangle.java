package exercises;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sides: ");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		
		if ((s1*s1 == (s2*s2+s3*s3)) || (s2*s2 == (s1*s1+s3*s3)) || (s3*s3 == (s2*s2+s1*s1)))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
