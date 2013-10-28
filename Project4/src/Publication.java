import java.util.ArrayList;


public class Publication implements Comparable<Publication> {
	
	/**
	 * scholars(s)
	 */
	private ArrayList<String> scholars;
	
	/**
	 * title of this paper
	 */
	private String titlePaper;
	
	/**
	 * serial title
	 */
	private String titleSerial;
	
	/**
	 * starting page
	 */
	private String pageStart;
	
	/**
	 * ending page
	 */
	private String pageEnd;
	
	/**
	 * month the publication was published
	 */
	private String month;
	
	/**
	 * year the publication was published
	 */
	private String year;
	
	/**
	 * hyperlink to publication (optional)
	 */
	private String link;
	
	/**
	 * method of comparing publications to each other
	 * 
	 * set to:
	 * 0 = Scholar
	 * 1 = Paper Title
	 * 2 = Date
	 */
	public static int compareMethod = 0;
	/**
	 * Publication constructor without link
	 * 
	 * @param scholars list of scholars
	 * @param titlePaper paper title
	 * @param titleSerial serial title
	 * @param pageStart starting page
	 * @param pageEnd ending page
	 * @param month month of publication
	 * @param year year of publication
	 */
	public Publication(ArrayList<String> scholars, String titlePaper, String titleSerial, 
			String pageStart, String pageEnd, String month, String year){
		
		this.scholars = new ArrayList<String>();
		
		for(String scholar : scholars) {
			addScholar(scholar);
		}
		
		setTitlePaper(titlePaper);
		
		setTitleSerial(titleSerial);
		
		setPageStart(pageStart);
		
		setPageEnd(pageEnd);
		
		setDate(month, year);
	}
	
	/**
	 * Publication constructor with link
	 * 
	 * @param scholars list of scholars
	 * @param titlePaper paper title
	 * @param titleSerial serial title
	 * @param pageStart starting page
	 * @param pageEnd ending page
	 * @param month month of publication
	 * @param year year of publication
	 * @param link hyperlink to publication
	 */
	public Publication(ArrayList<String> scholars, String titlePaper, String titleSerial, 
			String pageStart, String pageEnd, String month, String year, String link){
		
		this.scholars = new ArrayList<String>();
		
		for(String scholar : scholars) {
			if(scholar != null)
				addScholar(scholar);
		}
		
		setTitlePaper(titlePaper);
		
		setTitleSerial(titleSerial);
		
		setPageStart(pageStart);
		
		setPageEnd(pageEnd);
		
		setDate(month, year);
		
		setLink(link);
	}

	/**
	 * checks if str can be cast into an int
	 * from http://stackoverflow.com/questions/1102891/how-to-check-a-string-is-a-numeric-type-in-java
	 * 
	 * @param str string to check
	 * @return true if numeric, false if not
	 */
	public static boolean isNumeric(String str)
	{
	    return str.matches("[+-]?\\d*(\\.\\d+)?");
	}
	
	/**
	 * checks if string is invalid or nonexistent
	 * @param prop string to check
	 * @return true of valid, false if not
	 */
	public static boolean isValid(String prop) {
		if(prop.length() > 0)
			return true;
		return false;
	}
	
	/**
	 * checks if int is invalid or nonexistent
	 * @param prop int to check
	 * @return true of valid, false if not
	 */
	public static boolean isValid(int prop) {
		if(prop > 0)
			return true;
		return false;
	}
	
	/**
	 * checks if list is invalid or nonexistent
	 * @param prop list to check
	 * @return true of valid, false if not
	 */
	public static boolean isValid(ArrayList<String> prop) {
		if(prop != null && !prop.isEmpty() && prop.get(0) != null)
			return true;
		return false;
	}
	
	@Override
	public int compareTo(Publication other) {
		if(compareMethod == 0)
		{
			if(this.getScholars() != null && this.getScholars().size() > 0 && 
					other.getScholars() != null && other.getScholars().size() > 0)
				return this.getScholars().get(0).compareTo(other.getScholars().get(0));
			else
				return 0;
		}
		else if(compareMethod == 1)
		{
			if(this.getTitlePaper() != null && this.getTitlePaper().length() > 0 && 
					other.getTitlePaper() != null && other.getTitlePaper().length() > 0 )
				return this.getTitlePaper().compareTo(other.getTitlePaper());
			else
				return 0;
		}
		else if(compareMethod == 2)
		{
			if(this.getDate() != null && this.getDate().length() > 0 && 
					other.getDate() != null && other.getDate().length() > 0 )
				return this.getDate().compareTo(other.getDate());
			else
				return 0;
		}
			return 0;
	}
	
	public String toString() {
		String out="";
		
		out += "\nPublication";
		
		out += "\n\tAuthors = ";
		
		for(String author : getScholars())
		{
			out += author + "; ";
		}
		
		out += "\n\tPaper Title = " + getTitlePaper();
		
		out += "\n\tSerial Title = " + getTitleSerial();
		
		out += "\n\tStarting Page = " + getPageStart();
		
		out += "\n\tEnding Page = " + getPageEnd();
		
		out += "\n\tTime of Publication = " + getDate();
		
		out += "\n\tHyperlink = " + getLink();
		
		return out;
	}
	
	public ArrayList<String> getScholars() {
		if(isValid(scholars))
			return scholars;
		return new ArrayList<String>();
	}
	
	public String getScholarsString() {
		String out = "";
		
		for(String author : getScholars())
		{
			out += author + "; ";
		}
		
		return out;
	}
	
	
	public boolean addScholar(String author) {
		return scholars.add(author);
	}
	
	public boolean removeScholar(String author) {
		return scholars.remove(author);
	}
	
	public String getTitleSerial() {
		if(isValid(titleSerial))
			return titleSerial;
		return "Invalid Serial Title";
	}
	
	public boolean setTitleSerial(String titleSerial) {
		this.titleSerial = titleSerial;
		return false;
	}
	
	public String getTitlePaper() {
		return titlePaper;
	}
	
	public boolean setTitlePaper(String titlePaper) {
		this.titlePaper = titlePaper;
		return true;
	}
	
	public String getPageStart() {
		return pageStart;
	}
	
	public boolean setPageStart(String pageStart) {
		this.pageStart = pageStart;
		return true;
	}
	
	public String getPageEnd() {
		return pageEnd;
	}
	
	public boolean setPageEnd(String pageEnd) {
		this.pageEnd = pageEnd;
		return true;
	}
	
	public String getDate() {
		return month + " " + year;
	}
	
	public String getYear() {
		return year;
	}
	
	public boolean setDate(String month, String year) {
		this.month = month;
		this.year = year;
		return true;
	}
	
	public String getLink() {
		return link;
	}
	
	public boolean setLink(String link) {
		this.link = link;
		return true;
	}
}