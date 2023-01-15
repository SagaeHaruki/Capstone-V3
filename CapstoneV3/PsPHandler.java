public class PsPHandler {
   /* This Class is used for Handling the Setters and Getters */

   /* String for Setters and Getters */
   private String ppLastName; // Last Name
   private String ppFirstName; // First Name
   private String ppMidName; // Middle Name
   private String ppPLofBirth; // Place of Birth
   private String ppDateofBirth; // Date of Birth
   private String ppGender; // Gender
   private String ppCivilStatus; // Civil Status
   private String ppAddress; // Address
   private String ppEmail; // Email
   private String ppMonbileNO; // Mobile Number
   private String ppAlcode; // Allias Code

   /* Setters and Getters */
   /* Last Name */
   public String getLastName() {
      return ppLastName;
   }

   public void setLastname(String LName) {
      this.ppLastName = LName;
   }

   /* First Name */
   public String getFirstname() {
      return ppFirstName;
   }

   public void setFirstname(String FName) {
      this.ppFirstName = FName;
   }

   /* Middle name */
   public String getMidName() {
      return ppMidName;
   }

   public void setMidName(String MName) {
      this.ppMidName = MName;
   }

   /* Place of birth */
   public String getPoB() {
      return ppPLofBirth;
   }

   public void setPoB(String PoB) {
      this.ppPLofBirth = PoB;
   }

   /* Date of Birth */
   public String getDoB() {
      return ppDateofBirth;
   }

   public void setDoB(String DoB) {
      this.ppDateofBirth = DoB;
   }

   /* Gender */
   public String getGender() {
      return ppGender;
   }

   public void setGender(String GenDr) {
      this.ppGender = GenDr;
   }

   /* Civil Status */
   public String getCivilStat() {
      return ppCivilStatus;
   }

   public void setCivilStat(String CVStat) {
      this.ppCivilStatus = CVStat;
   }

   /* Address */
   public String getAddress() {
      return ppAddress;
   }

   public void setAddress(String Addr) {
      this.ppAddress = Addr;
   }

   /* Email */
   public String getEmail() {
      return ppEmail;
   }

   public void setEmail(String EmailAD) {
      this.ppEmail = EmailAD;
   }

   /* Mobile Number */
   public String getContN() {
      return ppMonbileNO;
   }

   public void setContN(String ContactN) {
      this.ppMonbileNO = ContactN;
   }

   /* Allias Code */
   public String getAlcode() {
      return ppAlcode;
   }

   public void setAlcode(String Alcode) {
      this.ppAlcode = Alcode;
   }
}
