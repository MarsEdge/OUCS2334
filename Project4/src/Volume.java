import java.util.ArrayList;

public class Volume {
	
	/** issues in this volume */
	private ArrayList<Issue> issues;

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