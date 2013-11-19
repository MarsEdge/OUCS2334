import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Model for scholarship
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
	private transient ArrayList<ActionListener> actionListenerList;

	/**
	 * No argument constructor creates an empty scholarship using the no argument
	 * constructor of the superclass.
	 */
	public ScholarshipModel() {
		super();
	}
	
	/**
	 * Method to add a scholar
	 * Uses the overridden method of the same name from the superclass
	 * Then generates a new ActionEvent and notifies listeners, if any, of this change.
	 */
	public void addScholar(Scholar scholar) {
		super.addScholar(scholar);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "scholar"));
	}
	
	/**
	 * Method to delete a scholar
	 * Uses the overridden method of the same name from the superclass
	 * Then generates a new ActionEvent and notifies listeners, if any, of this change.
	 */
	public void deleteSelectedScholar(Scholar scholar) {
		super.deleteSelectedScholar(scholar);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "scholar"));
	}
	
	/**
	 * Method to delete all scholars
	 * Uses the overridden method of the same name from the superclass
	 * Then generates a new ActionEvent and notifies listeners, if any, of this change.
	 */
	public void deleteAllScholars() {
		super.deleteAllScholars();
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "scholar"));
	}
	
	/**
	 * Method to add a serial
	 * Uses the overridden method of the same name from the superclass
	 * Then generates a new ActionEvent and notifies listeners, if any, of this change.
	 */
	public void addSerial(Serial serial) {
		super.addSerial(serial);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "serial"));
	}
	
	/**
	 * Method to delete a serial
	 * Uses the overridden method of the same name from the superclass
	 * Then generates a new ActionEvent and notifies listeners, if any, of this change.
	 */
	public void deleteSelectedSerial(Serial serial) {
		super.deleteSelectedSerial(serial);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "serial"));
	}
	
	/**
	 * Method to delete all serials
	 * Uses the overridden method of the same name from the superclass
	 * Then generates a new ActionEvent and notifies listeners, if any, of this change.
	 */
	public void deleteAllSerials() {
		super.deleteAllSerials();
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "serial"));
	}
	
	/**
	 * Method to add a paper
	 * Uses the overridden method of the same name from the superclass
	 * Then generates a new ActionEvent and notifies listeners, if any, of this change.
	 */
	public void addPaper(Publication pub) {
		super.addPaper(pub);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "paper"));
	}
	
	/**
	 * Method to delete a paper
	 * Uses the overridden method of the same name from the superclass
	 * Then generates a new ActionEvent and notifies listeners, if any, of this change.
	 */
	public void deleteSelectedPaper(Publication pub) {
		super.deleteSelectedPaper(pub);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "paper"));
	}
	
	/**
	 * Method to delete all papers
	 * Uses the overridden method of the same name from the superclass
	 * Then generates a new ActionEvent and notifies listeners, if any, of this change.
	 */
	public void deleteAllPapers() {
		super.deleteAllPapers();
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "paper"));
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
	 * @param scholarship	scholarship object being saved
	 * @throws IOException
	 */
	public void saveScholarship (ScholarshipModel scholarship) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("out.bin");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(scholarship);
		objectOutputStream.close();
	}
	
	public void notifyAllListeners() {
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "scholar"));
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "serial"));
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "paper"));
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
