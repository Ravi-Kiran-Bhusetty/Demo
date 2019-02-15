package stringfun;

import java.util.Scanner;

public class BankTask {

	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		
		long kotak[][] = new long[2][];
		
		long customerDetails[] = new long[4];
		
		//long accNo, aadharNo, balance, phone;
		
		for (int i = 0; i < kotak.length; i++) {
	        for (int j = 0; j < customerDetails.length; j++) {
	        	System.out.println("Enter the details: ");
	            customerDetails[j] = sc.nextInt();
	        System.out.println(customerDetails[j]);
	        kotak[i]=customerDetails;}
		}
		
		for (int i = 0; i < kotak.length; i++) {
	        for (int j = 0; j < kotak[i].length; j++) {
	            System.out.println(kotak[i][j]+ " ");
	        }
	        System.out.println();
		}
	}
}
