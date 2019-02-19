package exceptions;

import java.util.Scanner;

public class ExceptionTask {
	
	static int n, j=0;
	static double a[] = new double[n];
	static void power(double[] base, double[] power)
	{
		System.out.println("Method Entered");
		for (int i = 0; i < power.length; i++) {
			System.out.println("Loop Entered");
			try {
				if (base[i]>0 && power[i]>0) {
					a[j] = Math.pow(base[i], power[i]);
					System.out.println(a[j]+" ");
					j++;
				}
				else if(base[i]==0 && power[i]==0)
					throw new NotAZero();
				else
					throw new NotANegative();
			}catch(Exception e) {}
			
		}
		
		/*for (int i = 0; i < j; i++) {
			System.out.println(a[i]+" ");
		}*/
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Elements: ");
		n = sc.nextInt();
		double base[] = new double[n];
		double power[] = new double[n];
		System.out.print("Enter "+n+" bases: ");
		for (int i = 0; i < base.length; i++) {
			base[i] = sc.nextInt();
		}
		System.out.print("Enter "+n+" powers: ");
		for (int i = 0; i < power.length; i++) {
			power[i] = sc.nextInt();
		}
		power(base,power);
	}

}
