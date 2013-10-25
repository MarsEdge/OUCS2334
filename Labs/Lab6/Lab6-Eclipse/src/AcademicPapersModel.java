import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

/**
 * Lab #6
 * CS 2334, Section SECTION NUMBER GOES HERE
 * DATE GOES HERE
 * <p>
 * Each object of this class represents a GUI-enhanced model of a list of academic papers.
 * The model of an MVC GUI.
 * </p>
 * @version 1.0
 *
 */
public class AcademicPapersModel extends AcademicPapers {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3264695594189901532L;
	/**
	 * List to keep track of who is registered to listen for events from the academicPapersModel.
	 */
	private ArrayList<ActionListener> actionListenerList;
	

	/**
	 * No argument constructor creates an empty collection of academic papers using the no argument
	 * constructor of the superclass.
	 */
	public AcademicPapersModel( ) {
		super();
	}
	
	/**
	 * Method to add one academic paper to the collection of academic papers.
	 * Uses the overridden method of the same name from the superclass to actually add the paper.
	 * Then it generates a new ActionEvent and notifies listeners, if any, of this addition.
	 * 
	 * @param academicPaper 	The academic paper to be added to the collection.
	 */
	public void addToAcademicPapers(AcademicPaper academicPaper) {
		super.addToAcademicPapers(academicPaper);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "add academic paper"));
	}
	
	public void replaceInAcademicPaperMap(AcademicPaper academicPaper) {
		super.replaceInAcademicPaperMap(academicPaper);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "replace academic paper"));
	}
	
	/**
	 * Method to clear the collection of academic papers.
	 * Uses the overridden method of the same name from the superclass to actually clear the collection.
	 * Then it generates a new ActionEvent and notifies listeners, if any, of this change.
	 */
	public void clearAcademicPapers() {
		super.clearAcademicPapers();
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "clear academic paper list"));
	}
	
	/**
	 * Register an action event listener.
	 */
	public synchronized void addActionListener(ActionListener l) {
		if (actionListenerList == null)
			actionListenerList = new ArrayList<ActionListener>();
		actionListenerList.add(l);
	}
	
	/**
	 * Remove an action event listener.
	 */
	public synchronized void removeActionListener(ActionListener l) {
		if (actionListenerList != null && actionListenerList.contains(l))
			actionListenerList.remove(l);
	}
	
	public void writePapers (String filename, AcademicPapersModel paper) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(filename);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(paper);
		objectOutputStream.close();
	}
	
	public void readPapers(String filename) throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(filename);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		AcademicPapersModel paper = (AcademicPapersModel) objectInputStream.readObject();
		objectInputStream.close();
		
		this.setAcademicPaperMap(paper.getAcademicPaperMap());
		
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "read academic paper list"));
	}
	
	/**
	 * Go through the list of ActionListeners and inform each of the ActionEvent e.
	 * Note that we first make a copy of the list and then go through the copy of the list.
	 * We make the copy in a synchronized block to ensure that the list isn't modified during
	 * the copy operation.
	 */
	private void processEvent(ActionEvent e) {
		ArrayList<ActionListener> list;
		
		synchronized (this) {
			if (actionListenerList == null) return;
			list = (ArrayList<ActionListener>)actionListenerList.clone();
		}
		
		for (int i = 0; i < list.size(); i++) {
			ActionListener listener = list.get(i);
			listener.actionPerformed(e);
		}
	}
}