package exercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Panagrams {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		HashSet<Character> al = new HashSet<>();
		
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
			al.add(s.charAt(i));
		}
		System.out.println(al.size());
		System.out.println(al);
		if(al.size() == 27)
			System.out.println("Panagram");
		else
			System.out.println("Not Panagram");
	}

}
