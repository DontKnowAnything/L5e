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

		FileReader readFile=null;
		BufferedReader bufferReader=null;
		ArrayList<MailingLabel>listOfLabels;
		MailingLabel mailLabel;
		String nameRead="";
		String addressRead="";
		String cityRead="";
		String lineRead="";
		String all="";
		System.out.println("Program Starting");
		try 
		{
			readFile=new FileReader("C:\\Stuff\\L5e\\Lab5e\\src\\textForMailingLabel.txt");
			bufferReader=new BufferedReader(readFile);
			listOfLabels=new ArrayList<MailingLabel>();

			nameRead=bufferReader.readLine();
			addressRead=bufferReader.readLine();
			cityRead=bufferReader.readLine();
			lineRead=bufferReader.readLine();
			lineRead=bufferReader.readLine();
			all=nameRead+addressRead+cityRead;
			/*if(!all.isEmpty())
			{*/
				mailLabel=new MailingLabel(all);
				
					listOfLabels.add(mailLabel);
					if(listOfLabels.isEmpty())
					{
						System.out.println("list is empty");
					}
					else
					{

						System.out.println(listOfLabels.toString()+"\n");
						System.out.println(mailLabel);
					}
				
				
			/*}
			else
			{
				System.out.println("File is empty");
			}*/
		} 
		catch (IOException io)
		{
			io.printStackTrace();
		}
		finally
		{
			System.out.println("Program Ending");
		}
	}
}
