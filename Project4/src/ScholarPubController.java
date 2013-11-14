import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;
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
		this.view.getJmiLoad().addActionListener(new LoadListener());
		this.view.getJmiSave().addActionListener(new SaveListener());
		this.view.getJmiExit().addActionListener(new ExitListener());
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
			view.updateList(model);
		}
	}
	
	/**
	 * DeleteScholarListener provides a method to delete a scholar.
	 */
	private class DeleteScholarListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//TODO stub
			
			
			
			view.updateList(model);
		}
	}
	
	/**
	 * DeleteAllScholarsListener provides a method to delete all scholars.
	 */
	private class DeleteAllScholarsListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			model.deleteAllScholars();
			view.updateList(model);
		}
	}
	
	/**
	 * AddSerialListener provides a method to create a new serial.
	 */
	private class AddSerialListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Frame frame = new Frame();
			String[] obj = {"Journal", "Conference"};
			String type = (String)JOptionPane.showInputDialog(frame, "Add a Serial:\n"+ "What kind of serial?","Add Serial", JOptionPane.QUESTION_MESSAGE,null, obj,"Journal");
			
			Scholar[] auth = new Scholar[model.getScholarList().size() + 1];
			int i = 0;
			for(Scholar sch : model.getScholarList()){
				auth[i]=sch;
				i++;
			}
			
			if(type.equals("Conference"))
			{
			
				String chairs = JOptionPane.showInputDialog(frame, "Add a Serial:\n"+ "Who is the editor?","Add Serial", JOptionPane.QUESTION_MESSAGE,null, auth, null).toString();
				String committee = JOptionPane.showInputDialog(frame, "Add a Serial:\n"+ "Who is the reviewer","Add Serial", JOptionPane.QUESTION_MESSAGE,null, null,null).toString();
				
				model.addSerial(new Conference(chairs, committee));
				
			// editor / program chair or reviewer / program committee
			}
			else{
				String editor = JOptionPane.showInputDialog(frame, "Add a Serial:\n"+ "Who is the editor?","Add Serial", JOptionPane.QUESTION_MESSAGE,null, auth, null).toString();
				String reviewer = JOptionPane.showInputDialog(frame, "Add a Serial:\n"+ "Who is the reviewer","Add Serial", JOptionPane.QUESTION_MESSAGE,null, auth,null).toString();
				
				model.addSerial(new Journal(editor, reviewer));
				
			}
			//else 
			
			view.updateList(model);
		}
	}
	
	/**
	 * DeleteSerialListener provides a method to delete a serial.
	 */
	private class DeleteSerialListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//TODO
			
			
			view.updateList(model);
		}
	}
	
	/**
	 * DeleteAllSerialsListener provides a method to delete all serials.
	 */
	private class DeleteAllSerialsListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			model.deleteAllSerials();
			view.updateList(model);
		}
	}
	
	/**
	 * AddPaperListener provides a method to create a new paper.
	 */
	private class AddPaperListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Frame frame = new Frame();
			String[] obj = {"Journal", "Conference"};
			
			Scholar[] auth = new Scholar[model.getScholarList().size() + 1];
			int i = 0;
			for(Scholar sch : model.getScholarList()){
				auth[i]=sch;
				i++;
			}
			
			Serial[] serial = new Serial[model.getSerialMap().size() + 1];
			i = 0;
			for(Serial sch : model.getSerialMap()){
				serial[i]=sch;
				i++;
			}
			
			String author = JOptionPane.showInputDialog(frame, "Add a Paper:\n"+ "Who is the author?","Add Paper", JOptionPane.QUESTION_MESSAGE,null, auth, null).toString();
			
			ArrayList<String> authorsList = new ArrayList<String>();
			
			authorsList.add(author);
			
			String title = JOptionPane.showInputDialog(frame, "Add a Paper:\n"+ "What is the Title?","Add Paper", JOptionPane.QUESTION_MESSAGE,null, null,null).toString();
			
			String serialTitle = JOptionPane.showInputDialog(frame, "Add a Serial:\n"+ "What is the Serial Title?","Add Serial", JOptionPane.QUESTION_MESSAGE,null, serial, null).toString();
			
			model.addPaper(new Publication(authorsList, title, serialTitle, "", "", "", ""));
			view.updateList(model);
		}
	}
	
	/**
	 * DeletePaperListener provides a method to delete a paper.
	 */
	private class DeletePaperListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//TODO
			
			view.updateList(model);
		}
	}
	
	/**
	 * DeleteAllPapersListener provides a method to delete all papers.
	 */
	private class DeleteAllPapersListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			model.deleteAllPapers();
			view.updateList(model);
		}
	}
	
	/**
	 * Loads scholarship from binary file
	 * @param filename
	 */
	private class LoadListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {			
			try {
				model.loadScholarship(view.loadFile());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			view.updateList(model);
		}
	}
	
	/**
	 * Saves the scholarship using a specified binary file
	 * @param filename
	 */
	private class SaveListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				model.saveScholarship(model);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			view.updateList(model);
		}
	}
	
	/**
	 * Exits the program
	 * @param filename
	 */
	private class ExitListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(-1);;
		}
	}
}
