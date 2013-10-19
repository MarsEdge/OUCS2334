import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

/**
 * Lab #6
 * CS 2334, Section SECTION NUMBER GOES HERE
 * DATE GOES HERE
 * <p>
 * Each object of this class represents a collection of academic papers.
 * Each key is the title of a paper and each value is an academic paper.
 * Naturally, the key should be the title of the paper in the value.
 * (You wouldn't want to associate the title of one paper with a different paper.)
 * 
 * Note that for this lab we are assuming each academic paper has a unique title.
 * </p>
 * @version 1.0
 *
 */
public class AcademicPapers implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2425756350085082399L;
	// Maps the title of the academic paper to the academic paper object.
	private HashMap<String, AcademicPaper> academicPaperMap;


	/**
	 * No argument constructor creates an empty collection of academic papers.
	 */
	public AcademicPapers () {
		this.academicPaperMap = new HashMap<String, AcademicPaper>();
	}

	/**
	 * Getter for the values of the HashMap of academic papers.
	 * 
	 * @return 	A copy of the academic paper map.
	 */
	public HashMap<String, AcademicPaper> getAcademicPaperMap() {
		return new HashMap<String, AcademicPaper>(academicPaperMap);
	}

	/**
	 * Mutator method for the collection of academic papers.
	 * 
	 * @param academicPaperMap 	The collection of academic papers to set.
	 */
	public void setAcademicPaperMap(HashMap<String, AcademicPaper> academicPaperMap) {
		this.academicPaperMap = academicPaperMap;
	}
	
	/**
	 * @param title the title of the academic paper to look for in the collection
	 * @return true if the paper title is already in the collection, false otherwise
	 */
	public boolean contains(String title) {
		return this.academicPaperMap.containsKey(title);
	}
	
	/**
	 * @param title the title of the academic paper to look for in the collection
	 * @return the found academic paper converted to a String
	 */
	public String getAcademicPaperString(String title) {
		return this.academicPaperMap.get(title).toString();
	}
	
	/**
	 * Method to add one academic paper to the collection of academic papers.
	 * 
	 * @param academicPaper 	The academic paper that is to be added to the collection.
	 */
	public void addToAcademicPapers(AcademicPaper academicPaper) {
		this.academicPaperMap.put(academicPaper.getTitle(), academicPaper);
	}
	
	/**
	 * @param academicPaper the academic paper to replace in the academicPaperMap
	 */
	public void replaceInAcademicPaperMap(AcademicPaper academicPaper) {
		this.academicPaperMap.put(academicPaper.getTitle(), academicPaper);
	}
	
	/**
	 * @param paperTitle the title of the academic paper to which to add a new author name
	 * @param authorName the new author to add to the academic paper
	 */
	public void addToAuthorList(String paperTitle, String authorName) {
		this.academicPaperMap.get(paperTitle).addAuthor(authorName);
	}
	
	/**
	 * Method to clear the collection of academic papers.
	 */
	public void clearAcademicPapers() {
		this.academicPaperMap = new HashMap<String, AcademicPaper>();
	}
	
	public void printPapers() {
		for (Object value : academicPaperMap.values()) {
		    System.out.println(value);
		}
	}
}