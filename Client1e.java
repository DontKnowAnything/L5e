import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This client tests MailingLabel, and creates a binary file containing data.
 * @author Patrick Mc Knew
 *
 */
public class Client1 {

   public static void main(String[] args) throws IllegalMailingLabelException
   {
      FileReader readFile = null;
      BufferedReader bufferReader = null;
      ArrayList<MailingLabel>listOfLabels;
      MailingLabel mailLabel;
      MailingLabel mailLabel2;
      String nameRead = "";
      String addressRead = "";
      String cityRead = "";
      String stateRead = "";
      String zipRead = "";
      String all = "";
      System.out.println("Program Starting");
      
      try 
      {
         readFile = new FileReader("H:\\Lab5j\\src\\textForMailingLabel.txt");
         bufferReader = new BufferedReader(readFile);
         listOfLabels = new ArrayList<MailingLabel>();
         mailLabel = new MailingLabel();
      
         nameRead = bufferReader.readLine();
         mailLabel.setName( nameRead );
         String getNameRead = mailLabel.getName();
         
         addressRead = bufferReader.readLine();
         mailLabel.setAddress( addressRead );
         String getAddressRead = mailLabel.getAddress();
         
         cityRead = bufferReader.readLine();
         mailLabel.setCity( cityRead );
         String getCityRead = mailLabel.getCity();
         
         stateRead = bufferReader.readLine();
         mailLabel.setState( stateRead );
         String getStateRead = mailLabel.getState();
         
         zipRead = bufferReader.readLine();
         mailLabel.setState( zipRead );
         String getZipRead = mailLabel.getZip();
         
         all += getNameRead + getAddressRead + getCityRead + stateRead + zipRead;
      	/*if(!all.isEmpty())
      	{*/
         mailLabel2 = new MailingLabel( all );
      		
         listOfLabels.add( mailLabel2 );
         if(listOfLabels.isEmpty())
         {
            System.out.println( "list is empty" );
         }
         else
         {
            for (MailingLabel mailingLabelObj:listOfLabels )
               System.out.println( mailLabel );
         }
      		
      		
      	/*}
      	else
      	{
      		System.out.println("File is empty");
      	}*/
      } 
      catch ( IOException io )
      {
         io.printStackTrace();
      }
      finally
      {
         System.out.println( "Program Ending" );
      }
   }
}
