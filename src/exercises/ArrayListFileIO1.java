package exercises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListFileIO1 {

	public static void main(String[] args) {
		
		try {
			FileInputStream f1 = new FileInputStream("C:\\Users\\VJIT\\Desktop\\CapgPrograms\\ArrayList.txt");
			ArrayList<Integer> al = new ArrayList<>();
			StringBuilder s = new StringBuilder();
			int i;
			while((i = f1.read()) != -1)
			{
				s.append(i-48);
			}
			String s1 = s.toString();
			//s1.split('-');
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
