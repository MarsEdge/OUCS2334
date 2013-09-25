import java.io.IOException;
import java.util.ArrayList;

public class Parser {
	
	/**
	 * list of all publications
	 */
	private ArrayList<Publication> publications;
	
	/**
	 * location of file to parse
	 */
	private String file_loc;
	
	/**
	 * default constructor
	 * 
	 * @param file_loc location of file to parse
	 */
	public Parser(String file_loc) {
		if(isValidSearchName(file_loc))
			setFileLoc(file_loc);
	}
	
	/**
	 * decides whether or not the entered search name is valid
	 *
	 * @param file_loc location of file to parse
	 * @return true if valid, false if not
	 */
	public boolean isValidSearchName(String file_loc) {
		//ensure an program argument exists
		if(file_loc.length() > 0)
			return true;
		else {
			return false;
		}
	}
	
	/**
	 * parses CSV file
	 * 
	 * @return true on success, false on error 
	 * @throws IOException
	 */
	public boolean parseFile() throws IOException {
		return false;
	}
	
	/**
	 * writes resultant file to disk
	 * 
	 * @return true on success, false on error 
	 * @throws IOException
	 */
	public boolean writeFile() throws IOException {
		return false;
	}
	
	/**
	 * creates a new publication object
	 * 
	 * @param line line of CVS file to turn into a publication
	 * @return publication it created
	 */
	public Publication makePublication(String line) {
		return new Publication();
	}
	
	/**
	 * searches CVS file for matching items
	 * 
	 * @param search_term term for which to search
	 * @return string containing all results from search
	 */
	public String search(String search_term) {
		return "Parser.search() is unimlemented\n";
	}
	
	public String getFileLoc() {
		return "Parser.getFileLoc() is unimlemented\n";
	}
	
	public boolean setFileLoc(String file_loc) {
		return false;
	}
}
