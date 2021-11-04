package Address;

/**
 * The class TelecomAddress is the child class to the Address super class which contains
 * all the methods to provide and change the number for a telephone, mobile phone, fax,
 * pager or other such device at the clinic.
 *
 */

public class TelecomAddress extends Address{
	// All 2 attributes that define a TelecomAddress Object
	private int npa;
	private long number;
	
	/**
	 * Default constructor that initializes all the attributes to zero 
	 */
	public TelecomAddress() {
		npa = 0;
		number = 0;
	}
	
	/**
	 * Parametrized Constructor that creates a new object with the given parameters.
	 * @param npa		Represents the area code 
	 * @param number	7 Digit number after the Area code
	 */
	
	public TelecomAddress(int npa, long number) {
		setNpa(npa);
		setNumber(number);
	}
	
	/**
	 * Copy constructor that creates a copy of TelecomAddress Object
	 * @param telecomAddress telecom Address of the Clinic
	 */
	
	public TelecomAddress(TelecomAddress telecomAddress) {
		this.npa = telecomAddress.getNpa();
		this.number = telecomAddress.getNumber();
	}
	
	**
	 * Provides the area code of the number at the clinic
	 *  
	 * @return	the area code of the number at the clinic
	 */
	
	public int getNpa() {
		return npa;
	}
	
	/**
	 * Changes the area code of the number at the clinic
	 * @param npa	the area code of the number at the clinic
	 */

	public void setNpa(int npa) {
		this.npa = npa;
		/* if(checkDigits(3)) {
			this.npa = npa;
		}
		else {
			System.out.println("NPA length should be 3 but Your input was: " + npa);
			System.exit(0);
		}*/
	}
	
	/**
	 * This method checks the length of the number passed, for example for npa, it will be 3,
	 * and for number it will be 7
	 * @param lengthToCheck	checks the length of the number passed
	 * @return				True or false
	 */

	private boolean checkDigits(int lengthToCheck) {
		int length = 0;
		while(npa > 0) {
			npa = npa /10;
			length++;
		}
		if(lengthToCheck == length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Provides the 7 digit Number after the area code
	 * @return	the 7 digit Number after the area code
	 */

	public long getNumber() {
		return number;
	}
	
	/**
	 * Changes the 7 digit Number after the area code
	 * @param number	the 7 digit Number after the area code
	 */

	public void setNumber(long number) {
		this.number = number;
		/*if(checkDigits(7)) {
		this.number = number;
	}
		else {
			System.out.println("NUMBER length should be 3 but Your input was: " + number);
			System.exit(0);
		}*/
	}
	
	/**
	 * Overidden method provides the values of the attributes in the String format
	 * @return	the values of the attributes in the String format
	 */

	public String toString() {
		String numberString = number + "";
		return "+1(" + npa + ")" + numberString.substring(0, 3) + "-" + numberString.substring(3,7);
	}
	
	/**
	 * It compares two TelecomAddress objects for similarity. It returns true when two 
	 * TelecomAddress objects are similar. If they are null, or different class or if npa or number
	 * are different, returns false. 
	 * @param obj	Compares with the Object of the object class
	 * @return		Returns either true or false
	 */

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}			
		if (obj == null) {
			return false;
		}		
		if (getClass() != obj.getClass()) {
			return false;
		}
		TelecomAddress other = (TelecomAddress) obj;
		if (npa != other.npa) {
			return false;
		}	
		if (number != other.number) {
			return false;
		}	
		return true;
	}
}
