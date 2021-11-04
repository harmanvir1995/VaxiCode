package Address;

import PatientVaccineInfo.*;

/**
 * Helps a medical clinic to keep track of patients’ records related to vaccination history. Vaccination
 * comes into two doses that can be taken at different clinics. The second dose must be taken at least 4 weeks
 * after the first dose. However the patient must take the second dose within 52 weeks of taking the first dose,
 * otherwise the patient must repeat the first dose.
 * 
 * @author HARMANVIR SINGH (40019114)
 * @author SARABPREET SINGH REKHI (40154067)
 *
 */

public class Driver {
	private static String currentDate = "2021-10-29";
	static String dateDose_1 = "2020-01-01";
	static String date_2 = "2020-01-27";
	
	/**
	 * The method takes as input an array of the objects (the array can be of any size) and
	 * returns a copy of that array. That is to say, the method creates an array of the same length as the
	 * passed array, copies all objects from the passed array to a new array, then returns the new array. The copy
	 * of the objects will automatically depend on the copy constructors of the different listed Address classes.
	 * 
	 * @param addressArray  Array of Address Objects
	 * @return				Copy of Address Array
	 */
	public static Address[] copyAddresses(Address [] addressArray) {
		Address[] copyArray = new Address[addressArray.length];
		for(Address i : addressArray) {
			copyArray = addressArray;
		}
		return copyArray;
	}
	
	public static void main(String[] args) {
		/*---------------------------------------------------------------------------
		 * Create an array of 15 to 20 of these address objects
		 *---------------------------------------------------------------------------
		 */
		
		Address[] address = new Address[20];
		address[0] = new WebPageAddress("dwntwnclinic.ca", "login");		
		address[1] = new WebPageAddress("yoursante.ca", "patient history");		
		address[2] = new WebPageAddress("gabbyClinicVancouver.com");		
		address[3] = new EmailAddress("gabbyClinicVancouver", "outlook", "com"); 
		address[4] = new EmailAddress("santemtl", "quebec", "ca");		
		address[5] = new EmailAddress("195", "yahoo", "com");			
		address[6] = new TelecomAddress(438, 9994444);					
		address[7] = new TelecomAddress(675, 8882222);					
		address[8] = new TelecomAddress(514, 99900000);					
		address[9] = new CivicAddress("DOWNTOWN CLINIC", "500 RUE SHERBROOKE, MONTREAL", "QC", "H8Z 1D9");	
		address[10] = new CivicAddress("DR GABBY'S CLINIC", "46 RUE STUART, VANCOUVER","BC", "T9V 1U0");	
		address[11] = new CivicAddress("GOOD HEALTH CLINIC", "578 RUE BARRIE, TORONTO", "ON","B9P 9VS");	
		address[12] =new WebPageAddress("brossardclinic","appointments" );
		address[13] = new EmailAddress("bclinic", "gmail", "com");
		address[14] = new TelecomAddress(514, 7777888);
		address[15] = new CivicAddress("Brossard Clinic", "200, Rue Soucy, Brossard", "QC", "J4T 3K5" );
		address[16] = new WebPageAddress("avtaarClinic.com");				
		address[17] = new EmailAddress("avtaarClinic1998", "gmail", "com");		
		address[18] = new TelecomAddress(438, 8849838);				
		address[19] = new CivicAddress("Avtaar", "15 SAINT CATHERINE ST. MONTREAL", "QC", "H8N1C1");	
		

		
		Address[] denisClinicAddress = {address[9], address[3], address[0], address[6]};
		Address[] avtaarClinicAddress = {address[19],address[17], address[16], address[18]};
		Address[] gabbyClinicAddress = {address[10], address[3], address[2], address[7]};
		Address[] santeClinicAddress = {address[11], address[4], address[1], address[6]};
		Clinic denisClinic = new Clinic("Denis Okan Clinic", denisClinicAddress);
		Clinic avtaarClinic  = new Clinic("Avtaar Clinic", avtaarClinicAddress);
		Clinic gabbyClinic = new Clinic("Gabby Singh", gabbyClinicAddress);
		Clinic santeClinic = new Clinic("Sante Clinic Downtown", santeClinicAddress);
		Vaccine pizerAtAvtaar = new Vaccine(Vaccine.VaccineType.PFIZER, "2021-10-31", avtaarClinic, Vaccine.VaccineType.MODERNA, "2021-10-31", santeClinic);
		Vaccine modernaAtDenis = new Vaccine(Vaccine.VaccineType.MODERNA, "2021-11-20", denisClinic, Vaccine.VaccineType.MODERNA, "2022-07-03", denisClinic);
		Vaccine covishieldAtGabby = new Vaccine(Vaccine.VaccineType.COVISHIELD, "2021-11-15", gabbyClinic, Vaccine.VaccineType.COVISHIELD, "2022-04-25", gabbyClinic);
		Vaccine covaxinAtsante = new Vaccine(Vaccine.VaccineType.COVAXIN, "2021-11-09", santeClinic, Vaccine.VaccineType.COVAXIN, "2022-01-15", santeClinic);
		Vaccine[] oneDoseArray = new Vaccine[6];
		oneDoseArray[0] =  new Vaccine(Vaccine.VaccineType.COVAXIN, "2021-07-21", santeClinic, null, null, null);
		oneDoseArray[1] =  new Vaccine(Vaccine.VaccineType.ASTRAZENECA, "2021-09-10", avtaarClinic, null, null, null);
		oneDoseArray[2] =  new Vaccine(Vaccine.VaccineType.PFIZER, "2021-08-07", gabbyClinic, null, null, null);
		oneDoseArray[3] =  new Vaccine(Vaccine.VaccineType.MODERNA, "2021-09-22", santeClinic, null, null, null);
		oneDoseArray[4] =  new Vaccine(Vaccine.VaccineType.ASTRAZENECA, "2021-07-21", denisClinic, null, null, null);
		oneDoseArray[5] =  new Vaccine(Vaccine.VaccineType.PFIZER, "2021-10-17", denisClinic, null, null, null);
		
		
		
		
		/*------------------------------------------------------------------------
		   1) Create various objects from the all the classes, and display all their
		 * information
		 * -----------------------------------------------------------------------
		 */
		
		System.out.println("\n***************************************************************************************\n"
				+ "Creating various objects from the all the classes, and display all their information\n"
				+ "***************************************************************************************");
		Vaccine avtaarPizer = new Vaccine(Vaccine.VaccineType.PFIZER, "2021-10-31", avtaarClinic, Vaccine.VaccineType.MODERNA, "2021-10-31", santeClinic);
		Patient harmanPatient = new Patient("HARMANVIR SINGH", 902364558, new EmailAddress("harman4_u", "yahoo", "com"), new TelecomAddress(438, 9994444), avtaarPizer);
		WebPageAddress web = new WebPageAddress("brossardclinic","appointments" );
		EmailAddress email = new EmailAddress("bclinic", "gmail", "com");
		TelecomAddress tel = new TelecomAddress(514, 7777888);
		CivicAddress civic = new CivicAddress("Brossard Clinic", "200, Rue Soucy, Brossard", "QC", "J4T 3K5" );
		System.out.println("\n------------------------------------------------------------------------\n"
				+ "\t\t Vaccine Information is as followed\n"
				+ "------------------------------------------------------------------------");
		System.out.println(avtaarPizer);
		System.out.println("\n------------------------------------------------------------------------\n"
				+ "\t\t Patient Information is as followed\n"
				+ "------------------------------------------------------------------------");
		System.out.println(harmanPatient);
		System.out.println("\n------------------------------------------------------------------------\n"
				+ "\t\t WebPage Address Information is as followed\n"
				+ "------------------------------------------------------------------------");
		System.out.println(web);
		System.out.println("\n------------------------------------------------------------------------\n"
				+ "\t\t Email Address Information is as followed\n"
				+ "------------------------------------------------------------------------");
		System.out.println(email);
		System.out.println("\n------------------------------------------------------------------------\n"
				+ "\t\t Telecom Address Information is as followed\n"
				+ "------------------------------------------------------------------------");
		System.out.println(tel);
		System.out.println("\n------------------------------------------------------------------------\n"
				+ "\t\t Civic Address Information is as followed\n"
				+ "------------------------------------------------------------------------");
		System.out.println(civic);
		
		/*---------------------------------------------------------------------------
		 *2) Test the equality of some of the objects.
		 *---------------------------------------------------------------------------
		 */
		
		System.out.println("\n***************************************************************************************\n"
				+ "\t\t Testing the equality of some of the objects.\n"
				+ "***************************************************************************************");
		EmailAddress email1 = new EmailAddress("bclinic", "gmail", "com");
		EmailAddress email1Duplicate = new EmailAddress("bclinic", "gmail", "com");
		CivicAddress civicDuplicate = new CivicAddress("Brossard Clinic", "200, Rue Soucy, Brossard", "QC", "J4T 3K5" );
		CivicAddress differentCivicAddress = new CivicAddress("GOOD HEALTH CLINIC", "578 RUE BARRIE, TORONTO", "ON","B9P 9VS");
		System.out.println("Checking for objects email1 and email1Duplicate....");
		checkEqualities(email1, email1Duplicate);
		System.out.println("\n------------------------------------------------------------------------\n");
		System.out.println("Checking for objects civicDuplicate and civic....");
		checkEqualities(civicDuplicate, civic);
		System.out.println("\n------------------------------------------------------------------------\n");
		System.out.println("Checking for objects civicDuplicate and differentCivicAddress....");
		checkEqualities(civicDuplicate, differentCivicAddress);
		System.out.println("\n------------------------------------------------------------------------\n");
		System.out.println("Checking for objects avtaarPizer and harmanPatient....");
		checkEqualities(avtaarPizer, harmanPatient);
		System.out.println();
		
		/*---------------------------------------------------------------------------
		 *3) Create an array of 15 to 20 of patient class and printing partially vaccinated.
		 *---------------------------------------------------------------------------
		 */
		System.out.println("\n***************************************************************************************\n"
				+ "\t Printing partially vaccinated objects or the ones with expetied date\n"
				+ "***************************************************************************************");
		Patient[] arrayPatient = new Patient[15];
		arrayPatient[0] = new Patient("HARMANVIR SINGH", 902364558, new EmailAddress("harman4_u", "yahoo", "com"), new TelecomAddress(438, 9994444), avtaarPizer);
		arrayPatient[1] = new Patient("SARABHPREET SINGH", 895632147, new EmailAddress("sarabh998", "yahoo", "com"), new TelecomAddress(438, 2368596), modernaAtDenis);
		arrayPatient[2] = new Patient("Jad", 325698741, new EmailAddress("jad1990", "gmail", "com"), new TelecomAddress(514, 4068586), oneDoseArray[1]);
		arrayPatient[3] = new Patient("David", 902364412, new EmailAddress("david4258", "outlook", "com"), new TelecomAddress(856, 1234567), avtaarPizer); //
		arrayPatient[4] = new Patient("Daniel", 326587416, new EmailAddress("daniel_458", "yahoo", "com"), new TelecomAddress(438, 9856321), oneDoseArray[0]);
		arrayPatient[5] = new Patient("Harsh", 325698741, new EmailAddress("harshSingh856", "gmail", "com"), new TelecomAddress(236, 4068586), covaxinAtsante);
		arrayPatient[6] = new Patient("Ravinder", 902364558, new EmailAddress("ravinder", "yahoo", "com"), new TelecomAddress(986, 9994224), avtaarPizer);
		arrayPatient[7] = new Patient("Gabriel", 22361153, new EmailAddress("gabriellevis", "yahoo", "com"), new TelecomAddress(255, 2368596), modernaAtDenis);
		arrayPatient[8] = new Patient("Louis", 565446223, new EmailAddress("louis566", "gmail", "com"), new TelecomAddress(514, 5236985), oneDoseArray[4]);
		arrayPatient[9] = new Patient("Maxwel", 32651225, new EmailAddress("maxwel", "outlook", "com"), new TelecomAddress(438, 8536249), avtaarPizer);
		arrayPatient[10] = new Patient("Boult", 856412, new EmailAddress("boult754656", "yahoo", "com"), new TelecomAddress(438, 4963261), modernaAtDenis);
		arrayPatient[11] = new Patient("ABDeveliers", 45369852, new EmailAddress("abdeveliers4u", "gmail", "com"), new TelecomAddress(514, 4068586), oneDoseArray[2]);
		arrayPatient[12] = new Patient("Smith", 96326541, new EmailAddress("smithforaustralia", "outlook", "com"), new TelecomAddress(438, 5236236), avtaarPizer);
		arrayPatient[13] = new Patient("Root", 2366541, new EmailAddress("root", "yahoo", "com"), new TelecomAddress(438, 4236215), modernaAtDenis);
		arrayPatient[14] = new Patient("Williamson", 5236426, new EmailAddress("williamson", "gmail", "com"), new TelecomAddress(514, 8523258), oneDoseArray[3]);
		tracePatients(arrayPatient);
		
		
		/*---------------------------------------------------------------------------
		 *									Part 2
		 *Copying an array to another array using copyAddress method.
		 *---------------------------------------------------------------------------
		 */
		
		//Copying an array will work as we have created an array of Parent class and saved the objects of Child class.
		//Which is legal in Java.
		Address[] newCopiedArray = copyAddresses(address);
		System.out.println("\n***************************************************************************************\n"
				+ "\t\t Printing objects present in the original Array...\n"
				+ "***************************************************************************************");
		for(int i =0; i<address.length; i++) {
			System.out.println(i + ").  " + address[i] + "\n");
		}
		
		System.out.println("\n***************************************************************************************\n"
				+ "\t\t Printing objects present in the Copied Array...\n"
				+ "***************************************************************************************");
		for(int i =0; i<newCopiedArray.length; i++) {
			System.out.println(i + ").  " + newCopiedArray[i] + "\n");
		}
	}
	
	/**
	 * Method checks if object1 and Object 2 of Object class are equal.
	 * @param obj1		Object of Object class
	 * @param obj2		Object of Object class	
	 * @return			True or False
	 */
	
	public static boolean checkEqualities(Object obj1, Object obj2) {
		if(obj1.equals(obj2)) {
			System.out.println("Yes, given objects of " + obj1.getClass() + " are equal...!!");
			return true;
		}
		else {
			System.out.println("No, given objects are not equal...!!");
			return false;
		}
	}
	
	/**
	 * The method trace and display 
	 * partially vaccinated patients and patients with expired dose 1 (i.e. patient who did not take dose 2
	 * within 52 weeks after taking dose 1).
	 * 
	 * @param arrayPatient	array of Patient class who are partially vaccinated
	 */
	
	
	public static void tracePatients(Patient[] arrayPatient) {
		for(int i=0; i<arrayPatient.length; i++) {
			if(arrayPatient[i].getVaccine().getDateDose_2() == null) {
				System.out.println("Partially Vaccinated.....");
				System.out.println(arrayPatient[i]);
				System.out.println("\n");
			}
		}
	}
	
	
	
	public static boolean checkConditionFor52Weeks(String date_1, String date_2) {
		String[] date_1Array = date_1.split("-");
		String[] date_2Array = date_2.split("-");
		int year_1 = Integer.parseInt(date_1Array[0]);
		int year_2 = Integer.parseInt(date_2Array[0]);
		int month_1 = Integer.parseInt(date_1Array[1]);
		int month_2 = Integer.parseInt(date_2Array[1]);
		int day_1 = Integer.parseInt(date_1Array[2]);
		int day_2 = Integer.parseInt(date_2Array[2]);
		
		if(year_2 - year_1 > 1) { //When difference of years is not zero.
				return false;
		}
		if(year_2 - year_1 < 0){
			return false;
		}
		if(  (year_2 - year_1 == 0) && (month_2 >= month_1) ) {
			if(!(month_1 == 1 && month_2 ==12)) {
				return true;
			}
			else if(month_1 == 1 && month_2 ==12){
					if(day_1 == 1 && day_2 == 31) {
						return false;
					}
					else {
						return true;
					}
			}
		}
		else {
			return false;
		}
		if(year_2 - year_1 == 1) {
			if(month_1 >= month_2) {
				if((day_1 > day_2) && day_1 - day_2 >= 2) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	
	
	
}
