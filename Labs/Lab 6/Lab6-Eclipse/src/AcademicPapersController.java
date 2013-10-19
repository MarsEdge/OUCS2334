import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * Lab #6 CS 2334, Section SECTION NUMBER GOES HERE DATE GOES HERE
 * <p>
 * The MVC controller for the program.
 * </p>
 * 
 * @version 1.0
 * 
 */
public class AcademicPapersController {
	private AcademicPapersModel model;
	private AcademicPapersInputWindow inputView;

	/**
	 * Creates new AcademicPaperController
	 */
	public AcademicPapersController() {
		// intentionally empty
	}

	/**
	 * @param model to set as the model
	 */
	public void setModel(AcademicPapersModel model) {
		this.model = model;
	}

	/**
	 * @return model
	 */
	public AcademicPapersModel getModel() { // future use
		return model;
	}
	
	/**
	 * AddAcademicPaperListener provides a method to create a new academic paper. 
	 * The academic paper should then be added to the academic paper list of the
	 * model. The values for the new academic paper come from the fields of the 
	 * inputView. If the model is null when the method is called, it returns 
	 * without taking any action.
	 */
	private class AddAcademicPaperListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (model == null) return;  // No model associated.  Can't do anything.

			String title = inputView.jtfTitle.getText();
			String authorNames = inputView.jtfAuthorNames.getText();
			String serialTitle = inputView.jtfSerialTitle.getText();
			String paperType = (String)inputView.jcbPaperType.getSelectedItem();
			String publicationDate = inputView.jtfPublicationDate.getText();
			
			AcademicPaper paperToAdd = new AcademicPaper(title, parseAuthors(authorNames), serialTitle, publicationDate);
			
			if (model.contains(title)) {  // Academic paper already in collection so ask what to do
				
				Object[] options = {"Cancel",
	                    "Replace Academic Paper",
	                    "Add Author"};
				
				int response = JOptionPane.showOptionDialog(inputView,"An Acedemic Paper with the title \" " + title + "\" already exists in the collection:\n\n "
						+ authorNames + " \"" + title + ".\" " + serialTitle + ". " + publicationDate + ".\n\n" +  
						"Would you like to add this author(s) to this Academic Paper, or\n"
						+ "Would you like to replace the existent Academic Paper with this one, or\n"
						+ "Would you like to cancel?", "Academic Paper already in the Collection", 
						JOptionPane.YES_NO_CANCEL_OPTION,
					    JOptionPane.QUESTION_MESSAGE,
					    null,
					    options,
					    options[0]);  // assign returned value of JOptionPane to response
				
				if (response == 0) {
					// option 0 is cancel so do nothing
				}
				else if (response == 1) {
					
					model.replaceInAcademicPaperMap(paperToAdd);
				}
				else if (response == 2) {
					
					model.addToAcademicPapers(paperToAdd);
				}
				else {
					// Should handle error case here (we won't for this lab).
				}
			}
			else {  // Academic paper not in collection, so add it.
				model.addToAcademicPapers(paperToAdd);
			}
		}
	}

	/**
	 * ClearAcademicPapersListener provides a method to clear the academic paper 
	 * list of the model. If the model is null when the method is called, it 
	 * returns without taking any action.
	 */
	private class ClearAcademicPapersListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (model == null) return;  // No model associated.  Can't do anything.
			model.clearAcademicPapers();
		}
	}

	/**
	 * ClearInputFieldsListener provides a method to clear the input fields of
	 * the inputView.
	 */
	private class ClearInputFieldsListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			inputView.clearInputFields();
		}
	}
	
	private class SaveListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				model.writePapers("out", model);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	private class LoadListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				model.readPapers("out");
			} catch (ClassNotFoundException | IOException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	private class ExitListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(-1);
		}
	}
	
	private class PrintListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			model.printPapers();
		}
	}


	/**
	 * @param theView on which the listeners should be set
	 */
	public void setInputWindow(AcademicPapersInputWindow theView) {
		inputView = theView;

		// Register listeners
		inputView.getAddAcademicPaperButton().addActionListener(new AddAcademicPaperListener());
		inputView.getClearInputButton().addActionListener(new ClearInputFieldsListener());
		inputView.getClearAcademicPapersButton().addActionListener(new ClearAcademicPapersListener());
		
		inputView.getLoadButton().addActionListener(new LoadListener());
		
		inputView.getSaveButton().addActionListener(new SaveListener());
		
		inputView.getExitButton().addActionListener(new ExitListener());
		
		inputView.getPrintButton().addActionListener(new PrintListener());
		
		System.out.println("listeners registered in controller for input window");
	}

	/**
	 * @return the window (in case it needs to be sent messages from elsewhere)
	 */
	public AcademicPapersInputWindow getInputWindow() { // future use
		return inputView;
	}
	
	/**
	 * parses the authors line into an ArrayList
	 * @param authorsStr line with all authors
	 * @return ArrayList of authors
	 */
	public ArrayList<String> parseAuthors(String authorsStr) {
		String[] parts = authorsStr.split("\\; ");
		
		ArrayList<String> out = new ArrayList<String>();
		
		for(String author : parts)
		{
			if(author != null)
			{
				out.add(author);
			}
		}
		return out;
	}
}