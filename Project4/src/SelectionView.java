import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class SelectionView extends JFrame{

	//Creates all needed JMenuItems
	private JMenuItem jmiLoad = new JMenuItem("Load Scholarship");
	private JMenuItem jmiSave = new JMenuItem("Save Scholarship");
	private JMenuItem jmiImport = new JMenuItem("Import Scholarship");
	private JMenuItem jmiExport = new JMenuItem("Export Scholarship");
	private JMenuItem jmiExit = new JMenuItem("Exit");
	private JMenuItem jmiTP = new JMenuItem("Type of Publicataion");
	private JMenuItem jmiPY = new JMenuItem("Publications Per Year");
	private JMenuItem jmiCPY = new JMenuItem("Conference Papers Per Year");
	private JMenuItem jmiJAY = new JMenuItem("Journal Articles Per Year");
	private JMenuItem jmiCA = new JMenuItem("Coauthors Per Publication");
	
	//Creates all JMenus and JMenuBar
	private JMenuBar jmBar = new JMenuBar();
	private JMenu jmFile = new JMenu("File");
	private JMenu jmPlot = new JMenu("Plot");
	
	//Creates all JButtons
	private JButton jbAddScholar = new JButton("Add Scholar");
	private JButton jbDeleteSelectedScholar = new JButton("Delete Selected Scholar(s)");
	private JButton jbDeleteAllScholar = new JButton("Delete All Scholars");
	private JButton jbAddSerial = new JButton("Add Serial");
	private JButton jbDeleteSelectedSerial = new JButton("Delete Selected Serial(s)");
	private JButton jbDeleteAllSerial = new JButton("Delete All Serials");
	private JButton jbAddPaper = new JButton("Add Paper");
	private JButton jbDeleteSelectedPaper = new JButton("Delete Selected Paper(s)");
	private JButton jbDeleteAllPaper = new JButton("Delete All Papers");
	
	//Creates all JLists 
	private JList jlScholars = new JList();
	private JList jlSerials = new JList();
	private JList jlPapers = new JList();

	//Creates all JScrollPanes
	private JScrollPane jspScholars = new JScrollPane(jlScholars);
	private JScrollPane jspSerials = new JScrollPane(jlSerials);
	private JScrollPane jspPapers = new JScrollPane(jlPapers);
	
	//Creates all JLabels
	private JLabel jlblScholar = new JLabel("Scholar");
	private JLabel jlblSerial = new JLabel("Serial");
	private JLabel jlblPaper = new JLabel("Paper");

	
	// Creates a JFileChooser
	private JFileChooser jFileChooser = new JFileChooser(new File("."));

	/**
	 *  Will fill the frame with content and hold the addActionListeners
	 */
	public SelectionView(){
		
		//Action listeners will be in here
		
		setTitle("Add New Academic Papers to Your List of Academic Papers");
		
		// TODO: Add file menu and its contents and toolbar
		
		
		// Create panels for author names, paper titles, publisher names, 
		// publication dates, and type of publication buttons
		
		JPanel jplScholar = new JPanel(new GridLayout(5, 1));
		jplScholar.add(jlblScholar);
		jplScholar.add(jspScholars);
		jplScholar.add(jbAddScholar);
		jplScholar.add(jbDeleteSelectedScholar);
		jplScholar.add(jbDeleteAllScholar);
		
		JPanel jplSerial = new JPanel(new GridLayout(1, 0, 5, 5));
		jplSerial.add(jlblSerial);
		jplSerial.add(jspSerials);
		jplSerial.add(jbAddSerial);
		jplSerial.add(jbDeleteSelectedSerial);
		jplSerial.add(jbDeleteAllSerial);
		
		JPanel jplPaper = new JPanel(new GridLayout(1, 0, 5, 5));
		jplPaper.add(jlblPaper);
		jplPaper.add(jspPapers);
		jplPaper.add(jbAddPaper);
		jplPaper.add(jbDeleteSelectedPaper);
		jplPaper.add(jbDeleteAllPaper);
		
		jmFile.add(jmiLoad);
		jmFile.add(jmiSave);
		jmFile.add(jmiImport);
		jmFile.add(jmiExport);
		jmFile.add(jmiExit);
		
		jmPlot.add(jmiTP);
		jmPlot.add(jmiPY);
		jmPlot.add(jmiCPY);
		jmPlot.add(jmiJAY);
		jmPlot.add(jmiCA);
		
		jmBar.add(jmFile);
		jmBar.add(jmPlot);

		// Set up the content pane and add all the panels to it.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 3, 5, 5));
		setJMenuBar(jmBar);
		add(jplScholar);
		add(jplSerial);
		add(jplPaper);
		pack();
		setVisible(true);
		
	}
	
	/**
	 * Loads scholarship from binary file
	 * @param filename
	 */
	private void loadFile(File filename){
		
	}
	
	/**
	 * Saves the scholarship to binary file
	 */
	private void saveFile(){
		
	}
	
	/**
	 * Saves the scholarship using a specified binary file
	 * @param filename
	 */
	private void saveFile(File filename){
		
	}
	
	/**
	 * Imports scholarship from text file
	 * @param filename
	 */
	private void importFile(File filename){
		
	}
	
	/**
	 * Exports the scholarship to text file
	 */
	private void exportFile(){
		
	}
	
	/**
	 * Exports the scholarship using a specified text file
	 * @param filename
	 */
	private void exportFile(File filename){
		
	}
	
	/**
	 * Opens a graph given the type of graph and scholar
	 * @param typeOfGraph type of graph to open
	 * @param scholar scholar who's graph to open
	 */
	private void openGraph(String typeOfGraph, Scholar scholar){
		
	}
	
	/**
	 * Will create frame and set properties
	 * @param args
	 */
	public static void main(String[] args){
		
	}
	
	
	
}
