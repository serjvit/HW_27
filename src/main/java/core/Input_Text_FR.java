package core;

import java.io.*;

public class Input_Text_FR {

	public static void main(String[] args) throws IOException {

//		System.out.println("TEST");
//		for (String s: args) {
//            System.out.println(s);
//        }
		System.out.println("Argument passed in: " + args[0]);

		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		while (br.ready()) {
			String first_name = br.readLine();
			String last_name = br.readLine();
			System.out.println("Full name is: " + first_name + " " + last_name);
		}
		br.close();

	}

}