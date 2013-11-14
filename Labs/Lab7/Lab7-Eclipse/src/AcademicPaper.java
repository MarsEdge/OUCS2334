import java.util.ArrayList;

/**
 * Lab #7
 * CS 2334, Section SECTION NUMBER GOES HERE
 * DATE GOES HERE
 * <p>
 * Each object of this class represents an Academic Paper.
 * </p>
 * @version 1.0
 *
 */
public class AcademicPaper {
	private String title;
	private ArrayList<String> authors;
	private String serialTitle;
	private String pages;
	private String publicationDate;
	

	/**
	 * Constructor with all params.
	 * 
	 * @param title  			String to set as the title of the paper.
	 * @param authors 			ArrayList<String> to set as the list of authors of the paper.
	 * @param serialTitle 		String to set as the title of the serial in which the paper is published.
	 * @param pages             The pages where the article is.
	 * @param publicationDate	String to set as the publication date of the paper.
	 */
	public AcademicPaper(String title, ArrayList<String> authors, String serialTitle,
			String pages, String publicationDate) {
		this.setTitle(title);
		this.setAuthors(authors);
		this.setSerialTitle(serialTitle);
		this.setPages(pages);
		this.setPublicationDate(publicationDate);
	}
	
	public AcademicPaper(String[] tokens) {
		this.title = tokens[0].trim();
		this.serialTitle = tokens[1].trim();
		this.pages  = tokens[2].trim() +"-" + tokens[3].trim();
		this.publicationDate = tokens[4].trim();
		
		ArrayList<String> authors = new ArrayList<String>();
		
		// The author names will be the last tokens in the line, with the
		// format:
		//  primaryName_0, secondaryName_0, primaryName_1, secondaryName_1,...
		
		for (int i = 5; i + 1 < tokens.length; i += 2) {
			authors.add( tokens[i].trim() + ", " + tokens[i+1].trim());
		}
		this.authors = authors;
	}

	/**
	 * Accessor for title
	 * 
	 * @return 	The title of the academic paper as a String.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Mutator for title
	 * 
	 * @param 	title 	String to be used as the new title.
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	/**
	 * Accessor for authors
	 * 
	 * @return 	The list of authors as an ArrayList<String>.
	 */
	public ArrayList<String> getAuthors() {
		return authors;
	}

	/**
	 * Mutator for authors
	 * 
	 * @param authors 	ArrayList<String> to be used as the new list of authors.
	 */
	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}
	
	/**
	 * Accessor for serialTitle
	 * 
	 * @return 	The title of the serial in which the paper paper is published as a String.
	 */
	public String getSerialTitle() {
		return serialTitle;
	}

	/**
	 * Mutator for serialTitle
	 * 
	 * @param 	title 	String to be used as the new serial title.
	 */
	public void setSerialTitle(String serialTitle) {
		this.serialTitle = serialTitle;
	}
	
	/**
	 * 
	 * @return pages   The pages where the article appears.
	 */
	public String getPages() {
		return pages;
	}

	/**
	 * 
	 * @param pages   The pages where the article appears.
	 */
	public void setPages(String pages) {
		this.pages = pages;
	}

	/**
	 * Accessor for publication date
	 * 
	 * @return 	The date of publication as a String.
	 */
	public String getPublicationDate() {
		return publicationDate;
	}
	
	/**
	 * Mutator for publication date
	 * 
	 * @param publicationDate 	String to be used as the new publication date.
	 */
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	/**
	 * @param authorName the new author to add to the paper's author list.
	 */
	public void addAuthor(String authorName) {
		authors.add(authorName);
	}
	

	/**
	 * Overridden toString method
	 *  
	 * @return  The academic paper as a String.
	 */
	@Override
	public String toString() {
		// Concatenate all authors.
		String authorsAsString = authors.get(0);
		for(int i=1; i< authors.size(); i++) {
			authorsAsString += "; " + authors.get(i);
		}
		
		return authorsAsString + ".  \"" + title + ".\"  "
				+ serialTitle + ".  " + pages + ". " + publicationDate + ".";
	}
}