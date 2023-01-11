import java.io.*;
import java.util.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;

public class SearchList_Ext extends Search_List {
   Scanner Scan = new Scanner(System.in);

   /*
    * ------------------------------- FORM CHOICES -------------------------------
    */
   void Run_Choices() {
      try {
         System.out.print("\t\t\t\t\tChoose Between Visa or Passport: ");
         String c_Input = Scan.nextLine();
         if (c_Input.equalsIgnoreCase("Visa")) {
            System.out.print(
                  "\n---------------------------------------------------------------------------------------------------------------------------\n\n");

            System.out.print("\t\t\t\t\t     You are now Seaching in Visa Forms");
            Search_Visa();
         } else if (c_Input.equalsIgnoreCase("Passport")) {
            System.out.print(
                  "\n---------------------------------------------------------------------------------------------------------------------------\n\n");

            System.out.print("\t\t\t\t\t     You are now Seaching in Passport Forms");
            Search_Passport();
         } else if (c_Input.equalsIgnoreCase("Back")) {
            System.out.print(
                  "\n---------------------------------------------------------------------------------------------------------------------------\n\n");

            System.out.print("\t\t\t\t\t     Going Back to previous GUI");
            new Capstone();
         } else {
            System.out.print(
                  "\n---------------------------------------------------------------------------------------------------------------------------\n\n");
            System.out.print("\t\t\t\t\t\tPlease Try Again!\n\n");
            Run_Choices();
         }
      } catch (Exception exeException) {
         new exeException();
      }
   }

   /*
    * ------------------------------- PASSPORT FORM CHOICES
    * -------------------------------
    */
   void Search_Passport() {

      ArrayList<String> list = new ArrayList<String>();
      try {
         String LastN, FrstN, MidlN, EmailAdd;

         Scanner Sc = new Scanner(new File("dataPassport.txt"));
         Sc.useDelimiter("\r?\n");

         System.out.print("\nSearch for: ");
         String inpt3 = Scan.nextLine();

         while (Sc.hasNext()) {
            list.add(Sc.next());
         }

         boolean found = false;

         for (String element : list) {
            if (element.contains(inpt3)) {
               System.out.print("\n-------------------------------\n");
               System.out.print("List of items that contains \"" + inpt3 + "\"\n");
               found = true;
               String[] list3 = element.split(",");
               LastN = list3[0];
               FrstN = list3[1];
               MidlN = list3[2];
               EmailAdd = list3[8];

               System.out.print("-------------------------------\n");
               System.out.print("Showing only the public details\n");
               System.out.print("Last Name:      " + LastN + "\n");
               System.out.print("First Name:     " + FrstN + "\n");
               System.out.print("Middle Name:    " + MidlN + "\n");
               System.out.print("Email Address:  " + EmailAdd + "\n");
               System.out.print("-------------------------------\n");

            } else {
               found = false;
            }
         }
         if (found == true) {
            Run_Choices();
         }
         if (found == false) {
            System.out.print("Cannot find " + inpt3);
            System.out.print("\nPlease try again!\n");
            Search_Passport();
         }
      } catch (Exception exeException) {
         new exeException();
      }
   }

   /*
    * ------------------------------- VISA FORM CHOICES
    * -------------------------------
    */

   void Search_Visa() {
      ArrayList<String> list = new ArrayList<String>();
      try {
         String LastN, FrstN, MidlN, EmailAdd;

         Scanner Sc = new Scanner(new File("dataVisa.txt"));
         Sc.useDelimiter("\r?\n");

         System.out.print("\nSearch for: ");
         String inpt3 = Scan.nextLine();

         while (Sc.hasNext()) {
            list.add(Sc.next());
         }

         boolean found = false;

         for (String element : list) {
            if (element.contains(inpt3)) {
               System.out.print("\n-------------------------------\n");
               System.out.print("List of items that contains \"" + inpt3 + "\"\n");
               found = true;
               String[] list3 = element.split(",");
               LastN = list3[0];
               FrstN = list3[1];
               MidlN = list3[2];
               EmailAdd = list3[8];

               System.out.print("-------------------------------\n");
               System.out.print("Showing only the public details\n");
               System.out.print("Last Name:      " + LastN + "\n");
               System.out.print("First Name:     " + FrstN + "\n");
               System.out.print("Middle Name:    " + MidlN + "\n");
               System.out.print("Email Address:  " + EmailAdd + "\n");
               System.out.print("-------------------------------\n");

            } else {
               found = false;
            }
         }
         if (found == true) {
            Run_Choices();
         }
         if (found == false) {
            System.out.print("Cannot find " + inpt3);
            System.out.print("\nPlease try again!\n");
            Search_Visa();
         }
      } catch (Exception exeException) {
         new exeException();
      }

   }
}
