package plusminus;

import java.util.Scanner;

public class PlusMinusTask {

	public static void plusMinus(int[] arr)
	{
		int c1=0, c2=0, c3=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0)
				c1++;
			else if(arr[i]<0)
				c2++;
			else
				c3++;
		}
		System.out.println(((float)c1/arr.length));
		System.out.println(((float)c2/arr.length));
		System.out.println(((float)c3/arr.length));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		plusMinus(a);
	}

}
