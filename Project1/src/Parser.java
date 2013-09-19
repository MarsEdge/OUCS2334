import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Parser {
	/**
	 * database file reader
	 */
	private FileReader DBReader;
	
	/**
	 * database buffered file reader
	 */
	private BufferedReader DBReaderBuffered;
	
	/**
	 * program arguments
	 */
	private String args[];
	
	/**
	 * database file location
	 */
	private String file_location;
	
	/**
	 * magazines in CSV file
	 */
	private ArrayList<Magazine> magazines;
	
	/**
	 * standard constructor for Parser
	 * 
	 * @param program_args the arguments given to the program
	 */
	Parser(String program_args[]){
		this.magazines= new ArrayList<Magazine>();
		
		if( isValidSearchName(program_args) ) {
			args=program_args;
			file_location=program_args[0];
		}
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
	
	/**
	 * reads txt file and iterates through each line, 
	 * calling makeMagazine as it goes
	 *
	 * @return true on success, false on failure
	 * @throws IOException
	 */
	public boolean parseFile() throws IOException{
		if( isValidSearchName(args) ) {
			DBReader = new FileReader(file_location);
			
			DBReaderBuffered = new BufferedReader(DBReader);
			
			String next_line="";
			
			while(DBReaderBuffered.ready())
			{
				next_line=DBReaderBuffered.readLine();
				if(next_line.length() > 0)
					magazines.add(makeMagazine(next_line));
			}
			
			DBReaderBuffered.close();
			
			return true;
		}
		else
			return false;
	}
	
	/**
	 * creates magazine object based on line from csv
	 *
	 * @param  line the line of the csv file to parse
	 * @return created Magazine object
	 */
	public Magazine makeMagazine(String line) {
		
		String[] parts = line.split("\\, ");
		
		String name = (parts.length > 0 && parts[0] != null) ? parts[0]: "";
		
		String publisher = (parts.length > 1 && parts[1] != null) ? parts[1]: "";
		
		String issues_annual = (parts.length > 2 && parts[2] != null) ? parts[2]: "";
		
		String year_init = (parts.length > 3 && parts[3] != null) ? parts[3]: "";
		
		String year_final = (parts.length > 4 && parts[4] != null) ? parts[4]: "";
		
		Magazine out = new Magazine(name, publisher, issues_annual, year_init, year_final );
		
		return out;
	}
	
	/**
	 * searches the magazine list by publisher
	 * 
	 * @param search_term publisher to search for
	 * @return summary of applicable magazines / "No Results Found"
	 */
	public String search(String search_term) {
		String results = "";
//for each from http://stackoverflow.com/questions/85190/how-does-the-java-for-each-loop-work with many modifications
		for(Magazine item : magazines) {
//substring checking from 
//http://stackoverflow.com/questions/2275004/in-java-how-to-check-if-a-string-contains-a-substring-ignoring-the-case
			if(item.getPublisher().toLowerCase().contains(search_term.toLowerCase())) {
				results+=item.toString() + "\n";
			}
		}
		if(results == "")
			return "No Results Found";
		
		return results;
	}
}