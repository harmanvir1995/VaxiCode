package Address;

/**
 * The class WebPageAddressAddress is the base class to the Address super class which contains
 * all the methods to provide and change the URL for a Web page of the clinic.
 */
public class WebPageAddress extends Address {
	//All 2 attributes that define a WebPageAddressAddress Object
	private String domainName;
	private String resourseName;
	
	/**
	 * Default constructor that initializes all the attributes to NO_DOMAINNAME_PROVIDED.
	 */
	
	public WebPageAddress() {
		this.domainName = "NO_DOMAINNAME_PROVIDED";
		this.resourseName = "NO_RESOURSENAME_PROVIDED";
	}
	
	/**
	 * Parametrized Constructor that initializes the domainName if no ResourseName is provided
	 * @param domainName	domain name of the URL
	 */
	
	public WebPageAddress(String domainName) {
		this.domainName = domainName;
	}
	
	/**
	 * Parametrized Constructor that creates a new object with the given parameters.
	 * @param domainName		domain Name of the URL	
	 * @param resourseName		Resource Name of the URL
	 */

	public WebPageAddress(String domainName, String resourseName) {
		this.domainName = domainName;
		this.resourseName = resourseName;
	}
	
	/**
	 * Copy constructor that creates a copy of WebPageAddressAddress Object
	 * @param webPageAddress WebPageAddress of the clinic
	 */
	
	public WebPageAddress(WebPageAddress webPageAddress) {
		this.domainName = webPageAddress.getDomainName();
		this.resourseName = webPageAddress.getResourseName();
	}
	
	/**
	 * Provides the domain Name for the Webpage URL of the clinic
	 * @return	the domain Name for the Webpage URL of the clinic
	 */

	public String getDomainName() {
		return domainName;
	}
	
	/**
	 * Changes the domain Name for the Webpage URL of the clinic
	 * @param domainName	the domain Name for the Webpage URL of the clinic
	 */

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	
	/**
	 * Provides the Resource Name for the Webpage URL of the clinic
	 * @return	the Resource Name for the Webpage URL of the clinic
	 */

	public String getResourseName() {
		return resourseName;
	}
	
	/**
	 * Changes the Resource Name for the Webpage URL of the clinic
	 * @param resourseName	the Resource Name for the Webpage URL of the clinic
	 */

	public void setResourseName(String resourseName) {
		this.resourseName = resourseName;
	}

	/**
	 * Overidden method provides the values of the attributes in the String format
	 * @return	the values of the attributes in the String format
	 */
	@Override
	public String toString() {
		if(resourseName!= null) {
			return "www." + domainName + "/" + resourseName;
		}
		else {
			return "www." + domainName;
		}
		
	}
	
	/**
	 * It compares two WebPageAddress objects for similarity. It returns true when two 
	 * WebPageAddress objects are similar. If they are null, or different class or if domainName or
	 * ResourceName are different, returns false. 
	 * @param obj	Compares with the Object of the object class
	 * @return		Either true or False
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
		WebPageAddress other = (WebPageAddress) obj;
		if (domainName == null) {
			if (other.domainName != null)
				return false;
		} else if (!domainName.equalsIgnoreCase(other.domainName))
			return false;
		if (resourseName == null) {
			if (other.resourseName != null) {
				return false;
			}	
		} else if (!resourseName.equalsIgnoreCase(other.resourseName)) {
			return false;	
		}
		return true;
	}
	
}
