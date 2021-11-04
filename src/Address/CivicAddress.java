package Address;

/**
 * 
 * The class CivicAddress is the child class to the Address super class which contains
 * all the methods to provide and change the information of the Clinic physical Address.
 *
 */

public class CivicAddress extends Address{
	// All 4 attributes that define a CivicAddress Object.
	private String clinicName;
	private String clinicAddress;
	private String province;
	private String postalCode;
	/* Below is the default constructor for CivicAddress class which initializes all the
	parameters as null.*/
	public CivicAddress() {
		this.clinicName = null;
		this.clinicAddress = null;
		this.province = null;
		this.postalCode = null;
	}
	
	/**
	 * Provides the clinic name of the Clinic, CivicAddress object.
	 * 
	 * @return	the clinic name of the Clinic, CivicAddress object.
	 */
	public String getClinicName() {
		return clinicName;
	}
	
	/**
	 * Changes the clinic name of the Clinic, CivicAddress object.
	 * 
	 * @param clinicName	the clinic name of the Clinic, CivicAddress object.
	 */

	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
	}
	
	/**
	 * Provides the clinic address of the Clinic, CivicAddress object.
	 * 
	 * @return	the clinic address of the Clinic, CivicAddress object.
	 */

	public String getClinicAddress() {
		return clinicAddress;
	}
	
	/**
	 * Changes the Clinic Address of the Clinic.
	 * 
	 * @param clinicAddress	the clinic address of the clinic, CiviAddress object
	 */

	public void setClinicAddress(String clinicAddress) {
		this.clinicAddress = clinicAddress;
	}
	
	/**
	 * Provides the Province of the clinic
	 * @return	the province of the clinic
	 */


	public String getProvince() {
		return province;
	}
	
	/**
	 * This method checks if the entered province matches any of the provinces present in the
	 * allProvinces String array ignoring the case and if matches, then setting the
	 *	entered province string values.
	 * 
	 * @param province	the Province of the clinic
	 */

	public void setProvince(String province) {
		boolean flag = false;
		String[] allProvinces = {"AB", "BC", "MB", "NB", "NL", "NT", "NS", "NU", "ON", "PE", "QC", "SK", "YT"};
		for(String pc : allProvinces) {
			if(pc.equalsIgnoreCase(province)) {
				this.province = province;
				flag = true;
				break;
			}
		}
		if(flag == false) {
			System.out.println("Miss match, Province Not Found...!! " + province);
			System.exit(0);
		}
	}
	
	/**
	 * 
	 * Provides the postal code of the clinic
	 * @return  the postal code of the clinic
	 */

	public String getPostalCode() {
		return postalCode;
	}
	
	/**This method checks the format validity of the Postal code of the Clinic which contains 3 letters
	 * and 3 numbers.
	 * @param postalCode  The postal code that we provide for the Clinic Address
	 */

	public void setPostalCode(String postalCode) {
		String copypostalCode = postalCode.trim();
		if(postalCode.length() == 7) {
			String[] postalArray = copypostalCode.split(" ");
			copypostalCode = postalArray[0] + postalArray[1];
		}
		for(int i = 0; i < copypostalCode.length(); i++) {
			if(i%2 == 0) {
				if(!checkAlphabet(copypostalCode.charAt(i))) {
					System.out.println("Not correct format for Alphabet in Postal Code...!! " + postalCode);
					System.exit(0);
				}
			}
			else {
				if(!checkDigit(copypostalCode.charAt(i))) {
					System.out.println("Not correct format for digits in PostalCode...!! " + postalCode);
					System.exit(0);
				}
			}
		}
		this.postalCode = postalCode;
	}
	
	/**
	 * This method checks the digits eligible to be entered in the Postal Code Value which contains
	 * 3 digits.
	 * 
	 * @param charToCheck
	 * @return
	 */
	private boolean checkDigit(char charToCheck) {
		char[] digit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		for(char c : digit) {
			if(c == charToCheck) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * This method checks if the entered alphabet for Postal code is valid ignoring the case.
	 * 		
	 * @param charToCheck	The input Albhabet for the Province of the clinic			
	 * @return				True if it matches the Albhabet character array, false otherwise.
	 */

	public boolean checkAlphabet(char charToCheck) {
		char[] alphabet = {'A','B','C','D','E','F','G','H','I','J',
				'K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		for(char c : alphabet) {
			if(c == charToCheck) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Parametrized Constructor that creates a new object with the given parameters.
	 * 
	 * @param clinicName		The Name of the clinic
	 * @param clinicAddress		The Physical Address of the clinic
	 * @param province			Province of the clinic	
	 * @param postalCode		Postal Code of the clinic
	 */

	public CivicAddress(String clinicName, String clinicAddress, String province, String postalCode) {
		this.clinicName = clinicName;
		this.clinicAddress = clinicAddress;
		setProvince(province);
		//setPostalCode(postalCode);
		this.postalCode = postalCode;
	}
	
	/**
	 * Copy Constructor that creates a copy of the CivicAddress Object
	 * 
	 * @param civicAddress  creates a copy of the civic address object.
	 */
	
	public CivicAddress(CivicAddress civicAddress) {
		this.clinicName = civicAddress.getClinicName();
		this.clinicAddress = civicAddress.getClinicAddress();
		this.province = civicAddress.getProvince();
		this.postalCode = civicAddress.getPostalCode();
	}
	
	/**
	 * 
	 * @return  This method return the information from the parameters taken above in a String (Readable) format.
	 */

	@Override
	public String toString() {
		 
		return  getClinicAddress().toUpperCase() 
				+ ",\n"+ getProvince().toUpperCase() + ", " + getPostalCode().toUpperCase();
	}
	
	/**
	 * It compares two CivicAddress objects for similarity. It returns true when two
	// CivicAddress objects are similar. If they are null, or different class or if clinic address, clinic name, 
	 * postal code, province are different, return false
	 * 
	 * @param obj	Compares with the Object of Object class		
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
		CivicAddress other = (CivicAddress) obj;
		if (clinicAddress == null) {
			if (other.clinicAddress != null)
				return false;
		} else if (!clinicAddress.equalsIgnoreCase(other.clinicAddress))
			return false;
		if (clinicName == null) {
			if (other.clinicName != null)
				return false;
		} else if (!clinicName.equalsIgnoreCase(other.clinicName))
			return false;
		if (postalCode == null) {
			if (other.postalCode != null)
				return false;
		} else if (!postalCode.equalsIgnoreCase(other.postalCode))
			return false;
		if (province == null) {
			if (other.province != null)
				return false;
		} else if (!province.equalsIgnoreCase(other.province))
			return false;
		return true;
	}

	
}
