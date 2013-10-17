import java.awt.event.*;
import java.util.ArrayList;

/**
 * Lab #5 CS 2334, Section SECTION NUMBER GOES HERE DATE GOES HERE
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
	 * AddAcademicPaperListener provides a method to create a new academic paper. 
	 * The academic paper should then be added to the academic paper list of the
	 * model. The values for the new academic paper come from the fields of the 
	 * inputView. If the model is null when the method is called, it returns 
	 * without taking any action.
	 */
	private class AddAcademicPaperListener implements ActionListener {
		// add method here
		
		public void actionPerformed(ActionEvent arg0) {
			
			if(model != null)
			{
				model.addToAcademicPapers(new AcademicPaper(inputView.jtfTitle.getText(),
						parseAuthorList(inputView.jtfAuthorNames.getText()), 
						inputView.jtfSerialTitle.getText(), inputView.jtfPublicationDate.getText()));
			}
		}


	}

	/**
	 * ClearAcademicPapersListener provides a method to clear the academic paper 
	 * list of the model. If the model is null when the method is called, it 
	 * returns without taking any action.
	 */
	private class ClearAcademicPapersListener implements ActionListener {
		
		public void actionPerformed(ActionEvent arg0) {
			if(model != null)
			{
				model.clearAcademicPapers();
			}
		}
		
	}

	/**
	 * ClearInputFieldsListener provides a method to clear the input fields of
	 * the inputView.
	 */
	private class ClearInputFieldsListener implements ActionListener {
		
		public void actionPerformed(ActionEvent arg0) {
			if(model != null)
			{
				inputView.clearInputFields();
			}
		}
		
	
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
	 * @param theView on which the listeners should be set
	 */
	public void setInputWindow(AcademicPapersInputWindow theView) {
		inputView = theView;

		// Register listeners
		inputView.getAddAcademicPaperButton().addActionListener(new AddAcademicPaperListener());

		/**
		 * The first action listener has been added above. You need to add the
		 * others below. There needs to be at least one action listener for each
		 * component on which actions can occur.
		 */
		
		inputView.getClearInputButton().addActionListener(new ClearInputFieldsListener());
		
		inputView.getClearAcademicPapersButton().addActionListener(new ClearAcademicPapersListener());

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
	public ArrayList<String> parseAuthorList(String authorsStr) throws ArrayIndexOutOfBoundsException {
		String[] parts = authorsStr.split("\\; ");
		
		ArrayList<String> out = new ArrayList<String>();
		
		for(String author : parts)
		{
			if(author != null)
			{
				if(author.contains(",") == true)
				{
					out.add(author.split("\\, ")[1] + " " + author.split("\\, ")[0]);
				}
				else if(author != null)
				{
					out.add(author);
				}
			}
		}
		return out;
	}
}