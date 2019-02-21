package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import objectpassing.Student;

public class DeSerialization {

	public static void main(String[] args) {

		try {
			FileInputStream f1 = new FileInputStream("C:\\\\Users\\\\VJIT\\\\Desktop\\\\CapgPrograms\\\\serial.txt");
			ObjectInputStream in = new ObjectInputStream(f1);
			Student s = (Student) in.readObject();
			System.out.println(s.getName() + " " + s.getRoll() + " " + s.getFees());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
