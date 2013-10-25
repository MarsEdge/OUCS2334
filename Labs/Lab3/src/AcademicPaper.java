import java.util.ArrayList;
import java.util.Calendar;


/**
 * Lab #3
 * CS 2334, Section 0??
 * September 12, 2013
 * <P>
 * This class provides a very simple model for an academic paper.
 * </P>
 * @author Leave Blank
 * @version 1.0
 */
public class AcademicPaper implements Comparable<AcademicPaper> {
		
	/** The title of the paper. */
	private String title;
	
	/** The names of the authors of the paper */
	private ArrayList<String> authorNames;

	/** The paper's date of publication. */
	private Calendar dateOfPublication;

	
	/**
	 * This is the default constructor for the class.
	 */   
	public AcademicPaper() {
		title = "";
		authorNames = null;
		dateOfPublication = null;
	}

	/**
	 * This is a constructor for the class. 
	 * It instantiates the class with user-supplied values.
	 * This version of the constructor is used when only one author name is provided.
	 * <P>
	 * @param        title        	    The title of the paper.
	 * @param        authorName         The name of the author.
	 * @param        dateOfPublication  When the paper was published.
	 */   
	public AcademicPaper(String title, String authorName, Calendar dateOfPublication) {
		this.title = title;
		this.authorNames = new ArrayList();
		this.dateOfPublication = dateOfPublication;
		
		authorNames.add(authorName);
	}
	
	/**
	 * This is a constructor for the class. 
	 * It instantiates the class with user-supplied values.
	 * This version of the constructor is used when multiple authors names are provided.
	 * <P>
	 * @param        title        	    The title of the paper.
	 * @param        authorNames        The names of the authors.
	 * @param        dateOfPublication  When the paper was published.
	 */   
	public AcademicPaper(String title, ArrayList authorNames, Calendar dateOfPublication) {
		this.title = title;
		this.authorNames = authorNames;
		this.dateOfPublication = dateOfPublication;
	}
	
	/**
	 * This method returns the attributes of this class as a single string.
	 * </P>
	 * @return            String representing the contents of this object.
	 */
	public String toString(){
		String Summary = "";
		Summary += "Title = " + title;
		Summary += ", Author(s) = ";
		for(int i = 0; i < authorNames.size(); i++) {
			Summary += authorNames.get(i);
			Summary += ", ";
		}
		Summary += "Date of Publicaition = ";
		
		Summary += dateOfPublication.toString();
		
		return Summary;
	}


	/**
	 * This method compares an instance of this AcademicPaper, with another
	 * instance of AcademicPaper.
	 * <P>
	 * Algorithm:<br>
	 * ????
	 * </P>
	 * @param             obj         The object to which we are comparing
	 *                                this instance of AcademicPaper.
	 * @return            ?????????
	 */    
	public int compareTo(AcademicPaper obj){
		if(title.compareTo(obj.title) != 0)
			return title.compareTo(obj.title);
		
		for(int i = 0; i < authorNames.size(); i++) {
			if(authorNames.get(i).compareTo(obj.authorNames.get(i)) != 0)
				return authorNames.get(i).compareTo(obj.authorNames.get(i));
		}
		
		if(dateOfPublication.compareTo(obj.dateOfPublication) != 0)
			return dateOfPublication.compareTo(obj.dateOfPublication);
		return 0;
	}
}