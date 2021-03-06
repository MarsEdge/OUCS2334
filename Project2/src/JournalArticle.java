import java.util.ArrayList;

public class JournalArticle extends Publication {
	private int volume;
	private int issue;
	
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
			int pageStart, int pageEnd, String month, int year, int volume, int issue) {
		
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
	 * @param date date of publication
	 * @param link hyperlink to publication
	 * @param volume journal volume
	 * @param issue journal issue
	 */
	public JournalArticle(ArrayList<String> Authors, String titlePaper, String titleSerial, 
			int pageStart, int pageEnd, String month, int year, String link, int volume, int issue) {
		
		super(Authors, titlePaper, titleSerial, pageStart, pageEnd, month, year, link);
		
		setVolume(volume);
		
		setIssue(issue);
	}
	
	public String toString() {
		String out="";
		
		out += "\nJournal Article";
		
		out += "\n\tAuthors = ";
		
		for(String author : getAuthors())
		{
			out += author + "; ";
		}
		
		out += "\n\tPaper Title = " + getTitlePaper();
		
		out += "\n\tSerial Title = " + getTitleSerial();
		
		out += "\n\tStarting Page = " + getPageStart();
		
		out += "\n\tEnding Page = " + getPageEnd();
		
		out += "\n\tTime of Publication = " + getDate();
		
		out += "\n\tHyperlink = " + getLink();
		
		out += "\n\tVolume = " + getVolume();
		
		out += "\n\tIssue = " + getIssue();
		
		return out;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean setVolume(int volume) {
		if(isValid(volume)) {
			this.volume = volume;
			return true;
		}
		this.volume = -1;
		return false;
	}
	
	public int getIssue() {
		return issue;
	}
	
	public boolean setIssue(int issue) {
		if(isValid(issue)) {
			this.issue = issue;
			return true;
		}
		this.issue = -1;
		return false;
	}
}
