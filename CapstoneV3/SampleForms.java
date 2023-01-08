class SampleForms {
	/* This class is a Poly Morphism Class */
}

class PassportSample extends SampleForms {
	public void PP_SP() {
		String LName, FName, MName, Pob, Dob, Gend, CivS, Add, EmAadd, Cont;
		LName = "De Mesa";
		FName = "Jan Andrei";
		MName = "M";
		Pob = "Navotas";
		Dob = "12-27-2002";
		Gend = "Male";
		CivS = "Single";
		Add = "Navotas City";
		EmAadd = "atrop@yahoo.com";
		Cont = "0912345678912";

		System.out.print(
				"\n\n---------------------------------------------------------------------------------------------------------------------------\n\n");
		System.out.print("\t\t\t\t\t\t        Sample Form");
		System.out.print(
				"\n\n---------------------------------------------------------------------------------------------------------------------------\n\n");
		System.out.print(
				"      Last Name \tFirst Name \t\tMiddle Initial \t\tGender \t\t\t   Civil Status\n");
		System.out
				.print("      " + LName + "\t\t" + FName + "\t\t      " + MName + "\t\t\t" + Gend
						+ "\t\t\t      " + CivS
						+ "\n\n");

		System.out.print(
				"      Address \t\tDate of Birth \t\tPlace of birth \t\tEmail Address \t\t   Contact Number\n");
		System.out
				.print("      " + Add + "\t" + Dob + "\t\t    " + Pob + "\t\t" + EmAadd + "\t\t   " + Cont
						+ "");
		System.out.print(
				"\n\n---------------------------------------------------------------------------------------------------------------------------\n\n");
		System.out.print("\t\t\t\t\t      Refer to the Sample Form Above");

	}
}
