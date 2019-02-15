package Basics;

import java.util.Scanner;

public class Arithmetic {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter First Number: ");
		short num1= sc.nextShort();
		System.out.print("Enter Second Number: ");
		short num2= sc.nextShort();
		System.out.println("Sum is: "+(num1+num2));
	}
}
