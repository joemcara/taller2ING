package labcodeinspection;
/*
 * @autor Joseph carabajo
 * */
import java.util.Scanner;

@SuppressWarnings("PMD.UseUtilityClass")
public class EmailApp {
	
	public static void main(String[] args) {
		final Scanner inputValue = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		final String firstName = inputValue.nextLine();

		System.out.print("Enter your last name: ");
		final String lastName = inputValue.nextLine();

		System.out.print("\nDEPARTMENT CODE\n1. for sales\n2. for Development\n3. for accounting\nEnter code: ");

		final int depChoice = inputValue.nextInt();
		inputValue.close();

		final Email email = new Email(firstName, lastName);
		email.setDeparment(depChoice);
		email.generateEmail();
		email.showInfo();
		
	}

}
