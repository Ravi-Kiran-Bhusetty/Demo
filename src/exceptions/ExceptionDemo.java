package exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data;
		System.out.println("Start");
		try {
			data = 10/0;
		}catch(ArithmeticException e) {
			//System.out.println(data);
		}
		System.out.println("End");
	}

}
