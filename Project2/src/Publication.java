import java.util.ArrayList;
import java.util.Calendar;


public class Publication implements Comparable<Publication> {
	
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
	 * default constructor 
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
	public static boolean isValidList(ArrayList<?> prop) {
		if(prop.size() > 0 && prop.get(0) != null)
			return true;
		return false;
	}
	
	@Override
	public int compareTo(Publication o) {
		// TODO Auto-generated method stub
		return 0;
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
		return false;
	}
	
	public String getTitlePaper() {
		return titlePaper;
	}
	
	public boolean setTitlePaper(String titlePaper) {
		this.titlePaper = titlePaper;
		return false;
	}
	
	public int getPageStart() {
		return pageStart;
	}
	
	public boolean setPageStart(int pageStart) {
		this.pageStart = pageStart;
		return false;
	}
	
	public int getPageEnd() {
		return pageEnd;
	}
	
	public boolean setPageEnd(int pageEnd) {
		this.pageEnd = pageEnd;
		return false;
	}
	
	public Calendar getDate() {
		return date;
	}
	
	public boolean setDate(Calendar date) {
		this.date = date;
		return false;
	}
	
	public String getLink() {
		return link;
	}
	
	public boolean setLink(String link) {
		this.link = link;
		return false;
	}
}