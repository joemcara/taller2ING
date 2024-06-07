package labcodeinspection;

import java.util.Locale;

public class Email {
	/*
	 * @autor Joseph carabajo
	 * */
	/*name for name*/
	private final String m_firstName; 
	private final String m_lastName;
	private String password;
	private String department;
	private final int passwordLength = 8;
	private String email;
	/*constructor*/
	public Email(final String firstName,final String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}
	/*method to show the info user*/
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}
	/*method to set the department*/
	public final void setDeparment(final int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			this.department = "dep";
			break;
		}
	}

	private String randomPassword(final int length) {
		final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		final char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			final int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}
	/*method to generate and email*/
	public void generateEmail() {
		this.password = this.randomPassword(this.passwordLength);
		this.email = this.m_firstName.toLowerCase(Locale.ROOT) + this.m_lastName.toLowerCase(Locale.ROOT) + "@" + this.department.toLowerCase(Locale.ROOT)
				+ ".espol.edu.ec";
	}
}
