import java.util.ArrayList;
import java.util.Calendar;


public class Publication {
	
	private ArrayList<String> Authors;
	private String titlePaper;
	private String titleSerial;
	private int pageStart;
	private int pageEnd;
	private Calendar date;
	private String link;
	
	public Publication(){
		
	}
	
	public Publication(ArrayList<String> Authors, String titlePaper, String titleSerial, int pageStart, int pageEnd, Calendar date, String link){
		
	}

	public ArrayList<String> getAuthors() {
		return Authors;
	}

	public void setAuthors(ArrayList<String> authors) {
		Authors = authors;
	}

	public String getTitleSerial() {
		return titleSerial;
	}

	public void setTitleSerial(String titleSerial) {
		this.titleSerial = titleSerial;
	}

	public String getTitlePaper() {
		return titlePaper;
	}

	public void setTitlePaper(String titlePaper) {
		this.titlePaper = titlePaper;
	}

	public int getPageStart() {
		return pageStart;
	}

	public void setPageStart(int pageStart) {
		this.pageStart = pageStart;
	}

	public int getPageEnd() {
		return pageEnd;
	}

	public void setPageEnd(int pageEnd) {
		this.pageEnd = pageEnd;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
	
	
}
