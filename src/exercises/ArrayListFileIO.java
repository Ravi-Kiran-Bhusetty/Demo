package exercises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListFileIO {

	public static void main(String[] args) {
		
		try {
			FileInputStream f1 = new FileInputStream("C:\\Users\\VJIT\\Desktop\\CapgPrograms\\ArrayList.txt");
			ArrayList<Integer> al = new ArrayList<>();
			StringBuilder s = new StringBuilder();
			int i, j= 0;
			while((i = f1.read()) != -1) {
				j = f1.read();
				while(j >= 0 && j<= 9 && i >= 0 && i<= 9 ) {
					s.append((char)i);
					s.append((char)j);
					
				}
				al.add(Integer.parseInt(s.toString()));
				s.delete(0, 1);
			}	
			System.out.println(al);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
