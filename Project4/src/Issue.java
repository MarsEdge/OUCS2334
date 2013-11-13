import java.util.ArrayList;
import java.util.HashMap;

public class Issue {
	
	/** publication date */
	private Date pubDate;
	
	/** map of issue editors */
	private ArrayList<String> editors = new ArrayList<String>();
	
	/** map of issue reviewers */
	private ArrayList<String> reviewers = new ArrayList<String>();
	
	/** map of articles in issue */
	private ArrayList<String> articles = new ArrayList<String>();

	public Issue(String editors, String reviewers) {
		addEditor(editors);
		addReviewer(reviewers);
	}

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	public ArrayList<String> getEditors() {
		return editors;
	}

	public void setEditors(ArrayList<String> editors) {
		this.editors = editors;
	}
	
	public void addEditor(String key) {
		this.editors.add(key);
	}
	
	public void removeEditor(String key) {
		this.editors.remove(key);
	}
	
	public ArrayList<String> getReviewers() {
		return reviewers;
	}

	public void setReviewers(ArrayList<String> reviewers) {
		this.reviewers = reviewers;
	}
	
	public void addReviewer(String key) {
		this.reviewers.add(key);
	}
	
	public void removeReviewer(String key) {
		this.reviewers.remove(key);
	}

	public ArrayList<String> getArticles() {
		return articles;
	}

	public void setArticles(ArrayList<String> articles) {
		this.articles = articles;
	}
	
	public void addArticle(String key) {
		this.articles.add(key);
	}
	
	public void removeArticle(String key) {
		this.articles.remove(key);
	}
	
}