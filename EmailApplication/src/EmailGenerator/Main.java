package EmailGenerator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		EmailGenerator e1 = new EmailGenerator("Anshu", "Ohlyan");
		
		System.out.println(e1.showInfo());
		
		e1.changePassword("Anshu@123");
		
		System.out.println(e1.showInfo());
	}

}
