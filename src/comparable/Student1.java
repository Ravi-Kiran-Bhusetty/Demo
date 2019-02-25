package comparable;

public class Student1 implements Comparable<Student1> {

	String name;
	int roll;
	int age;
	Student1(int roll, String name, int age) {
		// TODO Auto-generated constructor stub
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	public int compareTo(Student1 s) {
		if(age == s.age)
			return 0;
		else if(age>s.age)
			return 1;
		else
			return -1;
	}
	
}
