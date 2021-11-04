package PatientVaccineInfo;
import Address.*;

/**
 * The class Vaccine contains all the methods to provide and change the 
 * Vaccine type , date of the dose, Clinic of the dose, for first and second
 * vaccine doses.
 *
 */
public class Vaccine{
	//All the 7 attributes that define a Vaccine Object
	private VaccineType vaccineType_1;
	private VaccineType vaccineType_2;
	private String dateDose_1;
	private String dateDose_2;
	private Clinic clinicDose_1;
	private Clinic clinicDose_2;
	private String currentDate = "2021-10-29";
	
	/**
	 * Enum defining the type of the vaccine that a patient takes.
	 *
	 */
	public enum VaccineType{PFIZER, MODERNA, ASTRAZENECA,COVAXIN, COVISHIELD}
	
	/**
	 * Default Constructor that initializes the variables to null.
	 */
	public Vaccine() {
		this.dateDose_1 = null;
		this.dateDose_2 = null;
		this.clinicDose_2 = null;
		this.clinicDose_2 = null;
	}
	
	/**
	 * Parametrized Constructor that creates a new object with the given parameters.
	 * @param vaccineType_1		The vaccine type that a Patient takes during first dose.	
	 * @param dateDose_1		Date of the first dose of the vaccination		
	 * @param clinicDose_1		Information of the Clinic during first dose of vaccination
	 * @param vaccineType_2		The vaccine type that a Patient takes during second dose.
	 * @param dateDose_2		Date of the second dose of the vaccination
	 * @param clinicDose_2		Information of the Clinic during second dose of vaccination
	 */
	
	public Vaccine(VaccineType vaccineType_1, String dateDose_1, Clinic clinicDose_1, 
			VaccineType vaccineType_2,  String dateDose_2, Clinic clinicDose_2) {
		this.vaccineType_1 = vaccineType_1;
		setDateDose_1(dateDose_1);
		this.clinicDose_1 = clinicDose_1;
		this.vaccineType_2 = vaccineType_2;
		this.dateDose_2 = dateDose_2;
		this.clinicDose_2 = clinicDose_2;
	}
	
	/**
	 * Copy constructor that creates a copy of vaccine Object.
	 * @param vaccine	Vaccine Object of the Vaccine Class
	 */
	
	public Vaccine(Vaccine vaccine) {
		this.vaccineType_1 = vaccine.vaccineType_1;
		this.dateDose_1 = vaccine.dateDose_1;
		this.clinicDose_1 = vaccine.clinicDose_1;
		this.vaccineType_2 = vaccine.vaccineType_2;
		this.dateDose_2 = vaccine.dateDose_2;
		this.clinicDose_2 = vaccine.clinicDose_2;
	}
	
	/**
	 * Provides the Type of vaccine during the first dose
	 * @return	the Type of vaccine during the first dose
	 */
	
	public VaccineType getVaccineType_1() {
		return vaccineType_1;
	}
	
	/**
	 * Changes the Type of vaccine during the first dose
	 * @param vaccineType_1	the Type of vaccine during the first dos
	 */

	public void setVaccineType_1(VaccineType vaccineType_1) {
		this.vaccineType_1 = vaccineType_1;
	}
	
	/**
	 * Provides the Type of vaccine during the second dose
	 * @return	the Type of vaccine during the second dose
	 */

	public VaccineType getVaccineType_2() {
		return vaccineType_2;
	}
	
	/**
	 * Changes the Type of vaccine during the second dose
	 * @param vaccineType_2	the Type of vaccine during the second dose
	 */

	public void setVaccineType_2(VaccineType vaccineType_2) {
		this.vaccineType_2 = vaccineType_2;
	}
	
	/**
	 * Provides the date of vaccination for the first dose
	 * @return	the date of vaccination for the first dos
	 */

	public String getDateDose_1() {
		return dateDose_1;
	}
	
	/**
	 * Changes the date of vaccination for the first dose
	 * @param dateDose_1	date of vaccination for the first dose
	 */

	public void setDateDose_1(String dateDose_1) {
		if(dateDose_1 == null || dateDose_1.trim() == "") {
			System.out.println("Fatal error occured, date cannot be null or empty...!!");
			System.exit(0);
		}
		boolean flag = false;
		String[] currentDateArray = currentDate.split("-");
		int currentYear = Integer.parseInt(currentDateArray[0]);
		int currentMonth = Integer.parseInt(currentDateArray[1]);
		int currentDay = Integer.parseInt(currentDateArray[2]);
		String[] dateArray = dateDose_1.split("-");
		int year = Integer.parseInt(dateArray[0]);
		int month = Integer.parseInt(dateArray[1]);
		int day = Integer.parseInt(dateArray[2]);
		if(year > 0  && month > 0 && day > 0 ) {
			this.dateDose_1 = dateDose_1;
		}
		else {
			System.out.println("Cannot assign date for Dose 1...!!");
		}
		
	}
	
	/**
	 * Provides the date of vaccination for the second dose
	 * @return	the date of vaccination for the second dose
	 */

	public String getDateDose_2() {
		return dateDose_2;
	}
	
	/**
	 * Changes the date of vaccination for the second dose
	 * @param dateDose_2	the date of vaccination for the second dose
	 */

	public void setDateDose_2(String dateDose_2) {
		boolean flag = false;
		String[] currentDateArray = currentDate.split("-");
		int currentYear = Integer.parseInt(currentDateArray[0]);
		int currentMonth = Integer.parseInt(currentDateArray[1]);
		int currentDay = Integer.parseInt(currentDateArray[2]);
		String[] dateArray = dateDose_2.split("-");
		int year = Integer.parseInt(dateArray[0]);
		int month = Integer.parseInt(dateArray[1]);
		int day = Integer.parseInt(dateArray[2]);
		if(year > 0 && year >= currentYear && month > 0 && month >= currentMonth 
				&& day > 0 && day >= currentDay) {
			flag = true;
		}
		if(flag) {
			if(checkConditionFor52Weeks(dateDose_1,  dateDose_2) && checkFourWeeksCondition(dateDose_1,  dateDose_2)) {
				this.dateDose_2 = dateDose_2;
			}
		}
		else {
			System.out.println("Date not assigned...!!");
		}
	}

	/**
	 * Provides the Infomration of the Clinic for the first dose 
	 * @return	the Infomration of the Clinic for the first dose
	 */
	public Clinic getClinicDose_1() {
		return clinicDose_1;
	}

	/**
	 * Changes the Infomration of the Clinic for the first dose
	 * @param clinicDose_1	Infomration of the Clinic for the first dose
	 */
	public void setClinicDose_1(Clinic clinicDose_1) {
		this.clinicDose_1 = clinicDose_1;
	}
	/**
	 * Provides the Infomration of the Clinic for the second dose 
	 * @return	the Infomration of the Clinic for the second dose
	 */

	public Clinic getClinicDose_2() {
		return clinicDose_2;
	}
	/**
	 * Changes the Infomration of the Clinic for the second dose
	 * @param clinicDose_2	Infomration of the Clinic for the second dose
	 */

	public void setClinicDose_2(Clinic clinicDose_2) {
		this.clinicDose_2 = clinicDose_2;
	}
	
	/**
	 * Checks the condition where the patient must take the seocnd dose within 52 weeks
	 * of taking the first dose, otherwise patient muse repeat the first dose.
	 * @param date_1	the date of vaccination for the first dose
	 * @param date_2	the date of vaccination for the second dose
	 * @return			True or False
	 */

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
	
	/**
	 * Method that checks the condition where the second dose must be taken at least 4 weeks
	 * after the first dose.
	 * @param date_1	the date of vaccination for the first dose
	 * @param date_2	the date of vaccination for the second dose
	 * @return			true or false
	 */
	
	
	
	public static boolean checkFourWeeksCondition(String date_1, String date_2) {
		String[] date_1Array = date_1.split("-");
		String[] date_2Array = date_2.split("-");
		int year_1 = Integer.parseInt(date_1Array[0]);
		int year_2 = Integer.parseInt(date_2Array[0]);
		int month_1 = Integer.parseInt(date_1Array[1]);
		int month_2 = Integer.parseInt(date_2Array[1]);
		int day_1 = Integer.parseInt(date_1Array[2]);
		int day_2 = Integer.parseInt(date_2Array[2]);
		
		if(year_2 - year_1 > 1) {
			return true;
		}
		if(year_2 - year_1 < 0) {
			return false;
		}
		if(year_2 == year_1) {
				if(month_2 - month_1 > 1) {
					return true;
				}
				if(month_2 == month_1) {
					if(day_2 - day_1 > 28) {
						return true;
					}
					else {
						return false;
					}
				}
				if(month_2 - month_1 == 1) {
					if(day_1 - day_2 < 3) {
						return true;
					}
					else {
						return false;
					}
				}
		}
		if(year_2 - year_1 == 1) {
			if(month_1 != 12) {
				return true;
			}
			else {
				if(month_2 != 1) {
					return true;
				}
				else {
					if(day_1 - day_2 <= 2) {
						return true;
					}
					else {
						return false;
					}
				}
			}
		}
		return false;
	}

	/**
	 * Returns the values of the attributes/Parameters in String Format.
	 */
	@Override
	public String toString() {
		
		if(vaccineType_2 == null || dateDose_2 == null || clinicDose_2 == null) {
			return "Dose 1: " + vaccineType_1.toString() + ", " + dateDose_1 +"\n"
					+ "Clinic: " + clinicDose_1.getClinicName() + "\n"
					+ clinicDose_1.toString() + "\n\n" ;
		}
		else {
			return "Dose 1: " + vaccineType_1.toString() + ", " + dateDose_1 +"\n"
					+ "Clinic: " + clinicDose_1.getClinicName() + "\n"
					+ clinicDose_1.toString() + "\n\n" 
				    + "Dose 2: " + vaccineType_2.toString() + ", " + dateDose_2 +"\n"
					+ "Clinic: " + clinicDose_2.getClinicName() + "\n"
					+ clinicDose_2.toString() + "\n" ;
		}
		
	}

	/**
	 * It compares two Vaccine objects for similarity. It returns true when two 
	 * vaccine objects are similar. If they are null, or different class or if clinicDose_1, clinicDose_2,
	 * currentDate, dateDose_1, dateDose_2, vaccineType_1 or vaccineType_2 are differentm, returns false. 
	 * @param obj	Compares with the Object of the object class
	 * @return		Returns either true or false
	 */
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vaccine other = (Vaccine) obj;
		if (clinicDose_1 == null) {
			if (other.clinicDose_1 != null)
				return false;
		} else if (!clinicDose_1.equals(other.clinicDose_1))
			return false;
		if (clinicDose_2 == null) {
			if (other.clinicDose_2 != null)
				return false;
		} else if (!clinicDose_2.equals(other.clinicDose_2))
			return false;
		if (currentDate == null) {
			if (other.currentDate != null)
				return false;
		} else if (!currentDate.equals(other.currentDate))
			return false;
		if (dateDose_1 == null) {
			if (other.dateDose_1 != null)
				return false;
		} else if (!dateDose_1.equals(other.dateDose_1))
			return false;
		if (dateDose_2 == null) {
			if (other.dateDose_2 != null)
				return false;
		} else if (!dateDose_2.equals(other.dateDose_2))
			return false;
		if (vaccineType_1 != other.vaccineType_1)
			return false;
		if (vaccineType_2 != other.vaccineType_2)
			return false;
		return true;
	}


}
