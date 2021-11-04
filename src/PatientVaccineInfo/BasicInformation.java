package PatientVaccineInfo;
import Address.*;

/**
 * The Super class BasicInfomration that contains all the methods to provide and change
 * the Name, email address and telecomAddress of the patient.
 *
 */

public class BasicInformation {
	// All 3 attributes that define a BasicInformation Object.
	protected String name;
	protected EmailAddress emailAddress;
	protected TelecomAddress telecomAddress;
	
	/**
	 * Default constructor that initializes all the variables to null.
	 */
	
	public BasicInformation() {
		this.name = null;
		this.emailAddress = null;
		this.telecomAddress = null;
	}
	
	/**
	 * Parametrized Constructor that creates a new object with the given parameters.
	 * @param name
	 * @param emailAddress
	 * @param telecomAddress
	 */
	public BasicInformation(String name, EmailAddress emailAddress, TelecomAddress telecomAddress) {
		setName(name);
		setEmailAddress(emailAddress);
		setTelecomAddress(telecomAddress);
	}
	
	/**
	 * Copy constructor that creates a copy of BasicInformation Object.
	 * @param basicInformation	basicInformation object of the BasicInformation class
	 */
	public BasicInformation(BasicInformation basicInformation) {
		if(basicInformation == null) {
			System.out.println("Fatal error occured....!!\nPatcine object is null....!!");
			System.exit(0);
		}
		else {
			this.name = basicInformation.name;
		    this.emailAddress = basicInformation.emailAddress;
		    this.telecomAddress = basicInformation.telecomAddress;
		}
	}

	/**
	 * Provides the name of the patient
	 * @return	the name of the patient
	 */
	public String getName() {
		return name;
	}

	/**
	 * Changes the name of the patient
	 * @param name	the name of the patient
	 */
	public void setName(String name) {
		if(name == null || name.trim() == "") {
			System.out.println("Fatal Error occured, name is empty or null...!!");
			System.exit(0);
		}
		else {
			this.name = name;
		}
	}

	/**
	 * Provides the email address of the patient
	 * @return	the email address of the patient
	 */
	public EmailAddress getEmailAddress() {
		return emailAddress;
	}
	/**
	 * Changes the email address of the patient
	 * @param emailAddress	the email address of the patient
	 */

	public void setEmailAddress(EmailAddress emailAddress) {
		if(emailAddress == null) {
			System.out.println("Cannot assign null value to an emailAddress...!!");
			System.exit(0);
		}
		else {
			this.emailAddress = emailAddress;		
		}
	}

	/**
	 * Provides the Telecom Address (Phone Number) of the patient
	 * @return	the Telecom Address (Phone Number) of the patient
	 */
	public TelecomAddress getTelecomAddress() {
		return telecomAddress;
	}
	/**
	 * Changes the Telecom Address (Phone Number) of the patient
	 * @param telecomAddress	the Telecom Address (Phone Number) of the patient
	 */

	public void setTelecomAddress(TelecomAddress telecomAddress) {
		if(telecomAddress == null) {
			System.out.println("Cannot assign null value to a telecomAddress...!!");
			System.exit(0);
		}
		else {
			this.telecomAddress = telecomAddress;		
		}
	}
	
	
}
