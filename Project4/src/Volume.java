import java.io.Serializable;
import java.util.ArrayList;

public class Volume implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 690029351128336433L;
	/** issues in this volume */
	private ArrayList<Issue> issues = new ArrayList<Issue>();
	
	public Volume(String editor, String reviewer) {
		addIssue(new Issue(editor, reviewer));
	}

	public ArrayList<Issue> getIssues() {
		return issues;
	}

	public void setIssues(ArrayList<Issue> issues) {
		this.issues = issues;
	}
	
	public void addIssue(Issue issue) {
		this.issues.add(issue);
	}
	
	public void removeIssue(Issue issue) {
		this.issues.remove(issue);
	}
}