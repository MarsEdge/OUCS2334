import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Lab #7 CS 2334, Section 0?? DATE GOES HERE
 * <P>
 * This class represents the Model for the MVC lab.
 * It contains the data that will be shared among various views
 * and the method to manipulate the data.
 * </P>
 * 
 * @version 1.0
 */

public class Model {
	// The list of action listeners
	ArrayList<ActionListener> actionListenerList;
	
	// The list of academic papers selected for more detailed display
	List<AcademicPaper> academicPapersList;
	
	// The list of academic papers (created from the file)
	List<AcademicPaper> selectedAcademicPapersList;

	/** The default (no-arg) constructor */
	Model() {
		academicPapersList = null;
		selectedAcademicPapersList = new ArrayList<AcademicPaper>();
	}

	/**
	 * The constructor for the class.
	 * <P>
	 * 
	 * @param      academicPapersList 	a list of academic papers
	 */
	Model(List<AcademicPaper> academicPapersList) {
		//set the list of places for the state
		this.academicPapersList = academicPapersList;

		//create the sublist of selected academic papers to display in more detail
		this.selectedAcademicPapersList = new ArrayList<AcademicPaper>();
	}

	/**
	 *  @return            Returns the list of academic papers.
	 */
	public List<AcademicPaper> getAcademicPapersList() {
		return academicPapersList;
	}

	/**
	 *  @return            Returns the list of selected academic papers.
	 */
	public List<AcademicPaper> getSelectedAcademicPaperList() {
		return selectedAcademicPapersList;
	}

	/**
	 * Method to set the subList.
	 * <P>
	 * 
	 * @param      index 	index of the academic paper selected in the list
	 */
	public void addToSelectedList(int index) {
		selectedAcademicPapersList.add(academicPapersList.get(index));

		// Notify the listener of the change in subList
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED,
				"Select Academic Paper"));
	}

	/** Register an action event listener */
	public synchronized void addActionListener(ActionListener l) {
		if (actionListenerList == null) {
			actionListenerList = new ArrayList<ActionListener>();
		}
		actionListenerList.add(l);
	}

	/** Remove an action event listener */
	public synchronized void removeActionListener(ActionListener l) {
		if (actionListenerList != null && actionListenerList.contains(l)) {
			actionListenerList.remove(l);
		}
	}

	/** Fire Event */
	private void processEvent(ActionEvent e) {
		ArrayList<ActionListener> list;
		synchronized (this) {
			if (actionListenerList == null)
				return;
			// Do not worry about the cast warning here.
			list = (ArrayList<ActionListener>) actionListenerList.clone();
		}
		for (int i = 0; i < list.size(); i++) {
			ActionListener listener = list.get(i);
			listener.actionPerformed(e);
		}
	}

	/**
	 * This method reads in a specified comma delimited file. 
	 * The file is read one line at a time. The read line is then
	 * split and an Academic Paper object is created using the parsed
	 * line.
	 * The Academic Paper object is then added to a List, which is returned
	 * when the entire file has been processed.
	 * <P>
	 * 
	 * @param      filename     String 		name of the file to be read
	 * @return            		Returns a List of Academic Paper objects  
	 */

	public void readFile(String filename) throws FileNotFoundException,
			IOException {
		// Create a file object
		File file = new File(filename);

		// Check if a specified file exists, if not then exit the program
		if (!file.exists()) {
			System.out.println("ERROR:: File not found.");
			System.exit(0);
		}

		// Create file reader and buffered reader to read the file
		FileReader fileReader = new FileReader(filename);
		BufferedReader br = new BufferedReader(fileReader);

		List<AcademicPaper> academicPapersList = new ArrayList<AcademicPaper>();

		//read a line from the file, if the first is empty exit the program 
		String line = br.readLine();
		if (line.length() <= 0) {
			System.out.println("ERROR:: There is no data in file.");
			System.exit(0);
		}

		//read file one line at a time, until end of file
		do {
			AcademicPaper academicPaper = new AcademicPaper(line.split(","));
			academicPapersList.add(academicPaper);
			line = br.readLine();
		} while (line != null);

		// Notify the listener of the change in list of places for the state
		this.academicPapersList = academicPapersList;
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED,
				"Academic Papers List"));
		
		br.close();
	}
}