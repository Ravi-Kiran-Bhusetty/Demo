package exercises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CeaserCipher {

	public static void main(String[] args) {

		try {
			FileInputStream f1 = new FileInputStream("C:\\Users\\VJIT\\Desktop\\CapgPrograms\\inputstring.txt");
			FileInputStream f2 = new FileInputStream("C:\\Users\\VJIT\\Desktop\\CapgPrograms\\key.txt");
			int key = f2.read()-48;
			
			StringBuilder s = new StringBuilder();
			int i = 0;
			while ((i = f1.read()) != -1) {
				s.append((char) i);
			}

			//String s1 = s.toString();
			encrypt(s.toString(), key);
			decrypt(key);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	private static void decrypt(int n) {

		
		try {
			FileInputStream f1 = new FileInputStream("C:\\Users\\VJIT\\Desktop\\CapgPrograms\\outputstring.txt");
			StringBuilder s = new StringBuilder();
			int j = 0;
			while ((j = f1.read()) != -1) {
				s.append((char) j);
			}
			String msg = s.toString();
			char[] letters = msg.toCharArray();

			StringBuilder decryptedMsg = new StringBuilder();

			for (int i = 0; i < letters.length; i++) {
				decryptedMsg.append((char) (byte) (letters[i] - n));
			}
			System.out.println(decryptedMsg);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	private static void encrypt(String s, int n) {

		StringBuilder encryptMsg = new StringBuilder();

		char[] letters = s.toCharArray();

		for (int i = 0; i < letters.length; i++) {
			encryptMsg.append((char) (byte) (letters[i] + n));
		}
		System.out.println(encryptMsg);
		String s1 = encryptMsg.toString();
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\VJIT\\Desktop\\CapgPrograms\\outputstring.txt");

			byte[] b = s1.getBytes();
			fileOutputStream.write(b);
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
