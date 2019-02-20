package exercises;

import java.util.Scanner;

public class CheckTagDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
	
		if(c[2] == 'A' || c[2] == 'E' || c[2] == 'I' || c[2] == 'O' || c[2] == 'U' || c[2] == 'Y')
			System.out.println("Invalid");
		else
		{
			if((Character.getNumericValue(c[0]) + Character.getNumericValue(c[1]))%2 == 0 && (Character.getNumericValue(c[3]) + Character.getNumericValue(c[4]))%2 == 0 && (Character.getNumericValue(c[4]) + Character.getNumericValue(c[5]))%2 == 0 && (Character.getNumericValue(c[7]) + Character.getNumericValue(c[8]))%2 == 0)
				System.out.println("Valid");
			else
				System.out.println("Invalid");
		}
	}

}
