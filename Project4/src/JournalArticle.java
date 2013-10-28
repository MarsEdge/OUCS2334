import java.util.ArrayList;

public class JournalArticle extends Publication {
	
	/**
	 * volume the Journal Article was in
	 */
	private String volume;
	
	/**
	 * issue the Journal Article was in
	 */
	private String issue;
	
	/**
	 * JournalArticle constructor without link
	 * 
	 * @param Authors list of authors
	 * @param titlePaper paper title
	 * @param titleSerial serial title
	 * @param pageStart starting page
	 * @param pageEnd ending page
	 * @param month month of publication
	 * @param year year of publication
	 * @param volume journal volume
	 * @param issue journal issue
	 */
	public JournalArticle(ArrayList<String> Authors, String titlePaper, String titleSerial, 
			String pageStart, String pageEnd, String month, String year, String volume, String issue) {
		
		super(Authors, titlePaper, titleSerial, pageStart, pageEnd, month, year);
		
		setVolume(volume);
		
		setIssue(issue);
	}
	
	/**
	 * JournalArticle constructor with link
	 * 
	 * @param Authors list of authors
	 * @param titlePaper paper title
	 * @param titleSerial serial title
	 * @param pageStart starting page
	 * @param pageEnd ending page
	 * @param month month of publication
	 * @param year year of publication
	 * @param link hyperlink to publication
	 * @param volume journal volume
	 * @param issue journal issue
	 */
	public JournalArticle(ArrayList<String> Authors, String titlePaper, String titleSerial, 
			String pageStart, String pageEnd, String month, String year, String link, String volume, String issue) {
		
		super(Authors, titlePaper, titleSerial, pageStart, pageEnd, month, year, link);
		
		setVolume(volume);
		
		setIssue(issue);
	}
	
	public String toString() {
		String out="";
		
		out += super.toString();
		
		out += "\n\tVolume = " + getVolume();
		
		out += "\n\tIssue = " + getIssue();
		
		return out;
	}
	
	public String getVolume() {
		return volume;
	}
	
	public boolean setVolume(String volume) {
		if(isValid(volume)) {
			this.volume = volume;
			return true;
		}
		this.volume = "";
		return false;
	}
	
	public String getIssue() {
		return issue;
	}
	
	public boolean setIssue(String issue) {
		if(isValid(issue)) {
			this.issue = issue;
			return true;
		}
		this.issue = "";
		return false;
	}
}
