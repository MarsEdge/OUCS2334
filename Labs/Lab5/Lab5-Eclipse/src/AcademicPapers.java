import java.util.HashMap;

/**
 * Lab #5
 * CS 2334, Section SECTION NUMBER GOES HERE
 * DATE GOES HERE
 * <p>
 * Each object of this class represents a collection of academic papers.
 * Each key is the title of a paper and each value is an academic paper.
 * Naturally, the key should be the title of the paper in the value.
 * (You wouldn't want to associate the title of one paper with a different paper.)
 * </p>
 * @version 1.0
 *
 */
public class AcademicPapers {
	private HashMap<String, AcademicPaper> academicPaperMap;


	/**
	 * No argument constructor creates an empty collection of academic papers.
	 */
	public AcademicPapers () {
		this.academicPaperMap = new HashMap<String, AcademicPaper>();
	}

	/**
	 * Accessor for the values of the HashMap of academic papers.
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
	 * Method to add one academic paper to the collection of academic papers.
	 * 
	 * @param academicPaper 	The academic paper that is to be added to the collection.
	 */
	public void addToAcademicPapers(AcademicPaper academicPaper) {
		this.academicPaperMap.put(academicPaper.getTitle(), academicPaper);
	}
	
	/**
	 * Method to clear the collection of academic papers.
	 */
	public void clearAcademicPapers() {
		this.academicPaperMap = new HashMap<String, AcademicPaper>();
	}
}