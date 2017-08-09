package core;
import java.io.Console;

public class Input_Console {

	public static void main(String[] args) {
		
		Console c = System.console();
		
		if (c == null) {System.err.println("Console is not available"); System.exit(0);}
		String first_name = c.readLine();
		String last_name = c.readLine();
		System.out.println("Your full name is: " + first_name + " " + last_name);
	}

}
