import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/**
 * Lab #6
 * CS 2334, Section SECTION NUMBER GOES HERE
 * DATE GOES HERE
 * <p>
 * Each object of this class represents a GUI input window (MVC view).
 * </p>
 * @version 1.0
 *
 */
public class AcademicPapersInputWindow extends JFrame {
	private static final long serialVersionUID = 1L;

	/** Button to click to add new academic papers to the academic paper
	 *  list based on filled text fields. */
	JButton jbtAddAcademicPaper = new JButton("Add Academic Paper");

	/** Button to clear text fields of academic paper info. */
	JButton jbtClearInput = new JButton("Clear Input Fields");

	/** Button to clear academic paper list. */
	JButton jbtClearAcademicPapers = new JButton("Clear Academic Paper List");

	/** TextField to input the title of a new academic paper. */
	JTextField jtfTitle = new JTextField(20);
	JLabel lblTitle = new JLabel("Title of Academic Paper", JLabel.RIGHT);
	
	/** TextField to input the names of the authors for new academic paper. */
	JTextArea jtfAuthorNames = new JTextArea(4,20);
	JLabel lblAuthorNames = new JLabel("Author Names", JLabel.RIGHT);
	
	/** TextField to input the name of the serial for new academic paper. */
	JTextField jtfSerialTitle = new JTextField(20);
	JLabel lblSerialTitle = new JLabel("Serial Title", JLabel.RIGHT);

	/** TextField to input the publication date for new academic paper. */
	JTextField jtfPublicationDate = new JTextField(20);
	JLabel lblPublicationDate = new JLabel("Publication date (DD/MM/YYYY)", JLabel.RIGHT);

	/** JComboBox to input the type of papers. */
	JComboBox<String> jcbPaperType = new JComboBox<String>(new String[] {"Journal Article", "Conference Paper"});
	JLabel lblPaperType = new JLabel("Type of Academic Paper", JLabel.RIGHT);
	
	JMenuBar jmBar = new JMenuBar();
	
	JMenu jmFile = new JMenu("File");
	
	JMenuItem jmiLoad = new JMenuItem("Load");
	
	JMenuItem jmiSave = new JMenuItem("Save");
	
	JMenuItem jmiExit = new JMenuItem("Exit");
	
	JToolBar jtBar = new JToolBar();
	
	JButton jbPrint = new JButton("Print");
	
	AcademicPapersInputWindow() {
		setTitle("Add New Academic Papers to Your List of Academic Papers");
		
		// TODO: Add file menu and its contents and toolbar
		
		
		// Create panels for author names, paper titles, publisher names, 
		// publication dates, and type of publication buttons
		
		JPanel jplTitle = new JPanel(new GridLayout(1, 0, 5, 5));
		jplTitle.add(lblTitle);
		jplTitle.add(jtfTitle);
		
		JPanel jplAuthorNames = new JPanel(new GridLayout(1, 0, 5, 5));
		jplAuthorNames.add(lblAuthorNames);
		jplAuthorNames.add(jtfAuthorNames);
		
		JPanel jplPublisherName = new JPanel(new GridLayout(1, 0, 5, 5));
		jplPublisherName.add(lblSerialTitle);
		jplPublisherName.add(jtfSerialTitle);

		JPanel jplPublicationDate = new JPanel(new GridLayout(1, 0, 5, 5));
		jplPublicationDate.add(lblPublicationDate);
		jplPublicationDate.add(jtfPublicationDate);

		JPanel jplPaperType = new JPanel(new GridLayout(1, 0, 5, 5));
		jplPaperType.add(lblPaperType);
		jplPaperType.add(jcbPaperType);

		JPanel jplButton = new JPanel(new GridLayout(1, 0, 5, 5));
		jplButton.add(jbtAddAcademicPaper);
		jplButton.add(jbtClearInput);
		jplButton.add(jbtClearAcademicPapers);
		
		jmFile.add(jmiLoad);
		jmFile.add(jmiSave);
		jmFile.add(jmiExit);
		
		jmBar.add(jmFile);
		
		jtBar.add(jbPrint);

		// Set up the content pane and add all the panels to it.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(0, 1, 5, 5));
		setJMenuBar(jmBar);
		add(jtBar);
		add(jplTitle);
		add(jplAuthorNames);
		add(jplPublisherName);
		add(jplPublicationDate);
		add(jplPaperType);
		add(jplButton);
		pack();
		setVisible(true);
	}
	
	public JButton getAddAcademicPaperButton() {
		return jbtAddAcademicPaper;
	}
	
	public JButton getClearInputButton() {
		return jbtClearInput;
	}
	
	public JButton getClearAcademicPapersButton() {
		return jbtClearAcademicPapers;
	}
	
	public JMenuItem getLoadButton() {
		return jmiLoad;
	}
	
	public JMenuItem getSaveButton() {
		return jmiSave;
	}
	
	public JMenuItem getExitButton() {
		return jmiExit;
	}
	
	public JButton getPrintButton() {
		return jbPrint;
	}
	
	public void clearInputFields() {
		jtfTitle.setText("");
		jtfAuthorNames.setText("");
		jtfSerialTitle.setText("");
		jtfPublicationDate.setText("");
		jcbPaperType.setSelectedIndex(0);
	}
}