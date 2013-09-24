import java.util.ArrayList;
import java.util.Calendar;


public class Publication {
	
	/**
	 * author(s)
	 */
	private ArrayList<String> Authors;
	
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
	private int pageStart;
	
	/**
	 * ending age
	 */
	private int pageEnd;
	
	/**
	 * date of publication
	 */
	private Calendar date;
	
	/**
	 * hyperlink to publication (optional)
	 */
	private String link;
	
	/**
	 * default publication constructor 
	 */
	public Publication(){
		
	}
	
	/**
	 * Publication constructor without link
	 * 
	 * @param Authors list of authors
	 * @param titlePaper paper title
	 * @param titleSerial serial title
	 * @param pageStart starting page
	 * @param pageEnd ending page
	 * @param date date of publication
	 */
	public Publication(ArrayList<String> Authors, String titlePaper, String titleSerial, 
			int pageStart, int pageEnd, Calendar date){
		
	}
	
	/**
	 * Publication constructor with link
	 * 
	 * @param Authors list of authors
	 * @param titlePaper paper title
	 * @param titleSerial serial title
	 * @param pageStart starting page
	 * @param pageEnd ending page
	 * @param date date of publication
	 * @param link hyperlink to publication
	 */
	public Publication(ArrayList<String> Authors, String titlePaper, String titleSerial, 
			int pageStart, int pageEnd, Calendar date, String link){
		
	}
	
	//from http://stackoverflow.com/questions/1102891/how-to-check-a-string-is-a-numeric-type-in-java
	public static boolean isNumeric(String str)
	{
	    return str.matches("[+-]?\\d*(\\.\\d+)?");
	}
	
	public static boolean isValid(String prop) {
		if(isNumeric(prop) && prop.length() > 0)
			return true;
		return false;
	}
	
	public static boolean isValid(int prop) {
		if(prop > 0)
			return true;
		return false;
	}
	
	public static boolean isValidList(ArrayList<?> prop) {
		if(prop.size() > 0 && prop.get(0) != null)
			return true;
		return false;
	}
	
	public static void compareTo() {
		
	}

	public ArrayList<String> getAuthors() {
		if(isValidList(Authors))
			return Authors;
		return null;
	}

	public boolean addAuthor(String author) {
		if(isValid(author))
			return Authors.add(author);
		
		return false;
	}
	
	public boolean removeAuthor(String author) {
		return false;
	}

	public String getTitleSerial() {
		return titleSerial;
	}

	public boolean setTitleSerial(String titleSerial) {
		this.titleSerial = titleSerial;
	}

	public String getTitlePaper() {
		return titlePaper;
	}

	public boolean setTitlePaper(String titlePaper) {
		this.titlePaper = titlePaper;
	}

	public int getPageStart() {
		return pageStart;
	}

	public boolean setPageStart(int pageStart) {
		this.pageStart = pageStart;
	}

	public int getPageEnd() {
		return pageEnd;
	}

	public boolean setPageEnd(int pageEnd) {
		this.pageEnd = pageEnd;
	}

	public Calendar getDate() {
		return date;
	}

	public boolean setDate(Calendar date) {
		this.date = date;
	}

	public String getLink() {
		return link;
	}

	public boolean setLink(String link) {
		this.link = link;
	}
}
