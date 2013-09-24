import java.util.ArrayList;
import java.util.Calendar;

public class JournalArticle extends Publication {
	private int volume;
	private int issue;
	
	public JournalArticle( ){
		//init class vars
	}
	
	/**
	 * JournalArticle constructor without link
	 * 
	 * @param Authors list of authors
	 * @param titlePaper paper title
	 * @param titleSerial serial title
	 * @param pageStart starting page
	 * @param pageEnd ending page
	 * @param date date of publication
	 * @param volume journal volume
	 * @param issue journal issue
	 */
	public JournalArticle(ArrayList<String> Authors, String titlePaper, String titleSerial, 
			int pageStart, int pageEnd, Calendar date, int volume, int issue) {
		
		super(Authors, titlePaper, titleSerial, pageStart, pageEnd, date);
		
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
	 * @param date date of publication
	 * @param link hyperlink to publication
	 * @param volume journal volume
	 * @param issue journal issue
	 */
	public JournalArticle(ArrayList<String> Authors, String titlePaper, String titleSerial, 
			int pageStart, int pageEnd, Calendar date, String link, int volume, int issue) {
		
		super(Authors, titlePaper, titleSerial, pageStart, pageEnd, date, link);
		
		setVolume(volume);
		
		setIssue(issue);
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getIssue() {
		return issue;
	}
	
	public boolean setIssue(int issue) {
		this.issue = issue;
	}
}
