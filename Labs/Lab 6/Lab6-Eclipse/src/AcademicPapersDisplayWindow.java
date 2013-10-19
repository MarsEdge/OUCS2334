import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 * Lab #6
 * CS 2334, Section SECTION NUMBER GOES HERE
 * DATE GOES HERE
 * <p>
 * Each object of this class represents a GUI display window (MVC view).
 * </p>
 * @version 1.0
 *
 */
public class AcademicPapersDisplayWindow extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private JList<AcademicPaper> displayAcademicPaperList;
	private AcademicPapersModel model;
	
	public AcademicPapersDisplayWindow() {
		setTitle("Your List of Academic Papers");
	}

	public void actionPerformed(ActionEvent e) {
		Object[] academicPaperMapValues = model.getAcademicPaperMap().values().toArray();
		
		// Cast down the array of Objects to an array of Strings.
		AcademicPaper[] stringArrayAcademicPapers = 
				Arrays.copyOf( academicPaperMapValues, academicPaperMapValues.length, AcademicPaper[].class);
		
		displayAcademicPaperList.setListData( stringArrayAcademicPapers );
		pack();
	}
	
	public void setModel(AcademicPapersModel model) {
		this.model = model;
		
		if (model != null) {
			model.addActionListener(this);
			add(new JLabel("Authors.  \"Title.\"  Serial Title.  Publication Date."), BorderLayout.NORTH);
			
			Object[] academicPaperMapValues = model.getAcademicPaperMap().values().toArray();
			
			// To cast down the array of objects (which are really AcademicPapers) to an array of 
			// AcademicPapers
			AcademicPaper[] stringArray = Arrays.copyOf( academicPaperMapValues, 
					academicPaperMapValues.length, AcademicPaper[].class);
			
			displayAcademicPaperList = new JList<AcademicPaper>(stringArray);
			add(displayAcademicPaperList, BorderLayout.CENTER);
			pack();
			setVisible(true);
		}
	}

	public AcademicPapersModel getModel() {
		return model;
	}
}