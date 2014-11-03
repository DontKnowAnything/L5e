import java.io.Serializable;

/**
 * This class represents a mailing label. It implements the serializable
 * interface. Its data members (name, address, city, state, and zip code) are
 * stored as Strings. The constructor accepts a single String parameter, which
 * contains each field separated by comma. It uses split method of the String
 * class to parse the parameter into data members. Each field has accessor and
 * mutator methods. The toString method displays the 5 data members concatenated
 * in mailing label format. If the parameter String does not contain exactly 5
 * fields, then the constructor would throw an IllegalMailingLabelException.
 * 
 * @author Patrick Mc Knew
 *
 */
public class MailingLabel implements Serializable 
{
	/**
	 * 
	 */
	private String name;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String nacsz;

	/**
	 * 
	 */
	public MailingLabel() {
		name="";
		address="";
		city="";
		state="";
		zip="";
	}

	/**
	 * The overloaded constructor separates data members with commas.
	 * @param dataMembers Holds data members
	 * @throws IllegalMailingLabelException If the parameter does not have 5 fields
	 */
	public MailingLabel( String dataMembers ) throws IllegalMailingLabelException 
	{
		if ( dataMembers.length()!=5 )
		{
			dataMembers+=name+","+address+","+city+","+state+","+zip;
			//dataMembers.split(",");
		}
		else
		{
			throw new IllegalMailingLabelException( "this" ) ;
		}
	}

	/**
	 * @return name of the person
	 */
	public String getName()
	{
		String gn=name;
		if(gn==null)
		{
			gn+=" this is the getName() method and name is empty ";
		}
		else if(gn.isEmpty())
		{
			gn+="this is the getName () method and name is null. ";
		}
		else
		{
			gn+=" this is the getName() method and name is not empty or null";
		}
		return gn;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String n) {
		String sn=n;
		if(sn.isEmpty()){
			sn+="name is empty";
		}
		else{
			sn+=" This is the setName method and name is not empty.\n";
		}
		name = sn;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		String ga=address;
		if(ga.isEmpty()){
			ga+="name is empty";
		}
		else{
			ga+="name is not empty.";
		}
		return ga;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String setAddress) {
		String addressCopy = setAddress;
		if(addressCopy.isEmpty()){
			addressCopy+="name is empty";
		}
		else{
			addressCopy+="name is not empty.";
		}
		address=addressCopy;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		String gc=city;
		return gc;
	}

	/**
	 * @param sc the city to set
	 */
	public void setCity(String sc) {
		String scm=sc;
		city=scm;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		String gs=state;
		return gs;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String ss) {
		String sm = ss;
		state=sm;
	}

	/**
	 * @return the zip
	 */
	public String getZip() 
	{

		return zip;
	}

	/**
	 * The zip code
	 * @param zip the persons zip
	 */
	public void setZip( String zip ) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		//setName(getName());
		//return getName() + name+", address=" + address
		//		+ ", city=" + city + ", state=" + state + ", zip=" + zip;
		return name+address;
	}

}
