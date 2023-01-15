import java.io.*;
import java.util.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;

class VisaForm extends VsAHandler {
   Scanner Scanner1 = new Scanner(System.in);
   String PassPortData = "dataVisa.txt";

   void first() throws IOException, exeException {
      try {
         PassportSample SF = new PassportSample();
         SF.PP_SP();
         System.out.print("\n\t\t\t\t\t\t Please Fill up the Form");
         System.out.print(
               "\n\n---------------------------------------------------------------------------------------------------------------------------\n\n");
         vsInpts();
      } catch (Exception exeException) {
         throw new exeException();
      }
   }

   void vsInpts() throws IOException, exeException {
      try {
         String _vsReader = null;
         String _vsEmailCopy;
         String _vsContCopy;

         Path ppPath2 = Paths.get(PassPortData.toString());
         InputStream ppInput = Files.newInputStream(ppPath2);
         BufferedReader _pp2Reader = new BufferedReader(new InputStreamReader(ppInput));

         System.out.print("\t\t\t\t>> Enter Your Last Name: \n\t\t\t\t>> ");
         String LNameInpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter Your First Name: \n\t\t\t\t>> ");
         String FNameInpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter Your Middle Name: \n\t\t\t\t>> ");
         String MNameInpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter Your Citizenship: \n\t\t\t\t>> ");
         String CSinpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter Your Civil Status: (Single / Married / Separated)\n\t\t\t\t>> ");
         String CVinpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter Your Gender: \n\t\t\t\t>> ");
         String Geninpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter Your Occupation: \n\t\t\t\t>> ");
         String Occinpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter Your Place of Birth: \n\t\t\t\t>> ");
         String PoBinpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter Your Date of Birth: Sample (MM-DD-YYYY)\n\t\t\t\t>> ");
         String DoBinpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter Your Current City: Sample (Navotas)\n\t\t\t\t>> ");
         String Cityinpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter Your Employer: \n\t\t\t\t>> ");
         String Empinpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter Your Employer Address: \n\t\t\t\t>> ");
         String EmAdinpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter Your Email: \n\t\t\t\t>> ");
         String Emailinpt = Scanner1.nextLine();
         System.out.print("\t\t\t\t>> Enter Your ContactNum: \n\t\t\t\t>> ");
         String ContInpt = Scanner1.nextLine();

         boolean emailCopy = false;
         boolean contCopy = false;

         while ((_vsReader = _pp2Reader.readLine()) != null) {
            String account3[] = _vsReader.split(",");
            String account2[] = _vsReader.split(",");
            _vsEmailCopy = account2[10];
            _vsContCopy = account3[11];

            if (_vsContCopy.equals(ContInpt)) {
               contCopy = true;
            }

            if (_vsEmailCopy.equals(Emailinpt)) {
               emailCopy = true;
            }
         }

         switch (emailCopy + " - " + contCopy) {
            /* First Case if Email is already Existing */
            case "true - false":
               ExistingEm ex = new ExistingEm();
               ex.Send();
               vsInpts();
               break;
            /* Second Case if Contact Number is already Existing */
            case "false - true":
               ExistingCont exx = new ExistingCont();
               exx.Send();
               vsInpts();
               break;
            /* Third Case if both already existing */
            case "true - true":
               Existingboth exxx = new Existingboth();
               exxx.Send();
               vsInpts();
               break;
            default:
         }
         /* This section checks if neither of the 3 Choices above is used */

         if (emailCopy != true && contCopy != true) {
            /*
             * Using Encapsulation all user input is being held by the setters and getters
             * in order to be used by different void methods
             */
            setVsLastName(LNameInpt);
            setVsFirstName(FNameInpt);
            setVsMiddleName(MNameInpt);
            setVsCitizenShip(CSinpt);
            setVsCivilStatus(CVinpt);
            setVsGender(Geninpt);
            setVsOccupation(Occinpt);
            setVsPlaceOfBirth(PoBinpt);
            setVsDateOfBirth(DoBinpt);
            setVsCity(Cityinpt);
            setVsEmployer(Empinpt);
            setVsEmployerAddress(EmAdinpt);
            setVsEmail(Emailinpt);
            setVsContactN(ContInpt);
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
               .print("\t\tLast Name: " + getVsLastName() + "\t\tFirst Name: " + getVsFirstName()
                     + "\t\tMiddle Initial: "
                     + getVsMiddleName() + "\n\n");
         System.out.print("\t\tPlace of Birth: " + getVsPlaceOfBirth() + "\t\tDate of Birth: " + getVsDateOfBirth()
               + "\t\tGender: "
               + getVsGender() + "Current City Living: " + getVsCity() + "\n\n");
         System.out.print("\t\tCivil Status: " + getVsCivilStatus() + "\t\tEmail Address: " + getVsEmail()
               + "\t\tContact Number: " + getVsContactN() + "\n\n");
         System.out.print("\t\tCitizenship: " + getVsCitizenShip() + "\t\tOccupation: " + getVsOccupation()
               + "\t\tEmployer: " + getVsEmployer() + "\n\n");
         System.out.print("\t\tEmployer Address: " + getVsEmployerAddress() + "\n\n");

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
            vsInpts();
         } else {

         }
      } catch (Exception exeException) {
         throw new exeException();
      }
   }

   /* This Void method is used to creave verification */

   void Verify() throws exeException, IOException {
      try {
         Random RNG = new Random();
         int min = 1000;
         int max = 9999;
         int ver = RNG.nextInt(max - min) + min;

         System.out.print("\t\t\t\t\t\tVerification Code: " + ver + "\n\t\t\t\t\t\t>> ");
         int inptVer = Scanner1.nextInt();

         /* If Verification is Confirmed */
         if (inptVer == ver) {
            Path Patt = Paths.get(PassPortData.toString());
            OutputStream Outt = new BufferedOutputStream(Files.newOutputStream(Patt, APPEND));
            BufferedWriter Writt = new BufferedWriter(new OutputStreamWriter(Outt));

            String LastN = getVsLastName();
            String FirstN = getVsFirstName();
            String MidN = getVsMiddleName();
            String Citz = getVsCitizenShip();
            String Cvil = getVsCivilStatus();
            String Gend = getVsGender();
            String Occu = getVsOccupation();
            String PoB_ = getVsPlaceOfBirth();
            String DoB_ = getVsDateOfBirth();
            String CtY = getVsCity();
            String Empl = getVsEmployer();
            String EmpAd = getVsEmployerAddress();
            String Eml = getVsEmail();
            String ContN = getVsContactN();

            System.out.print(
                  "\n\n---------------------------------------------------------------------------------------------------------------------------\n\n");
            System.out
                  .print("\t\tLast Name: " + getVsLastName() + "\t\tFirst Name: " + getVsFirstName()
                        + "\t\tMiddle Initial: "
                        + getVsMiddleName() + "\n\n");
            System.out.print("\t\tPlace of Birth: " + getVsPlaceOfBirth() + "\t\tDate of Birth: " + getVsDateOfBirth()
                  + "\t\tGender: "
                  + getVsGender() + "\n\t\tCurrent City Living: " + getVsCity());
            System.out.print("\t\tCivil Status: " + getVsCivilStatus() + "\t\tEmail Address: " + getVsEmail()
                  + "\t\tContact Number: " + getVsContactN() + "\n\n");
            System.out.print("\t\tCitizenship: " + getVsCitizenShip() + "\t\tOccupation: " + getVsOccupation()
                  + "\t\tEmployer: " + getVsEmployer() + "\n\n");
            System.out.print("\t\tEmployer Address: " + getVsEmployerAddress() + "\n\n");

            System.out.print(
                  "\n\n---------------------------------------------------------------------------------------------------------------------------\n\n");
            System.out.print(
                  "\t\t     Thank You for Registering! Please proceed to the main offices to confirm the validation Date");
            Writt.write(LastN + "," + FirstN + "," + MidN + "," + Citz + "," + Cvil + "," + Gend + "," + Occu + ","
                  + PoB_ + "," + DoB_ + "," + CtY + "," + Empl + "," + EmpAd + "," + Eml + "," + ContN);
            Writt.newLine();
            Writt.close();
            Outt.close();
            FormList_Ext fmL = new FormList_Ext();
            fmL.Form_Passport();
         }

         if (inptVer != ver) {
            System.out.print("\t\t\t\t\tInvalid Verification Code!\n");
            Verify();
         }

      } catch (Exception exeException) {
         throw new exeException();
      }
   }
}