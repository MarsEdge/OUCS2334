import java.util.ArrayList;

public class Scholar implements Comparable<Scholar>{
	
	private Name name;
	
	/**
	 * publications published by this scholar
	 */
	private ArrayList<Publication> publishedPapers = new ArrayList<Publication>();
	
	/**
	 * default constructor
	 * 
	 * @param nameWhole name of author
	 */
	public Scholar(String nameWhole) {
		name.setName(nameWhole);
	}
	
	public String toString() {
		return name.getName();
	}
	
	@Override
	public int compareTo(Scholar arg0) {
		return this.name.getName().compareTo(arg0.name.getName());
	}
	
	public Name getName() {
		return this.name;
	}
	
	public void setName(Name name) {
		this.name = name;
	}
	
	public ArrayList<Publication> getPublishedPapers()
	{
		return publishedPapers;
	}
	
	public boolean addPublishedPaper(Publication paper)
	{
		publishedPapers.add(paper);
		return true;
	}
}
