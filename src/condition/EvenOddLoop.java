package condition;
import java.util.Scanner;

public class EvenOddLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num= sc.nextInt();
		
		if(num%2==0)
			num+=10;
		else
			num+=15;
		System.out.println(num);
	}
	
	
}


