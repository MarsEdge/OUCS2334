import java.util.ArrayList;
import java.util.HashMap;

public class Stats {
	
	/**
	 * Helper function to get number of Publications in ArrayList
	 * @param pubs publications to get number from
	 * 
	 * @return number of Publications in ArrayList
	 */
	public static int NumPubs(ArrayList<Publication> pubs) {
		int out=0;
		
		for(Publication pub : pubs)
		{
			if((JournalArticle)(pub) == null)
			{
				out++;
			}
		}
		return out;
	}
	
	/**
	 * Helper function to get number of Journal Articles in ArrayList
	 * @param pubs journal articles to get number from
	 * 
	 * @return number of Journal Articles in ArrayList
	 */
	public static int NumJournals(ArrayList<Publication> pubs) {
		int out=0;
		
		for(Publication pub : pubs)
		{
			if((JournalArticle)(pub) != null)
			{
				out++;
			}
		}
		return out;
	}
	
	/**
	 * Helper function to get number of different years in ArrayList
	 * @param pubs publications to get number from
	 * 
	 * @return number of different years in ArrayList
	 */
	public static int NumOfYears(ArrayList<Publication> pubs) {
		int out = 0;
		HashMap<String, Publication> pubMap = new HashMap<String, Publication>();
		
		for(Publication pub : pubs)
		{
			if(!pubMap.containsKey(pub.getDate()))
			{
				out++;
				
				pubMap.put(pub.getDate(), pub);
			}
		}
		
		return out;
	}
	
	/**
	 * Helper function to get number of coauthors in ArrayList
	 * @param pub publications to get number from
	 * 
	 * @return number of coauthors as an Array of integers
	 */
	public static int[] NumCoAuthors(ArrayList<Publication> pubs) {
		int[] coAuthorNumArray = new int[pubs.size()];
		
		for(int i=0; i<=pubs.size(); i++){
			coAuthorNumArray[i]= pubs.get(i).getAuthors().size();
		}
		
		return coAuthorNumArray;
	}
}
