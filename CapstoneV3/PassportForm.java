import java.io.*;
import java.util.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;

class PassportForm extends PsPHandler {

   Scanner Scanner1 = new Scanner(System.in);
   String PassPortData = "dataPassport.txt";

   /* This is The First Action */

   void first() throws IOException, exeException {
      try {
         PassportSample SF = new PassportSample();
         SF.PP_SP();
         System.out.print("\n\t\t\t\t\t\t Please Fill up the Form");
         System.out.print(
               "\n\n---------------------------------------------------------------------------------------------------------------------------\n\n");
         ppInput();
      } catch (Exception exeException) {
         throw new exeException();
      }
   }

   /*
    * This Void Method is used to get all the Information Being entered by the User
    */

   void ppInput() throws IOException, exeException {
      try {

         /* Start of Try Catch */

         /* This Section Creates a copy of the inputs */
         String _ppReader = null;
         String _ppEmailCopy;
         String _ppContCopy;
         /*
          * This setction contains the location of the .txt files and the Readers and
          * Writers
          */

         Path ppPath2 = Paths.get(PassPortData.toString());
         InputStream ppInput = Files.newInputStream(ppPath2);
         BufferedReader _pp2Reader = new BufferedReader(new InputStreamReader(ppInput));

         /*
          * This Section is used to gather Inputs that'l later be
          * copied by the Sections above the Readers and Writers
          */

         System.out.print("\t\t\t\t>> Enter your Last Name: \n\t\t\t\t>> ");
         String LNameInpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter your First Name: \n\t\t\t\t>> ");
         String FNameInpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter your Middle Initial: \n\t\t\t\t>> ");
         String MNameInpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter your Place of Birth: Sample (Navotas)\n\t\t\t\t>> ");
         String PoBInpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter your Date of Birth: Sample (MM-DD-YYYY)\n\t\t\t\t>> ");
         String DoBInpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter your Gender: (Male / Female / Others)\n\t\t\t\t>> ");
         String GendInpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter your Civil Status: (Single / Married / Separated)\n\t\t\t\t>> ");
         String CivilInpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter the City you are Living: Sample (Navotas City)\n\t\t\t\t>> ");
         String AddInpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter your Current Email Address: \n\t\t\t\t>> ");
         String EmailInpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter your Current Contact Number: Sample (0912345678912)\n\t\t\t\t>> ");
         String ContNInpt = Scanner1.nextLine();

         boolean emailCopy = false;
         boolean contCopy = false;

         /* Checks for the last 2 Input Which is the Email and Contact Number */

         while ((_ppReader = _pp2Reader.readLine()) != null) {
            String account3[] = _ppReader.split(",");
            String account2[] = _ppReader.split(",");
            _ppEmailCopy = account2[8];
            _ppContCopy = account3[9];

            if (_ppContCopy.equals(ContNInpt)) {
               contCopy = true;
            }

            if (_ppEmailCopy.equals(EmailInpt)) {
               emailCopy = true;
            }
         }

         switch (emailCopy + " - " + contCopy) {
            /* First Case if Email is already Existing */
            case "true - false":
               ExistingEm ex = new ExistingEm();
               ex.Send();
               ppInput();
               break;
            /* Second Case if Contact Number is already Existing */
            case "false - true":
               ExistingCont exx = new ExistingCont();
               exx.Send();
               ppInput();
               break;
            /* Third Case if both already existing */
            case "true - true":
               Existingboth exxx = new Existingboth();
               exxx.Send();
               ppInput();
               break;
            default:
         }
         /* This section checks if neither of the 3 Choices above is used */

         if (emailCopy != true && contCopy != true) {
            /*
             * Using Encapsulation all user input is being held by the setters and getters
             * in order to be used by different void methods
             */
            setLastname(LNameInpt);
            setFirstname(FNameInpt);
            setMidName(MNameInpt);
            setPoB(PoBInpt);
            setDoB(DoBInpt);
            setGender(GendInpt);
            setCivilStat(CivilInpt);
            setAddress(AddInpt);
            setEmail(EmailInpt);
            setContN(ContNInpt);
            Confirmation();
         }

      } catch (Exception exeException) {
         throw new exeException();
      }
   }

   void Confirmation() throws exeException, IOException {
      try {
         System.out.print(
               "\n\n---------------------------------------------------------------------------------------------------------------------------\n\n");
         System.out.print("\t\t\t\t\t\tAccout Information");
         System.out.print(
               "\n\n---------------------------------------------------------------------------------------------------------------------------\n\n");
         System.out
               .print("\t\tLast Name: " + getLastName() + "\t\tFirst Name: " + getFirstname() + "\t\tMiddle Initial: "
                     + getMidName() + "\n\n");
         System.out.print("\t\tPlace of Birth: " + getPoB() + "\t\tDate of Birth: " + getDoB() + "\t\tGender: "
               + getGender() + "Current City Living: " + getAddress() + "\n\n");
         System.out.print("\t\tCivil Status: " + getCivilStat() + "\t\tEmail Address: " + getEmail()
               + "\t\tContact Number: " + getContN() + "\n\n");
         System.out.print(
               "\n\n---------------------------------------------------------------------------------------------------------------------------\n\n");
         System.out.print("\t\t\t\t\tPlease check the fillup form to confirm\n\n");
         System.out.print(
               "\t\t\t Confirm: \tConfirm the Form, No Errors found \t[Type: \" Confirm \"] \n\n");
         System.out.print(
               "\t\t\t Reset: \tReset the Form \t[Type: \" Reset \"] \n\n");
         System.out.print(
               "\n\n---------------------------------------------------------------------------------------------------------------------------\n\n");
         ConfirmationExt();
      } catch (Exception exeException) {
         throw new exeException();
      }
   }

   void ConfirmationExt() throws exeException, IOException {
      try {
         System.out.print("\t\t\t\t\t\tEnter Action Here: ");
         String inp2 = Scanner1.nextLine();
         if (inp2.equalsIgnoreCase("Confirm")) {
            Verify();
         } else if (inp2.equalsIgnoreCase("Reset")) {
            ppInput();
         } else {

         }
      } catch (Exception exeException) {
         throw new exeException();
      }
   }

   /* This Void method is ued */

   void Verify() throws exeException, IOException {
      try {
         Random RNG = new Random();
         int min = 1000;
         int max = 9999;
         int ver = RNG.nextInt(max - min) + min;

         System.out.print("Verification Code: " + ver);

         System.out.print("\n>> ");
         int inptVer = Scanner1.nextInt();

         /* If Verification is Confirmed */
         if (inptVer == ver) {
            Path ppPath1 = Paths.get(PassPortData.toString());
            OutputStream ppOutput = new BufferedOutputStream(Files.newOutputStream(ppPath1, APPEND));
            BufferedWriter ppWriter = new BufferedWriter(new OutputStreamWriter(ppOutput));

            String LastName_C = getLastName();
            String FirtName_C = getFirstname();
            String MiddleName_C = getMidName();
            String PoB_C = getPoB();
            String DoB_C = getDoB();
            String Gend_C = getGender();
            String Civil_C = getCivilStat();
            String Address_C = getAddress();
            String Email_C = getEmail();
            String Mobile_C = getContN();

            System.out.print(
                  "\n\n---------------------------------------------------------------------------------------------------------------------------\n\n");
            System.out.print("\t\t\t\t\t\tAccount Registered");
            System.out.print(
                  "\n\n---------------------------------------------------------------------------------------------------------------------------\n\n");
            System.out
                  .print(
                        "\t\tLast Name: " + getLastName() + "\t\tFirst Name: " + getFirstname() + "\t\tMiddle Initial: "
                              + getMidName() + "\n\n");
            System.out.print("\t\tPlace of Birth: " + getPoB() + "\t\tDate of Birth: " + getDoB() + "\t\tGender: "
                  + getGender() + "Current City Living: " + getAddress() + "\n\n");
            System.out.print("\t\tCivil Status: " + getCivilStat() + "\t\tEmail Address: " + getEmail()
                  + "\t\tContact Number: " + getContN() + "\n\n");
            System.out.print(
                  "\n\n---------------------------------------------------------------------------------------------------------------------------\n\n");
            System.out.print(
                  "\t\t     Thank You for Registering! Please proceed to the main offices to confirm the validation Date");
            ppWriter.write(LastName_C + "," + FirtName_C + "," + MiddleName_C + "," + PoB_C + "," + DoB_C + "," + Gend_C
                  + "," + Civil_C + "," + Address_C + "," + Email_C + "," + Mobile_C);
            ppWriter.newLine();
            ppWriter.close();
            ppOutput.close();

            FormList_Ext fmL = new FormList_Ext();
            fmL.Form_Passport();
         }

         if (inptVer != ver) {
            Verify();
         }

      } catch (Exception exeException) {
         throw new exeException();
      }
   }
}