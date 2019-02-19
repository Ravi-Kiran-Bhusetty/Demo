package exceptions;

public class CustomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new CustomException(); // o/p comes in red as I said System.err in CustomException class
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
