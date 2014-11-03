/**
 * Constructs message when exception is thrown
 * @author Patrick Mc Knew
 *
 */
public class IllegalMailingLabelException extends NoSuchFieldException
{
	String returnNumFields;

	/**
	 * More detailed error
	 * @param wrongNumFields Message
	 */
	public IllegalMailingLabelException( String wrongNumFields) {
		super( "Wrong number of fields "+ wrongNumFields );
		if((wrongNumFields.length())>5){
			System.exit(0);
		}
		else
		{
			wrongNumFields+="the";
			
		}
	}
	

}
