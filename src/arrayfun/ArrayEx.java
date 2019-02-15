package arrayfun;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no. of elements: ");
		int num = sc.nextInt();

		int a[] = new int[num];

		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the number: ");
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		/*System.out.println("Enter the rows and columns");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int b[][] = new int[row][col]; 
		
		for (int i = 0; i < row; i++) {
			
		}*/

	}

}
