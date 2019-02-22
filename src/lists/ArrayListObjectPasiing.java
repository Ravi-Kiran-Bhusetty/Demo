package lists;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import objectpassing.Student;

public class ArrayListObjectPasiing {

	static int count = 1;
	public static void main(String[] args) {
		
		ArrayList<Student> student = new ArrayList<>();
		student.add(setInfo());
		student.add(setInfo());
		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\VJIT\\Desktop\\CapgPrograms\\ArrayListObject.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(student);
			out.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	private static Student setInfo() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details of student "+count);
		Student student = new Student();
		student.setName(sc.next());
		student.setRoll(sc.nextInt());
		student.setFees(sc.nextDouble());
		count++;
		return student;
	}

}
