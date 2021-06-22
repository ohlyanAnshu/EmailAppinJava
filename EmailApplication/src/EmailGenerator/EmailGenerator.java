package EmailGenerator;

import java.util.Scanner;

public class EmailGenerator {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailcapacity = 500;
	private String alternateEmail;
	
	public EmailGenerator(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		this.password = randomPassword();
		this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + 
				"@" + department + "." + "company.com";
		
	}
	
	private String setDepartment() {
		System.out.println("Enter the department\n1. Sales\n2. Development\n3. Accounting\n4. None");
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		
		switch(depChoice) {
		    case 1: return "Sales";
		    case 2: return "Development";
		    case 3: return "Accounting";
		    default: return "";
		}
	}
	
	
	private String randomPassword() {		
		String choosenFrom = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123467890!@#$^&*()";		
		StringBuilder randPass = new StringBuilder();	
		
		for(int i = 0; i < 10; i++) {			
			int number = (int)(choosenFrom.length() * Math.random());			
			randPass.append(choosenFrom.charAt(number));			
		}		
		return randPass.toString();
	}
	
	public void setMailCapacity(int number) {
		this.mailcapacity = number;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public void changePassword(String pass) {
		this.password = pass;
	}
	
	public int getMailCapacity() {
		return this.mailcapacity;
	}
	
	public String getAltEmail() {
		return this.alternateEmail;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String showInfo() {
		return "Name: " + this.firstName + " " + this.lastName +
				"\nEmail: " + this.email + 
				"\nPassword: " + this.password +
				"\nMailbox Capacity: " + this.mailcapacity + "mb";
 	}
}

