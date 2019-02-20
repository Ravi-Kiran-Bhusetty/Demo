package exercises;

import java.util.Scanner;

public class TrainSeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem = num%12;
		switch(rem)
		{
		case 0: System.out.println((num-11)+" WS");
				break;
		case 1: System.out.println((num+11)+" WS");
		break;
		case 11: System.out.println((num-9)+" MS");
		break;
		case 2: System.out.println((num+9)+" MS");
		break;
		case 10: System.out.println((num-7)+" AS");
		break;
		case 3: System.out.println((num+7)+" AS");
		break;
		case 9: System.out.println((num-5)+" AS");
		break;
		case 4: System.out.println((num+5)+" AS");
		break;
		case 8: System.out.println((num-3)+" MS");
		break;
		case 5: System.out.println((num+3)+" MS");
		break;
		case 7: System.out.println((num-1)+" WS");
		break;
		case 6: System.out.println((num+1)+" WS");
		break;
		default: System.out.println("Seat not available");
		}
	}

}
