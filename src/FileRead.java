import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\VJIT\\Desktop\\CapgPrograms\\filedemo.txt");
			
			System.out.println(fileInputStream.read());
			fileInputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
