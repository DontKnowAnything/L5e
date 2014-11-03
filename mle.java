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

	/**
	 * The
	 */
   public MailingLabel() {
      name = "";
      address = "";
      city = "";
      state = "";
      zip ="";
   }

	/**
	 * The overloaded constructor separates data members with commas.
	 * @param dataMembers Holds data members
	 * @throws IllegalMailingLabelException If the parameter does not have 5 fields
	 */
   public MailingLabel( String dataMembers ) throws IllegalMailingLabelException 
   {
      
      dataMembers+=name + "," + address + "," + city + "," + state + "," + zip;
      String [] dataMembersArray = dataMembers.split(",");
      if ( dataMembersArray.length>=5 )
      {
         for(int i=0; i<dataMembersArray.length; i++){
            dataMembersArray[0]=name;}
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
      String gn = name;
      return gn;
   }

	/**
	 * @param name the name to set
	 */
   public void setName( String n ) {
      String sn = n;
      name = sn;
   }

	/**
	 * @return the address
	 */
   public String getAddress() {
      String ga = address;
      return ga;
   }

	/**
	 * @param address the address to set
	 */
   public void setAddress( String setAddress ) {
      String addressCopy = setAddress;
      address = addressCopy;
   }

	/**
	 * @return the city
	 */
   public String getCity() {
      String gc = city;
      return gc;
   }

	/**
	 * @param sc the city to set
	 */
   public void setCity(String sc) {
      String scm = sc;
      city = scm;
   }

	/**
	 * @return the state
	 */
   public String getState() {
      String gs = state;
      return gs;
   }

	/**
	 * @param state the state to set
	 */
   public void setState(String ss) {
      String sm = ss;
      state = sm;
   }

	/**
	 * @return the zip
	 */
   public String getZip() 
   {
      String gz = zip;
      return gz;
   }

	/**
	 * The zip code
	 * @param zip the persons zip
	 */
   public void setZip( String zipCopy ) {
      String sz = zipCopy;
      zip = sz;
   }
   @Override
   public String toString() {
      //setName(getName());
      String ts = name + address
         	+ city + " ," + state + "," + zip;
      return ts;
   }

}
