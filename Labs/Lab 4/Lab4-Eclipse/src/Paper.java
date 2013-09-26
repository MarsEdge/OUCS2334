import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


/**
 * Lab #4 CS 2334, Section 0?? September 26, 2013
 * <P>
 * This class models an academic Paper (either a journal article or a conference
 * proceeding.
 * </P>
 * 
 * @author
 * @version 1.0
 * 
 * implements Serializable
 */
public class Paper implements Serializable, Comparable<Paper>  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5125719271305836381L;

	/** The title of the paper */
	private String title;

	/** The year that the Paper was published */
	private int yearOfPublication;

	/** The authors of that paper */
	private ArrayList<Author> authors;

	/**
	 * This is the default constructor for Paper.
	 */
	public Paper() {
		title = "";
		yearOfPublication = 0;
		authors = null;
	}

	/**
	 * This is the constructor for Paper. It instantiates the class
	 * with user supplied values.
	 * <P>
	 * 
	 * @param title
	 *            The title of the paper.
	 * @param authors
	 *            The authors of the paper.
	 * @param yearOfPublication
	 *            The population for the given year
	 */
	public Paper(String title, ArrayList<Author> authors, int yearOfPublication) {
		this.title = title;
		this.authors = authors;
		this.yearOfPublication = yearOfPublication;
	}

	
	public String getTitle() {
		return title;
	}
	
	/**
	 * This method returns the attributes of this class as a single string. </P>
	 * 
	 * @return String representing the contents of this object.
	 */
	@Override
	public String toString() {
		String authorsAsString = "";
		
		// Concatenate all the authors.
		for(Author author: authors) {
			authorsAsString += " " + author.toString();
		}
		
		String attributesAsString = "(Title: " + this.title + 
				authorsAsString + 
				", Year of Publication: " + this.yearOfPublication + 
				 ")";
		return (attributesAsString);
	}
	
	
	/**
	 * This method compares two papers by their titles.
	 * 
	 * @param otherPaper
	 * @return
	 */
	@Override
	public int compareTo(Paper otherPaper) {
		return this.getTitle().compareTo(otherPaper.getTitle());
	}
	
	public static void writePaper (String filename, Paper paper) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(filename);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(paper);
		objectOutputStream.close();
	}
	
	public static Paper readPaper(String filename) throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(filename);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Paper paper = (Paper) objectInputStream.readObject();
		objectInputStream.close();
		return paper;
	}
}
