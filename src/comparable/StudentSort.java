package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSort {

	public static void main(String[] args) {
		
		ArrayList<Student1> al = new ArrayList<>();
		al.add(new Student1(1,"Ravi",20));
		al.add(new Student1(5,"B",27));
		al.add(new Student1(2,"Kiran",22));
		
		Collections.sort(al);
		
		for (Student1 student1 : al) {
			System.out.println(student1.roll+" "+student1.name+" "+student1.age);
		}
	}

}
