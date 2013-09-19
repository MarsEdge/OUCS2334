import java.io.IOException;

public class Parser {
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
		
	}
	
public boolean writeFile() throws IOException{
		
	}
	
	public String search(String search_term) {
		
	}
}
