class Existing {

}

class ExistingEm extends Existing {
   public void Send() {
      System.out.print(
            "\n\n---------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n\n\t\t\t\t\t    This Email seems to be Registered Already");
      System.out.print("\n\n\t\t\t\t\t      Please try using another email!");
      System.out.print(
            "\n\n---------------------------------------------------------------------------------------------------------------------------\n\n");
   }
}

class ExistingCont extends Existing {
   public void Send() {
      System.out.print(
            "\n\n---------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n\n\t\t\t\t\t    This Contact seems to be Registered Already");
      System.out.print("\n\n\t\t\t\t\t      Please try using another email!");
      System.out.print(
            "\n\n---------------------------------------------------------------------------------------------------------------------------\n\n");
   }
}

class Existingboth extends Existing {
   public void Send() {
      System.out.print(
            "\n\n---------------------------------------------------------------------------------------------------------------------------");
      System.out.print("\n\n\t\t\t\t  Both Email and Contact Number seems to be Registered Already");
      System.out.print("\n\n\t\t\t\t\t      Please try using another email!");
      System.out.print(
            "\n\n---------------------------------------------------------------------------------------------------------------------------\n\n");
   }
}