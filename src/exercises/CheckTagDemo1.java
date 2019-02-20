package exercises;

import java.util.Scanner;

public class CheckTagDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		int[] a = new int[7];
		int count = 0;
		if(c[2] == 'A' || c[2] == 'E' || c[2] == 'I' || c[2] == 'O' || c[2] == 'U' || c[2] == 'Y')
			System.out.println("Invalid");
		else
		{
			int j = 0; 
			for (int i = 0; i < s.length(); i++) {
				
				if(Character.getNumericValue(c[i])>=0 && Character.getNumericValue(c[i])<=9) {
					a[j] = Character.getNumericValue(c[i]);
					j++;
			}}
			for (int i = 0; i < a.length-1; i++) {
				if(i==1 || i==4)
					continue;
				if((a[i]+a[i+1])%2 == 0)
					count++;
			}
			if(count == 4)
				System.out.println("Valid");
			else
				System.out.println("Invalid");
		}

	}

}
