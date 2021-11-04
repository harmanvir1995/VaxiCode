package PatientVaccineInfo;

import java.util.Arrays;

import Address.*;

/**
 * The Clinic Class that provides that contains all the methods to provide and change the clinic Name 
 * and Clinic Address.
 *
 */

public class Clinic {
	// All 2 attributes that define a Clinic Object.
	private String clinicName = null;
	private Address[] clinicAddress = new Address[4];
	
	/**
	 * Default constructor that initializes the variables to null.
	 */
	public Clinic() {
		clinicName = null;
		clinicAddress = null;
	}

	/**
	 * Parametrized Constructor that creates a new object with the given parameters.
	 * @param clinicName		Name of the Clinic	
	 * @param clinicAddress		Physical Address of the Clinic
	 */
	public Clinic(String clinicName, Address[] clinicAddress) {
		this.clinicName = clinicName;
		this.clinicAddress = clinicAddress;
	}
	
	/**
	 * Copy constructor that creates a copy of Clinic Object.
	 * @param clinic	Clinic Object of the Clinic Class.
	 */
	public Clinic(Clinic clinic) {
		this.clinicName = clinic.clinicName;
		this.clinicAddress = clinic.clinicAddress;
	}
	/**
	 * Provides the Name of the Clinic
	 * @return	the Name of the Clinic
	 */

	public String getClinicName() {
		return clinicName;
	}
	
	/**
	 * Changes the Name of the Clinic
	 * @param clinicName	the Name of the Clinic
	 */

	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
	}
	
	/**
	 * Provides the Address of the clinic
	 * @return	the Address of the clinic
	 */

	public Address[] getClinicAddress() {
		return clinicAddress;
	}

	/**
	 * Changes the Address of the Clinic
	 * @param clinicAddress	The Address of the Clinic
	 */

	public void setClinicAddress(Address[] clinicAddress) {
		this.clinicAddress = clinicAddress;
	}

	/**
	 * Overidden method that returns the values of the Attributes/Parameters in String Format
	 * @return	the values of the Attributes in String Format
	 */
	@Override
	public String toString() {
		return  ""+ clinicAddress[0].toString() ;
	}
	
	/**
	 * It compares two Clinic objects for similarity. It returns true when two 
	 * Clinic objects are similar. 
	 * @param obj	Compares with the Object of the object class
	 * @return		Returns either true or false
	 */
	@Override
	public boolean equals(Object obj) {
		
	}
	
	
	
	
	
}
