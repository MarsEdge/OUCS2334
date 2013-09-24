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
	public Parser(String[] program_args) {
		if(isValidSearchName(program_args))
			setFileLoc(file_loc);
	}
	
	/**
	 * decides whether or not the entered search name is valid
	 *
	 * @return true if valid, false if not
	 */
	public boolean isValidSearchName(String[] program_args) {
		//ensure an program argument exists
		if(program_args != null && program_args.length > 0 && program_args[0].length() > 0)
			return true;
		else {
			return false;
		}
	}
	
	public boolean parseFile() throws IOException {
		return false;
	}
	
	public boolean writeFile() throws IOException {
		return false;
	}
	
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
