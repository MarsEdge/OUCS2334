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
	

	public void addScholarship(Scholarship scholarship) {
		super.addScholarship(scholarship);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "add scholarship"));
	}
	
	public void addScholar(Scholar scholar) {
		super.addScholar(scholar);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "add scholar"));
	}
	
	public void deleteSelectedScholar(Scholar scholar) {
		super.deleteSelectedScholar(scholar);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "deletes selected scholar(s)"));
	}
	
	public void deleteAllScholars() {
		super.deleteAllScholars();
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "deletes all scholars"));
	}
	
	public void addSerial(Serial serial) {
		super.addSerial(serial);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "add serial"));
	}
	
	public void deleteSelectedSerial(Serial serial) {
		super.deleteSelectedSerial(serial);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "deletes selected serial(s)"));
	}
	
	public void deleteAllSerials() {
		super.deleteAllSerials();
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "deletes all serials"));
	}
	
	public void addPaper(Publication pub) {
		super.addPaper(pub);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "add paper"));
	}
	
	public void deleteSelectedPaper(Publication pub) {
		super.deleteSelectedPaper(pub);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "deletes selected paper(s)"));
	}
	
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
	
	public void saveScholarship (String filename, ScholarshipModel scholarship) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(filename);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(scholarship);
		objectOutputStream.close();
	}
	
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
