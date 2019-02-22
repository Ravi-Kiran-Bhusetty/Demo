package datasnumberscurrencies;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("now: %s%n", LocalTime.now());
		System.out.printf("6 months from now: %s%n", LocalDateTime.now().plusMonths(6));
	}

}
