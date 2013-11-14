import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;
/**
 * Lab #7 CS 2334, Section 0?? DATE GOES HERE
 * <P>
 * This class represents a view of the properties of academic papers for the MVC lab.
 * </P>
 * 
 * @version 1.0
 */

public class SelectedPapersView extends JFrame implements ActionListener {
	/** Needs a serialVersionUID because the class is Serializable */
	private static final long serialVersionUID = 1L;

	//The model for this view.
	private Model model;
	
	//The GUI elements for this view.
	private JList<AcademicPaper> jlSelectedAcademicPapers = new JList<AcademicPaper>();
	private JScrollPane jspSelectedAcademicPapers = new JScrollPane(jlSelectedAcademicPapers);
	
	/** The default constructor*/
	SelectedPapersView() {
		setTitle("Selected Academic Papers");
		jlSelectedAcademicPapers.setSelectionBackground(jlSelectedAcademicPapers.getBackground());
		add(jspSelectedAcademicPapers, BorderLayout.CENTER);
	}
	
	public void setModel(Model model) {
		/** Set a model */
		this.model = model;
		if (this.model != null){
			// Register the view as listener for the model
			model.addActionListener(this);
		}
	}
	
	/**
	 * ActionListener for the method.
	 * <P>
	 * @param      actionEvent     an event				
	 */
	public void actionPerformed(ActionEvent actionEvent) {
		if (actionEvent.getActionCommand().equals("Select Academic Paper")) {
			
			Object[] academicPaperObjectArray = model.getSelectedAcademicPaperList().toArray();
			
			// To cast down the array of objects (which are really AcademicPapers)
			// to an array of AcademicPapers
			AcademicPaper[] academicPaperArray = Arrays.copyOf( academicPaperObjectArray, 
					academicPaperObjectArray.length, AcademicPaper[].class);
			
			
			jlSelectedAcademicPapers.setListData(academicPaperArray);
			pack();
			setVisible(true);
		}
	}
}