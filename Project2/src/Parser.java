import java.io.IOException;
import java.util.ArrayList;

public class Parser {
	private ArrayList<Publication> publications;
	
	private String file_loc;
	
	public Parser(String file_loc) {
		setFileLoc(file_loc);
	}
	
	/**
	 * decides whether or not the entered search name is valid
	 *
	 * @return true if valid, false if not
	 */
	public boolean isValidSearchName(String program_args[]){
		//ensure an program argument exists
		if(program_args != null && program_args.length > 0 && program_args[0].length() > 0)
			return true;
		else {
			return false;
		}
	}
	
	public boolean parseFile() throws IOException{
		return false;
	}
	
	public boolean writeFile() throws IOException{
		return false;
	}
	
	public String search(String search_term) {
		return "search() is unimlemented\n";
	}
	
	public String getFileLoc() {
		return "getFileLoc() is unimlemented\n";
	}
	
	public boolean setFileLoc(String file_loc) {
		return false;
	}
}
