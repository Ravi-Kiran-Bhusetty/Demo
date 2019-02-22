package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Enter 5 elements");
		for (int i = 0; i < 5; i++) {
			al.add(sc.nextInt());
		}
		System.out.println("Enter element to search");
		int search = sc.nextInt();
		if(al.contains(search))
			System.out.println("Element exists");
		else
			System.out.println("Element not found");
			
		System.out.println(al.indexOf(search));
		/*int i = 0, flag = 0;
		while(!al.isEmpty()) {
			if(search == al.get(i))
				{flag++; break;}
		i++;
	}
	if(flag == 1)
		System.out.println("Element exists at "+(i+1));
	else
		System.out.println("Element not found");*/
	}
}
