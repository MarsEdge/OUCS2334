import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;


/**
 * Lab #4 CS 2334, Section 0?? September 26, 2013
 * <P>
 * This class implements a program that tests the Paper and Author classes.
 * </P>
 * 
 * @author
 * @version 1.0
 */
public class Lab4Driver  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1188088305997645472L;
	
	public static void writePapers(String filename, ArrayList<Paper> papers) throws IOException {
		
		FileOutputStream out_stream = new FileOutputStream(filename);
		
		ObjectOutputStream out = new ObjectOutputStream(out_stream);
		
		out.writeObject(papers);
		
		out.close();
	}
	
	public static ArrayList<Paper> readPapers (String filename) throws IOException, ClassNotFoundException {
		
		FileInputStream fileInputStream = new FileInputStream(filename);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		ArrayList<Paper> papers = (ArrayList<Paper>) objectInputStream.readObject();
		objectInputStream.close();
		return papers;
	}
	/**
	 * This is the main method for this test program. Since this is a simple
	 * test program, all of our code will be in the main method. Typically this
	 * would be a bad design, but we are just testing out some features of Java.
	 * <P>
	 * 
	 * @param args
	 *            Contains the command line arguments.
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		// --- Step 8 ---

		// Create a list of three Author objects
		
		ArrayList<Author> authors = new ArrayList<Author>();
		
		authors.add(new Author());
		
		authors.add(new Author());
		
		authors.add(new Author());

		// Create a Paper and assign the Authors to this paper.

		Paper paper = new Paper("Title", authors, 9999);
		
		// Write the Paper object to a file
		
		Paper.writePaper("Lab4Paper", paper);
		
		// Set the Paper object to null
		
		paper = null;

		// Print the Paper object to the console (show that the object is null)
		
		System.out.println(paper);
		
		// Read the Paper from a file
		
		paper = Paper.readPaper("Lab4Paper");

		// Print the Paper to the console
		
		System.out.println(paper);

		// --- Step 11 ---

		// Create a list of 6 Paper objects called papers.
		// One of the papers must have the title: 
		//    "On the translation of languages from left to right"
		
		ArrayList<Paper> papers = new ArrayList<Paper>();
		
		papers.add(new Paper("On the translation of languages from left to right", authors, 9998));
		
		papers.add(new Paper("Title2", authors, 9998));
		
		papers.add(new Paper("Title3", authors, 9997));
		
		papers.add(new Paper("Title4", authors, 9996));
		
		papers.add(new Paper("Title5", authors, 9995));
		
		papers.add(new Paper("Title6", authors, 9994));
		
		// Sort the List using Collections.sort().
		
		Collections.sort(papers);
		
		// Print the Sorted list of papers.
		
		System.out.println(papers);
		
		// Write the (Sorted) list to a file
		
		writePapers("Lab4Papers", papers);

		// Clear the contents of the list
		
		papers.clear();

		// Print the list to the console (show that the list is empty)
		
		System.out.println(papers);

		// Read in the list from a file
		
		papers = readPapers("Lab4Papers");
		
		// Print the contents of the list to the console (show that the list is sorted).
		
		System.out.println(papers);
		
		// Use the Search.binarySearch() method provided to search for a given
		
		
		int index = Searcher.binarySearch(papers, new Paper("On the translation of languages from left to right", authors, 9998));
		// paper with title "On the translation of languages from left to right"
		
		// Print the position of the given paper.
		
		System.out.println(papers.get(index) + " at position " + index);

	}
}
