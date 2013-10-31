import java.util.ArrayList;


public class ConferencePaper extends Publication {

	/** conference were the paper was published */
	private Conference conference;
	
	/**
	 * ConferencePaper constructor without link
	 * 
	 * @param Authors list of authors
	 * @param titlePaper paper title
	 * @param titleSerial serial title
	 * @param pageStart starting page
	 * @param pageEnd ending page
	 * @param month month of publication
	 * @param year year of publication
	 */
	public ConferencePaper(ArrayList<String> Authors, String titlePaper, String titleSerial, 
			String pageStart, String pageEnd, String month, String year) {
		
		super(Authors, titlePaper, titleSerial, pageStart, pageEnd, month, year);

	}
	
	/**
	 * ConferencePaper constructor with link
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
	public ConferencePaper(ArrayList<String> Authors, String titlePaper, String titleSerial, 
			String pageStart, String pageEnd, String month, String year, String link) {
		
		super(Authors, titlePaper, titleSerial, pageStart, pageEnd, month, year, link);

	}
	
	public String toString() {
		String out="";
		
		out += super.toString();
		
		return out;
	}
	

	public Conference getConference() {
		return conference;
	}

	public void setConference(Conference conference) {
		this.conference = conference;
	}

	
	
}
