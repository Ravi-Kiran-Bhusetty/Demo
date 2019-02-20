package exercises;

import java.util.Scanner;

public class StringCombine {

	public static void main(String[] args) {
		
		accept();

	}

	private static void accept() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1");
		String s1 = new String(sc.next());
		System.out.println("Enter String 2");//len = Math.abs(s1.length()-s2.length());
		String s2 = new String(sc.next());
		
		StringBuilder res = new StringBuilder();
		int len;
		if(s1.length()==s2.length())
			len = s1.length();
		else if(s1.length()>s2.length())
			len = s2.length();
		else
			len = s1.length();
		for (int i = 0; i < len; i++) {
			
				res.append(s1.charAt(i));
				res.append(s2.charAt(i));
		}
		if(s1.length()<s2.length())
			for (int i = len ; i < s2.length() ; i++) {
				res.append(s2.charAt(i));
			}
		else
			for (int i = len ; i < s1.length(); i++) {
				res.append(s1.charAt(i));
			}
		System.out.println(res);
	}

}
