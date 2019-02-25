package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1");
		String s1 = sc.next();
		System.out.println("Enter string 2");
		String s2 = sc.next();

		ArrayList<Character> al1 = new ArrayList<>();
		ArrayList<Character> al2 = new ArrayList<>();
		if(s1.length() == s2.length()) {
		for (int i = 0; i < s1.length(); i++) {

			al1.add(new Character(s1.charAt(i)));
		}
		System.out.println(al1);

		for (int i = 0; i < s1.length(); i++) {

			al2.add(new Character(s2.charAt(i)));
		}
		Collections.sort(al2);
		Collections.sort(al1);

		Iterator itr1 = al1.iterator();
		Iterator itr2 = al2.iterator();
		if (al1.equals(al2))
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
		}
		else
			System.out.println("Not Anagrams");
	}

}
