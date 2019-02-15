package diagonaldifference;

import java.util.Scanner;

public class DiagonalDifference {

	public int front=0, back=0;
	int t;
	public int diffOperation(int m[][])
	{
		//System.out.println(m[0][1]);
		for (int i = 0; i < m.length; i++) {
			int j=i;
			front = front + m[i][j];
		}
		//System.out.println(front);
		int k=m[0].length-1;
		for (int i = 0; i < m.length; i++) {
			
			back = back + m[i][k];
			k--;
		}
		//System.out.println(back);
		//System.out.println((front-back));
		t=Math.abs(front-back);
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DiagonalDifference d = new DiagonalDifference();
		int row,col;
		System.out.println("Enter rows and cols");
		row = sc.nextInt();
		col = sc.nextInt();
		int m[][] = new int[row][col];
		if(row != col)
			System.out.println("you should enter square matrix values");
		else
		{
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.println("Enter the number");
					m[i][j] = sc.nextInt();
				}
			}
			//System.out.println(m[0][0]);
			int res = d.diffOperation(m);
			System.out.println(res);
		}
		
	}

}
