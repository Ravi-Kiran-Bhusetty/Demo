package exercises;

import java.util.Scanner;

public class FacebookPicture {

	public static void main(String[] args) {
		accept();

	}

	private static void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of photo");
		int l = sc.nextInt();
		System.out.println("Enter width and height of photo");
		int w = sc.nextInt();
		int h = sc.nextInt();
		if(w>=l && h>=l) {
			if(w == h)
				System.out.println("Accepted");
			else
				System.out.println("Crop It");
		}
		else
			System.out.println("Upload Another");
	

}
}