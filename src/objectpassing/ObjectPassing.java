package objectpassing;

import java.util.Scanner;

public class ObjectPassing {

	Scanner sc = new Scanner(System.in);
	
	Student s = new Student();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		ObjectPassing ob = new ObjectPassing();
		s1 = ob.accept();
		ob.display(s1);
	}

	private void display(Student s) {
		System.out.println(s.getName());
		System.out.println(s.getRoll());
		System.out.println(s.getFees());
		
	}

	private Student accept() {
		System.out.println("Enter name: ");
		s.setName(sc.next());
		System.out.println("Enter roll no: ");
		s.setRoll(sc.nextInt());
		System.out.println("Enter fees: ");
		s.setFees(sc.nextDouble());;
		return s;
		
		
	}

}
