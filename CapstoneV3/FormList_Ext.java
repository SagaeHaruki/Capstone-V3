import java.util.*;

public class FormList_Ext extends Form_List {
	Scanner Scan = new Scanner(System.in);

	/*
	 * ------------------------------- FORM CHOICES -------------------------------
	 */

	void Run_Choices() {
		System.out.print("\t\t\t\t\tChoose Between Visa or Passport: ");
		String c_Input = Scan.nextLine();
		if (c_Input.equalsIgnoreCase("Visa")) {
			System.out.print(
					"\n---------------------------------------------------------------------------------------------------------------------------\n\n");

			System.out.print("\t\t\t\t\t     You are now using Forms for Visa");
			Form_Visa();
		} else if (c_Input.equalsIgnoreCase("Passport")) {
			System.out.print(
					"\n---------------------------------------------------------------------------------------------------------------------------\n\n");

			System.out.print("\t\t\t\t\t     You are now using Forms for Passport");
			Form_Passport();
		} else {
			System.out.print(
					"\n---------------------------------------------------------------------------------------------------------------------------\n\n");
			System.out.print("\t\t\t\t\t\tPlease Try Again!\n\n");
			Run_Choices();
		}

	}

	/*
	 * ------------------------------- PASSPORT FORM CHOICES
	 * -------------------------------
	 */
	void Form_Passport() {
		try {

			System.out.print(
					"\n\n---------------------------------------------------------------------------------------------------------------------------\n\n");
			System.out.print(
					"\t\t\t Register: \tOpen a Register Form for a Passport Account \t[Type: \" Register \"] \n\n");
			System.out.print(
					"\t\t\t Switch: \tSwitch to a Different Registration Form \t[Type: \" Visa \"] \n\n");
			System.out.print("\t\t\t Had Enough? \tTo end the Program \t\t\t\t[Type: \" Stop \"] \n\n");
			System.out.print("\t\t\t Go Back?    \tTo go back use     \t\t\t\t[Type: \" Back \"] \n\n");
			System.out.print(
					"---------------------------------------------------------------------------------------------------------------------------\n\n");

			System.out.print("\t\t\t\t\t\t Enter Action Here: ");
			String inpt = Scan.nextLine();

			System.out.print("\n");
			if (inpt.equalsIgnoreCase("Register")) {

				/* Passport Registration Form */

				System.out.print(
						"---------------------------------------------------------------------------------------------------------------------------\n\n");

				System.out.print("\t\t\t\t\t\tProceeding to Registration");
				PassportForm ppF = new PassportForm();
				ppF.first();

			} else if (inpt.equalsIgnoreCase("Visa")) {

				/* Switch to Visa Form */

				System.out.print(
						"---------------------------------------------------------------------------------------------------------------------------\n\n");

				System.out.print("\t\t\t\t\t\tSwitching to Visa Form");
				Form_Visa();

			} else if (inpt.equalsIgnoreCase("Stop")) {

				/* Stop the Program */

				System.out.print(
						"---------------------------------------------------------------------------------------------------------------------------\n\n");
				System.out.print("\t\t\t\t\t    Thank You for using our program!\n\n");
				System.out.print(
						"---------------------------------------------------------------------------------------------------------------------------\n\n");

			} else if (inpt.equalsIgnoreCase("Back")) {

				/* Stop the Program */

				System.out.print(
						"---------------------------------------------------------------------------------------------------------------------------\n\n");
				System.out.print("\t\t\t\t\t\tGoing Back to previous GUI!\n\n");
				new Capstone();
			} else {
				System.out.print(
						"---------------------------------------------------------------------------------------------------------------------------\n\n");

				System.out.print("\t\t\t\tCannot Proceed to " + inpt + ", Not in the choices above.\n\n");
				System.out.print("\t\t\t\t\t\tPlease Try Again!");
				Form_Passport();
			}
		} catch (Exception exeException) {
			new exeException();
		}
	}

	/*
	 * ------------------------------- VISA FORM CHOICES
	 * -------------------------------
	 */

	void Form_Visa() {
		try {
			System.out.print(
					"\n\n---------------------------------------------------------------------------------------------------------------------------\n\n");
			System.out.print(
					"\t\t\t Register: \tOpen a Register Form for a Visa Account \t[Type: \" Register \"] \n\n");
			System.out.print(
					"\t\t\t Switch: \tSwitch to a Different Registration Form \t[Type: \" Passport \"] \n\n");
			System.out.print("\t\t\t Had Enough? \tTo end the Program \t\t\t\t[Type: \" Stop \"] \n\n");
			System.out.print("\t\t\t Go Back?    \tTo go back use     \t\t\t\t[Type: \" Back \"] \n\n");
			System.out.print(
					"---------------------------------------------------------------------------------------------------------------------------\n\n");

			System.out.print("\t\t\t\t\t\t Enter Action Here: ");
			String inpt = Scan.nextLine();

			System.out.print("\n");
			if (inpt.equalsIgnoreCase("Register")) {

				/* Visa Registration Form */

				System.out.print(
						"---------------------------------------------------------------------------------------------------------------------------\n\n");

				System.out.print("\t\t\t\t\t\t Proceeding to Registration");
				VisaForm V_Form = new VisaForm();
				V_Form.first();

			} else if (inpt.equalsIgnoreCase("Passport")) {

				/* Switch to Passport Form */

				System.out.print(
						"---------------------------------------------------------------------------------------------------------------------------\n\n");

				System.out.print("\t\t\t\t\t\tSwitching to Passport Form");
				Form_Passport();

			} else if (inpt.equalsIgnoreCase("Stop")) {

				/* Stop the Program */

				System.out.print(
						"---------------------------------------------------------------------------------------------------------------------------\n\n");
				System.out.print("\t\t\t\t\t    Thank You for using our program!\n\n");
				System.out.print(
						"---------------------------------------------------------------------------------------------------------------------------\n\n");

			} else if (inpt.equalsIgnoreCase("Back")) {

				/* Stop the Program */

				System.out.print(
						"---------------------------------------------------------------------------------------------------------------------------\n\n");
				System.out.print("\t\t\t\t\t\tGoing Back to previous GUI!\n\n");
				new Capstone();
			} else {
				System.out.print(
						"---------------------------------------------------------------------------------------------------------------------------\n\n");
				System.out.print("\t\t\t\tCannot Proceed to " + inpt + ", Not in the choices above.\n\n");
				System.out.print("\t\t\t\t\t\tPlease Try Again!");
				Form_Visa();
			}
		} catch (Exception exeException) {
			new exeException();
		}

	}
}
