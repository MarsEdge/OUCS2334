import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;



public class ScholarPubController {
	
	private ScholarshipModel model;
	private SelectionView view;
	
	/**
	 * Creates new controller with model and view
	 */
	public ScholarPubController(ScholarshipModel model, SelectionView view){
		this.model = model;
		this.view = view;
		
		this.view.getJbAddScholar().addActionListener(new AddScholarListener());
		this.view.getJbDeleteSelectedScholar().addActionListener(new DeleteScholarListener());
		this.view.getJbDeleteAllScholar().addActionListener(new DeleteAllScholarsListener());
		
		this.view.getJbAddSerial().addActionListener(new AddSerialListener());
		this.view.getJbDeleteSelectedSerial().addActionListener(new DeleteSerialListener());
		this.view.getJbDeleteAllSerial().addActionListener(new DeleteAllSerialsListener());
		this.view.getJbAddPaper().addActionListener(new AddPaperListener());
		this.view.getJbDeleteSelectedPaper().addActionListener(new DeletePaperListener());
		this.view.getJbDeleteAllPaper().addActionListener(new DeleteAllPapersListener());
				
	}
	
	/**
	 * AddScholarListener provides a method to create a new scholar.
	 */
	private class AddScholarListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Frame frame = new Frame();
			Object[] obj = null;
			String name = (String)JOptionPane.showInputDialog(frame, "Add a Scholar:\n"+ "Enter the Scholar's name","Add Scholar", JOptionPane.QUESTION_MESSAGE,null, obj,"Dean Hougen");
			String aff = (String)JOptionPane.showInputDialog(frame, "Add a Scholar:\n"+ "Enter " + name + "'s affiliation","Add Scholar", JOptionPane.QUESTION_MESSAGE,null, obj,"University of Oklahoma");
			String research = (String)JOptionPane.showInputDialog(frame, "Add a Scholar:\n"+ "Enter " + name + "'s research areas","Add Scholar", JOptionPane.QUESTION_MESSAGE,null, obj,"Artificial Intelligence");
			
			model.addScholar(new Scholar(name, aff, research));
		}
	}
	
	/**
	 * DeleteScholarListener provides a method to delete a scholar.
	 */
	private class DeleteScholarListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
	
	/**
	 * DeleteAllScholarsListener provides a method to delete all scholars.
	 */
	private class DeleteAllScholarsListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
	
	/**
	 * AddSerialListener provides a method to create a new serial.
	 */
	private class AddSerialListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Frame frame = new Frame();
			Object[] obj = {"Journal", "Conference"};
			String type = (String)JOptionPane.showInputDialog(frame, "Add a Serial:\n"+ "What kind of serial?","Add Serial", JOptionPane.QUESTION_MESSAGE,null, obj,"Journal");
			
			Object[] auth = new Object[model.getScholarList().size() + 1];
			int i = 0;
			for(Scholar sch : model.getScholarList()){
				auth[i]=sch;
				i++;
			}
			
			String editor = (String)JOptionPane.showInputDialog(frame, "Add a Serial:\n"+ "Who is the editor?","Add Serial", JOptionPane.QUESTION_MESSAGE,null, auth, null);
			String reviewer = (String)JOptionPane.showInputDialog(frame, "Add a Serial:\n"+ "Who is the reviewer","Add Serial", JOptionPane.QUESTION_MESSAGE,null, auth,null);
			
			// editor / program chair or reviewer / program committee
			if(type=="Journal"){
				model.addSerial(new Journal(editor, reviewer));
			}
			else model.addSerial(new Conference(editor, reviewer));
			
		}
	}
	
	/**
	 * DeleteSerialListener provides a method to delete a serial.
	 */
	private class DeleteSerialListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
	
	/**
	 * DeleteAllSerialsListener provides a method to delete all serials.
	 */
	private class DeleteAllSerialsListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
	
	/**
	 * AddPaperListener provides a method to create a new paper.
	 */
	private class AddPaperListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	/**
	 * DeletePaperListener provides a method to delete a paper.
	 */
	private class DeletePaperListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
	
	/**
	 * DeleteAllPapersListener provides a method to delete all papers.
	 */
	private class DeleteAllPapersListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
	
	
	
}
