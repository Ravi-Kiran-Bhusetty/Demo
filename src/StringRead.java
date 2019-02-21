import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StringRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\VJIT\\Desktop\\CapgPrograms\\filedemo.txt");
			int i;
			while((i = fileInputStream.read()) != -1)
				System.out.print((char)i);
			fileInputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
