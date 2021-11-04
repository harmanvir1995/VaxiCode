package PatientVaccineInfo;

import Address.*;
/**
 * The class Patient is the child class to the BasicInformation Superclass which contains all the
 * methods to provide and change the Health card number and vaccine type of the Patient.
 *
 */
public class Patient extends BasicInformation {

	
	private long healthCardNumber;
	private Vaccine vaccine; 
	
	/**
	 * Default constructor that initializes the variables.
	 */
	public Patient(){
		super();
		this.healthCardNumber = 0;
		this.vaccine = null;
	}
	/**
	 * Parametrized Constructor that creates a new object with the given parameters.
	 * @param name				Name of the Patient
	 * @param healthCardNumber	Health Card Number of the Patient
	 * @param emailAddress		Email Address of the Patient	
	 * @param telecomAddress	Telecom Address of the Patient	
	 * @param vaccine			Type of vaccine 	
	 */
	//Make sure to check for null in case of name before assigning to super constructor.
	public Patient(String name, long healthCardNumber, EmailAddress emailAddress, 
			TelecomAddress telecomAddress, Vaccine vaccine) {
		super(name, emailAddress, telecomAddress);
		setHealthCardNumber(healthCardNumber);
		setVaccine(vaccine);
	}
	/**
	 * Copy constructor that creates a copy of Patient Object.
	 * @param patient	Patient Object of the Patient class
	 */
	
	//Make sure to check for null in case of name before assigning to super constructor.
	public Patient(Patient patient) {
		super(patient.getName(), patient.getEmailAddress(), patient.getTelecomAddress());
		setHealthCardNumber(patient.healthCardNumber);
		setVaccine(patient.vaccine);
	}
	
	/**
	 * Provides the Health card Number of the patient
	 * @return	the Health card Number of the patient
	 */
	public long getHealthCardNumber() {
		return healthCardNumber;
	}
	
	/**
	 * Changes the Health Card Number of the patient
	 * @param healthCardNumber	the Health card Number of the patient
	 */

	public void setHealthCardNumber(long healthCardNumber) {
		if(healthCardNumber <= 0 ) {
			System.out.println("Fatal Error Occurred, Health Card Number cannot be zero or negative...!!");
			System.exit(0);
		}
		else {
			this.healthCardNumber = healthCardNumber;
		}
	}

	/**
	 * Provides the type of Vaccine for the patient
	 * @return	the type of Vaccine for the patient
	 */
	public Vaccine getVaccine() {
		return vaccine;
	}
	
	/**
	 * Changes the type of vaccine for the Patient
	 * @param vaccine	the type of vaccine for the Patient
	 */

	public void setVaccine(Vaccine vaccine) {
		if(vaccine == null) {
			System.out.println("Fatal error occured, Vaccine cannot be null...!!");
		}
		this.vaccine = vaccine;
	}
	
	/**
	 * Overidden method that returns the values of the Attributes/Parameters in String Format
	 * @return	the values of the Attributes in String Format
	 */
	
	@Override
	public String toString() {
		return "Patient" + " Name = "+ name+  ", HealthCardNumber = " + healthCardNumber + ",\nVaccine: \n" + vaccine 
				+ "EmailAddress = " + emailAddress + "\nTelecomAddress = " + telecomAddress ;
	}
	
	/**
	 * It compares two Patient objects for similarity. It returns true when two 
	 * Patients objects are similar. If they are null, or different class or if Health card number,
	 * vaccine is different, returns false 
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
		Patient other = (Patient) obj;
		if (healthCardNumber != other.healthCardNumber)
			return false;
		if (vaccine == null) {
			if (other.vaccine != null)
				return false;
		} else if (!vaccine.equals(other.vaccine))
			return false;
		return true;
	}
	
	/**
	 * This method remind the patients about the vaccination through text (SMS) messages and through email.
	 */
	
	public void sendMessageAndEmail() {
		System.out.println("Message sent at " + this.telecomAddress + " Email sent at " + this.emailAddress);
	}
	
	
	
	
	
	
}
