import java.io.Serializable;


/**
 * Lab #4 CS 2334, Section 0?? September 26, 2013
 * <P>
 * This class models an Author of an academic paper.
 * </P>
 * 
 * @author
 * @version 1.0
 * 
 * implements Serializable
 */

public class Author implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -5232766414139957648L;

	/** Primary Name (last name) of the author. */
	private String primaryName;

	/** Secondary Name (first and middle names, if any) of the author. */
	private String secondaryName;
	
	/** The institutional affiliation of the author. */
	private String institution;


	/**
	 * This is the default constructor for Author.
	 */
	public Author() {
		primaryName = "";
		secondaryName = "";
		institution = "";
	}

	/**
	 * This is the constructor for an Author It instantiates the class with user
	 * supplied values.
	 * <P>
	 * 
	 * @param primaryName
	 *            The primary name of the author (last name)
	 * @param secondaryName
	 *            The secondary name of the author (first and middle names)
	 * @param institution
	 *            The institution where the author works.
	 */
	public Author(String primaryName, String secondaryName, String institution) {
		this.primaryName = primaryName;
		this.secondaryName = secondaryName;
		this.institution = institution;
	}

	/**
	 * This method returns the attributes of this class as a single string. </P>
	 * 
	 * @return String representing the contents of this object.
	 */
	public String toString() {
		String attributesAsString = this.primaryName + ", " + this.secondaryName + ", " 
				+ this.institution;
		return (attributesAsString);
	}
		
		
}
