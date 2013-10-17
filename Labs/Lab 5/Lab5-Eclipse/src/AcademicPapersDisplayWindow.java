import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

/**
 * Lab #5
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
	
	private JList displayAcademicPaperList;
	private AcademicPapersModel model;
	
	public AcademicPapersDisplayWindow() {
		setTitle("Your List of Academic Papers");
	}

	public void actionPerformed(ActionEvent e) {
		displayAcademicPaperList.setListData(model.getAcademicPaperMap().values().toArray());
		pack();
	}
	
	public void setModel(AcademicPapersModel model) {
		this.model = model;
		
		if (model != null) {
			model.addActionListener(this);
			add(new JLabel("Authors.  \"Title.\"  Serial Title.  Publication Date."), BorderLayout.NORTH);
			displayAcademicPaperList = new JList(model.getAcademicPaperMap().values().toArray());
			add(displayAcademicPaperList, BorderLayout.CENTER);
			pack();
			setVisible(true);
		}
	}

	public AcademicPapersModel getModel() {
		return model;
	}
}