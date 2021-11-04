package Address;

/**
 * 
 * The class EmailAddress is the child class to the Address super class which contains
 * all the methods to provide and change the information of the email address of the clinic.
 *
 */

public class EmailAddress extends Address {
	// All 3 attributes that define an EmailAddress Object.
	private String userName;
	private String domainName;
	private String tld;
	
	// Default Constructor that initializes all the attributes to NO_VALUE_PROVIDED.	
	public EmailAddress() {
		this.userName = "NO_VALUE_PROVIDED";
		this.domainName = "NO_VALUE_PROVIDED";
		this.tld = "NO_VALUE_PROVIDED";
	}
	
	/**
	 * Parametrized Constructor that creates a new object with the given parameters.
	 * 
	 * @param userName		username of the Clinic	
	 * @param domainName	domainName of the Clinic			
	 * @param tld			Top Level Domain of the Clinic like com, org, gov, etc.
	 */
	public EmailAddress(String userName, String domainName, String tld) {
		this.userName = userName;
		this.domainName = domainName;
		this.tld = tld;
	}
	
	/**
	 * Copy Constructor that creates a copy of EmailAddress Object
	 * 
	 * @param emailAddress 	email address of the clinic.
	 */
	
	public EmailAddress(EmailAddress emailAddress) {
		this.userName = emailAddress.getUserName();
		this.domainName = emailAddress.getDomainName();
		this.tld = emailAddress.getTld();
	}
	
	/**
	 * Provides the username part of the email address of the clinic
	 * 
	 * @return	the username part of email address of the clinic
	 */

	public String getUserName() {
		return userName;
	}
	
	/**
	 * Changes the username part of the email address of the clinic 
	 * @param userName	username part of the email address of the clinic
	 */

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * Provides the domain name part of the email address of the clinic 
	 * 
	 * @return	the domain name part of the email address of the clinic 
	 */

	public String getDomainName() {
		return domainName;
	}
	
	/**
	 * Changes the domain name part of the email address of the clinic
	 * 
	 * @param domainName	the domain name part of the email address of the clinic
	 */

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	
	/**
	 * Provides the top level domain part of the email address of the clinic
	 * 
	 * @return	the top level domain part of the email address of the clinic
	 */

	public String getTld() {
		return tld;
	}
	
	/**
	 * Changes the top level domain part of the email address of the clinic
	 * @param tld	the top level domain part of the email address of the clinic
	 */

	public void setTld(String tld) {
		this.tld = tld;
	}
	
	/**
	 * Overidden method provides the values of the attributes in the String format
	 * 
	 * @return	the values of the attributes in the String format
	 */
	@Override
	public String toString() {
		return userName + "@" + domainName + "." + tld;
	}
	
	/**
	 * It compares two EmailAddress objects for similarity. It returns true when two 
	 * EmailAddress objects are similar. If they are null, or different class or if domainName, tld, userName
	 * are different, returns false. 
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
		
		EmailAddress other = (EmailAddress) obj;
		if (domainName == null) {
			if (other.domainName != null)
				return false;
		} else if (!domainName.equalsIgnoreCase(other.domainName))
			return false;
		if (tld == null) {
			if (other.tld != null)
				return false;
		} else if (!tld.equalsIgnoreCase(other.tld))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equalsIgnoreCase(other.userName))
			return false;
		return true;
	}
}
