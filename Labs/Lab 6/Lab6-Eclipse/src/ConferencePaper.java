import java.util.ArrayList;

/**
 * Lab #6
 * CS 2334, Section SECTION NUMBER GOES HERE
 * DATE GOES HERE
 * <p>
 * Each object of this class represents a Conference Paper.
 * </p>
 * @version 1.0
 *
 */
public class ConferencePaper extends AcademicPaper {

	/**
	 * @param title  			String to set as the title of the paper.
	 * @param authors 			ArrayList<String> to set as the list of authors of the paper.
	 * @param serialTitle 		String to set as the title of the serial in which the paper is published.
	 * @param publicationDate	String to set as the publication date of the paper.
	 */
	public ConferencePaper(String title, ArrayList<String> authors, String serialTitle,
			String publicationDate) {
		super(title, authors, serialTitle, publicationDate);
		
	}

}
