package exercises;

import java.util.Scanner;

public class CheckTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
	
		int even = 0, odd = 0;
		if(c[2] == 'A' || c[2] == 'E' || c[2] == 'I' || c[2] == 'O' || c[2] == 'U' || c[2] == 'Y')
			System.out.println("Invalid");
		else {
			for (int i = 0; i < c.length; i++) {
				if(i == 2 || i == 6)
					continue;
				else {
					if(Character.getNumericValue(c[i])%2 == 0)
						even++;
					else
						odd++;
				}
			}
			if(even == 7 || odd == 7)
				System.out.println("Valid");
			else
				System.out.println("Invalid");
		}
	}

}
