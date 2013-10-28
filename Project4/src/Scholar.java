import java.util.ArrayList;

public class Scholar implements Comparable<Scholar>{
	
	/**
	 * first name of the scholar
	 */
	private String nameFirst;
	
	/**
	 * last name of the scholar
	 */
	private String nameLast;
	
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
		setName(nameWhole);
	}
	
	public String toString() {
		return getName();
	}
	
	@Override
	public int compareTo(Scholar arg0) {
		return this.getName().compareTo(arg0.getName());
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
	
	public String getName() {
		return getNameFirst() + " " + getNameLast();
	}

	public void setName(String nameWhole) {
		if(nameWhole.contains(" ") == true)
		{
			String[] split = nameWhole.split("\\ ");
			setNameLast(split[0]);
			setNameFirst(split[split.length-1]);
		}
		else
			setNameFirst(nameWhole);
	}
	
	public String getNameFirst() {
		return nameFirst;
	}

	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}

	public String getNameLast() {
		return nameLast;
	}

	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
	}
}
