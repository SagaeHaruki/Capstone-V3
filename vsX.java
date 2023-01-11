public class vsX {
   public static void main(String[] args) {
      String LName, FName, MName, Pob, Dob, Gend, CivS, Add, EmAadd, Cont;
      LName = "Diego";
      FName = "Jean Kyla";
      MName = "C";
      Pob = "Navotas";
      Dob = "12-27-2002";
      Gend = "Female";
      CivS = "Single";
      Add = "Navotas City";
      EmAadd = "atrop@yahpp.com";
      Cont = "0912345678912";
      System.out.print(
            "\n\n---------------------------------------------------------------------------------------------------------------------------\n\n");
      System.out.printf("%15s%25s%25s%25s%25s\n", "Last Name", "First Name", "Middle Name", "Gender",
            "Civil Status");
      System.out
            .printf("%13s%27s%25s%25s%25s\n", LName, FName, MName, Gend, CivS);

      System.out.print(
            "      Address \t\tDate of Birth \t\tPlace of birth \t\tEmail Address \t\t   Contact Number\n");
      System.out
            .print("      " + Add + "\t" + Dob + "\t\t    " + Pob + "\t\t" + EmAadd + "\t\t   " + Cont
                  + "\n\n");

   }
}
