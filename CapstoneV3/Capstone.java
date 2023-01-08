import java.io.*;
import java.util.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;

class exeException extends Exception {
   public exeException() {
      super("Error");
   }
}

public class Capstone {
   public Capstone() throws exeException, IOException {
      try {

         Scanner Scan = new Scanner(System.in);

         System.out.print(
               "---------------------------------------------------------------------------------------------------------------------------\n\n");
         System.out.print("\t\t\t Forms: \tLogin or Register an Accont \t[Type: \" Forms \"] \n\n");
         System.out.print("\t\t\t Search: \tLook for an Existing Account \t[Type: \" Search \"] \n\n");
         System.out.print("\t\t\t Had Enough? \tTo end the Program \t\t[Type: \" Stop \"] \n\n");
         System.out.print(
               "---------------------------------------------------------------------------------------------------------------------------\n\n");
         System.out.print("\t\t\t\t\t\tEnter Action Here: ");

         String S_Inpt = Scan.nextLine();

         System.out.print("\n");

         if (S_Inpt.equalsIgnoreCase("Forms")) {

            /* Forms Choices between Visa and Passport */

            System.out.print(
                  "---------------------------------------------------------------------------------------------------------------------------\n\n");
            FormList_Ext FL_Ext = new FormList_Ext();
            FL_Ext.Run_Choices();

         } else if (S_Inpt.equalsIgnoreCase("Search")) {

            /* Selection for Search Proceed to File */

            System.out.print(
                  "---------------------------------------------------------------------------------------------------------------------------\n\n");

         } else if (S_Inpt.equalsIgnoreCase("Stop")) {

            /* Stop the Program */

            System.out.print(
                  "---------------------------------------------------------------------------------------------------------------------------\n\n");
            System.out.print("\t\t\t\t\t    Thank You for using our program!\n\n");
            System.out.print(
                  "---------------------------------------------------------------------------------------------------------------------------\n\n");

         } else {

            /* If The Input is not in the Choices */

            System.out.print(
                  "---------------------------------------------------------------------------------------------------------------------------\n\n");
            System.out.print("\t\t\t\tCannot Proceed to " + S_Inpt + ", Not in the choices above.\n\n");
            System.out.print("\t\t\t\t\t\tPlease Try Again!\n\n");
            new Capstone();

         }
      } catch (Exception exeException) {
         throw new exeException();
      }
   }

   public static void main(String[] args) throws IOException, exeException {
      new Capstone();
   }
}