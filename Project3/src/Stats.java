import java.util.ArrayList;
import java.util.HashMap;

public class Stats {
	
	/**
	 * Helper function to get number of Publications in ArrayList
	 * @param pubs publications to get number from
	 * 
	 * @return number of Publications in ArrayList
	 */
	public static int NumCPs(ArrayList<Publication> pubs) {
		int out=0;
		
		for(Publication pub : pubs)
		{
			if(!(pub instanceof JournalArticle))
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
			if(pub instanceof JournalArticle)
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
	public static HashMap<String, Integer> NumOfYears(ArrayList<Publication> pubs) {
		HashMap<String, Integer> numYears = new HashMap<String, Integer>();
		
		for(Publication pub : pubs)
		{
			 if(!numYears.containsKey(pub.getYear()))
			 {
				 numYears.put(pub.getYear(), 1);
			 }
			 else
			 {
				 numYears.put(pub.getYear(),numYears.get(pub.getYear()) + 1);
			 }
		}
		
		return numYears;
	}
	
	/**
	 * Helper function to get number of different years in ArrayList that are Publications
	 * @param pubs publications to get number from
	 * 
	 * @return number of different years in ArrayList that are Publications
	 */
	public static HashMap<String, Integer> NumOfCPYears(ArrayList<Publication> pubs) {
		HashMap<String, Integer> numYears = new HashMap<String, Integer>();
		
		for(Publication pub : pubs)
		{
			if(!(pub instanceof JournalArticle))
			{
				if(!numYears.containsKey(pub.getYear()))
				{
					numYears.put(pub.getYear(), 1);
				}
				else
				{
					numYears.put(pub.getYear(),numYears.get(pub.getYear()) + 1);
				}
			}
		}
		
		return numYears;
	}
	
	/**
	 * Helper function to get number of different years in ArrayList that are Journal Articles
	 * @param pubs publications to get number from
	 * 
	 * @return number of different years in ArrayList that are Journal Articles
	 */
	public static HashMap<String, Integer> NumOfJounalYears(ArrayList<Publication> pubs) {
		HashMap<String, Integer> numYears = new HashMap<String, Integer>();
		
		for(Publication pub : pubs)
		{
			if(pub instanceof JournalArticle)
			{
				if(!numYears.containsKey(pub.getYear()))
				{
					numYears.put(pub.getYear(), 1);
				}
				else
				{
					numYears.put(pub.getYear(),numYears.get(pub.getYear()) + 1);
				}
			}
		}
		
		return numYears;
	}
	
	/**
	 * Helper function to get number of coauthors in ArrayList
	 * @param pubs publications to get number from
	 * 
	 * @return HashMap of Publication name and number of coauthors
	 */
	public static HashMap<String, Integer> NumCoAuthors(ArrayList<Publication> pubs) {
		HashMap<String, Integer> out = new HashMap<String, Integer>();
		
		for(Publication pub : pubs)
		{
			 if(!out.containsKey(pub.getTitlePaper()))
			 {
				 out.put(pub.getTitlePaper().substring(0, 12), pub.getAuthors().size()-1);
			 }
		}
		
		return out;
	}
}
