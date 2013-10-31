import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Model for scholarship
 * @author John Frashier with parts taken from Lab 6
 *
 */
public class ScholarshipModel extends Scholarship{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1488399746422340039L;

	/**
	 * List to keep track of who is registered to listen for events from the ScholarshipModel.
	 */
	private ArrayList<ActionListener> actionListenerList;
	

	/**
	 * No argument constructor creates an empty scholarship using the no argument
	 * constructor of the superclass.
	 */
	public ScholarshipModel() {
		super();
	}
	
	/**
	 * Method to add a scholarship.
	 * Uses the overridden method of the same name from the superclass
	 * Then generates a new ActionEvent and notifies listeners, if any, of this change.
	 */
	public void addScholarship(Scholarship scholarship) {
		super.addScholarship(scholarship);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "add scholarship"));
	}
	
	/**
	 * Method to add a scholar
	 * Uses the overridden method of the same name from the superclass
	 * Then generates a new ActionEvent and notifies listeners, if any, of this change.
	 */
	public void addScholar(Scholar scholar) {
		super.addScholar(scholar);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "add scholar"));
	}
	
	/**
	 * Method to delete a scholar
	 * Uses the overridden method of the same name from the superclass
	 * Then generates a new ActionEvent and notifies listeners, if any, of this change.
	 */
	public void deleteSelectedScholar(Scholar scholar) {
		super.deleteSelectedScholar(scholar);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "deletes selected scholar(s)"));
	}
	
	/**
	 * Method to delete all scholars
	 * Uses the overridden method of the same name from the superclass
	 * Then generates a new ActionEvent and notifies listeners, if any, of this change.
	 */
	public void deleteAllScholars() {
		super.deleteAllScholars();
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "deletes all scholars"));
	}
	
	/**
	 * Method to add a serial
	 * Uses the overridden method of the same name from the superclass
	 * Then generates a new ActionEvent and notifies listeners, if any, of this change.
	 */
	public void addSerial(Serial serial) {
		super.addSerial(serial);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "add serial"));
	}
	
	/**
	 * Method to delete a serial
	 * Uses the overridden method of the same name from the superclass
	 * Then generates a new ActionEvent and notifies listeners, if any, of this change.
	 */
	public void deleteSelectedSerial(Serial serial) {
		super.deleteSelectedSerial(serial);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "deletes selected serial(s)"));
	}
	
	/**
	 * Method to delete all serials
	 * Uses the overridden method of the same name from the superclass
	 * Then generates a new ActionEvent and notifies listeners, if any, of this change.
	 */
	public void deleteAllSerials() {
		super.deleteAllSerials();
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "deletes all serials"));
	}
	
	/**
	 * Method to add a paper
	 * Uses the overridden method of the same name from the superclass
	 * Then generates a new ActionEvent and notifies listeners, if any, of this change.
	 */
	public void addPaper(Publication pub) {
		super.addPaper(pub);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "add paper"));
	}
	
	/**
	 * Method to delete a paper
	 * Uses the overridden method of the same name from the superclass
	 * Then generates a new ActionEvent and notifies listeners, if any, of this change.
	 */
	public void deleteSelectedPaper(Publication pub) {
		super.deleteSelectedPaper(pub);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "deletes selected paper(s)"));
	}
	
	/**
	 * Method to delete all papers
	 * Uses the overridden method of the same name from the superclass
	 * Then generates a new ActionEvent and notifies listeners, if any, of this change.
	 */
	public void deleteAllPapers() {
		super.deleteAllPapers();
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "deletes all papers"));
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
	
	/**
	 * Saves a scholarship
	 * @param filename	file being saved to
	 * @param scholarship	scholarhip object being saved
	 * @throws IOException
	 */
	public void saveScholarship (String filename, ScholarshipModel scholarship) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(filename);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(scholarship);
		objectOutputStream.close();
	}
	
	/**
	 * Loads a scholarship
	 * @param filename		file being loaded
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public void loadScholarship(String filename) throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(filename);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		ScholarshipModel scholarship = (ScholarshipModel) objectInputStream.readObject();
		objectInputStream.close();
		//this.setAcademicPaperMap(scholarship.getScholarList());
		//fix this
		
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