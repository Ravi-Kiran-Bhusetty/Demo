import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class fileio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\VJIT\\Desktop\\CapgPrograms\\filedemo.txt");
			System.out.println("Enter an integer ");
			int n = sc.nextInt();
			fileOutputStream.write(n);
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
