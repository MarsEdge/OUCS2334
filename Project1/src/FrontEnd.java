import java.io.IOException;

import javax.swing.JOptionPane;

public class FrontEnd {

	/**
	 * @param args program arguments
	 * @throws IOException
	 */
	public static void main(String args[])  throws IOException{
		Parser Parser = new Parser(args);
		
		Parser.parseFile();
		
		String search_term="";
		
		String results = "";
		
		while(true) {
			//original from http://compsci.ca/v3/viewtopic.php?t=3486
			search_term = JOptionPane.showInputDialog ( "Enter Publisher to Search for" ); 
			
			if (search_term == null || search_term == "")
				break;
			
			results = Parser.search(search_term);
			
			JOptionPane.showMessageDialog ( null, results, "Results",
					JOptionPane.PLAIN_MESSAGE); 
		}
	}

}
