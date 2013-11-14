import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

/**
 * Lab #7 CS 2334, Section 0?? DATE GOES HERE
 * <P>
 * This class represents a view of all the academic papers (just the title of each paper) for the MVC lab.
 * </P>
 * 
 * @version 1.0
 */
public class AcademicPapersView extends JFrame implements ActionListener {
	/** Needs a serialVersionUID because the class is Serializable */
	private static final long serialVersionUID = 1L;

	// The model for this view.
	private Model model;

	// setup GUI for this view.
	private JButton jbtSelectAcademicPaper = new JButton(
			"Add paper to selected academic papers list");
	private DefaultListModel<String> listModel = new DefaultListModel<String>();
	private JList<String> jlAcademicPapersList = new JList<String>(listModel);
	private JScrollPane scrollPane = new JScrollPane(jlAcademicPapersList);

	/** The default constructor */
	AcademicPapersView() {
		setTitle("List of Academic Papers");
		jlAcademicPapersList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(scrollPane);
		add(jbtSelectAcademicPaper, BorderLayout.EAST);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	/**
	 * This method sets the model for this view and registers the view as a listener with the model.
	 * @param model  The model to be set.
	 */
	public void setModel(Model model) {
		this.model = model;
		populateJList();
		if (this.model != null) {
			// Register the view as listener for the model
			model.addActionListener(this);
		}
	}

	/**
	 * This method pulls the titles of the academic papers from the academic papers list and
	 * stores them in the JList of selected academic papers for detailed display.
	 */
	private void populateJList() {
		listModel.clear();
		if (model.getAcademicPapersList() != null)
			for (int i = 0; i < model.getAcademicPapersList().size(); i++) {
				listModel.addElement((model.getAcademicPapersList().get(i)
						.getTitle()));
			}
	}

	/**
	 * ActionListener for the method.
	 * <P>
	 * 
	 * @param actionEvent
	 *            an event
	 * 
	 */
	public void actionPerformed(ActionEvent actionEvent) {
		if (actionEvent.getActionCommand().equals("Academic Papers List")) {
			populateJList();
		}
	}

	/**
	 * @return JList which contains the whole list academic papers
	 */
	public JList<String> getJLAcademicPapersList() {
		return jlAcademicPapersList;
	}

	/**
	 * @return the JButton that can be pressed by the user
	 */
	public JButton getJBTSelectAcademicPaper() {
		return jbtSelectAcademicPaper;
	}
}