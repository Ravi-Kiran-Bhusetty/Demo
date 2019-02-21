package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import objectpassing.Student;

public class SerializeEx {

	public static void main(String[] args) {

		Student student = new Student();
		//student.setName("Ravi");
		//student.setRoll(408);
		//student.setFees(10000);

		try {
			FileOutputStream f1 = new FileOutputStream("C:\\Users\\VJIT\\Desktop\\CapgPrograms\\serial.txt");
			ObjectOutputStream out = new ObjectOutputStream(f1);
			out.writeObject(student);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
