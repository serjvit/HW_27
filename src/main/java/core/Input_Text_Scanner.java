package core;
import java.io.*;
import java.util.Scanner;
public class Input_Text_Scanner {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Argument passed in: " + args[0]);
		File file = new File(args[0]);
		Scanner s = new Scanner(file);
		while (s.hasNext()) {
			String first_name = s.next();
			String last_name = s.next();
			System.out.println("Full name is: " + first_name + " " + last_name);}
		s.close();
	}

}
/* System.out.println("Argument passed in: " + args[0]);

File file = new File(args[0]);
BufferedReader br = new BufferedReader(new FileReader(file));
while (br.ready()) {
	String first_name = br.readLine();
	String last_name = br.readLine();
	System.out.println("Full name is: " + first_name + " " + last_name);
}
br.close(); */