package exercises;

import java.util.Scanner;

public class Time12_24 {

	static String sr, v;

	static String timeConversion(String s) {
		String a[] = s.split(":");
		if (a[2].endsWith("AM") && a[0].equals("12")) {
			a[0] = "00";
		} 
		else {
			if (a[0].equals("12"))
				a[0] = "12";
			else {
				int n = Integer.parseInt(a[0]);
				n = n + 12;
				a[0] = String.valueOf(n);
			}
		}
		v = a[2].substring(0, 2);

		sr = a[0] + ":" + a[1] + ":" + v;
		return sr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String res = timeConversion(s);
		System.out.println(res);
	}
}
