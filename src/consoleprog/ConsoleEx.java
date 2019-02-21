package consoleprog;

public class ConsoleEx {

	public static void main(String[] args) {
		
		String s = System.console().readLine();
		System.out.println(s);
		char[] c =  System.console().readPassword();
		System.out.println(c);
	}

}
