import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.JFrame;


public class Graph extends JFrame{

	/**
	 * serial ID
	 */
	private static final long serialVersionUID = 748846064587327061L;

	/**
	 * type of graph to create
	 */
	private String typeOfGraph;
	
	/**
	 * the x-axis label/variable name
	 */
	private String xLabel;
	
	/**
	 * the y-axis label/variable name
	 */
	private String yLabel;
	
	/**
	 * the title of the graph
	 */
	private String title;
	
	/**
	 * the author whose data will be displayed
	 */
	private String authorName;
	
	/**
	 * the values of each bar
	 */
	private double[] valuesBar;
	
	/**
	 * the names of each bar
	 */
	private String[] namesBar;
	
	/**
	 * Author object used for calculating data for the author
	 */
	private Author AuthorObj = new Author(authorName);
	

	/**
	 * Default Graph shown at start of program
	 */
	public Graph(){
		setTypeOfGraph("");
		setXLabel("");
		setYLabel("");
		setTitle("");
		setAuthorName("");
	}
	
	/**
	 * Constructor for a Graph given the type of graph asked for by the user
	 * @param type        type of graph to create
	 */
	public Graph(String type){
		
		setTypeOfGraph(type);
		displayGraph();
	}
	
	
	/**
	 * Displays the desired graph in a GUI.
	 * @param graph			Graph object which contains information for graph
	 */
	public void displayGraph(){
		//GUI creation here
		JFrame f = new JFrame();
	    f.setSize(400, 300); 
	    f.getContentPane().add(new ChartPanel(this.valuesBar, this.namesBar, this.title));

	    WindowListener wndCloser = new WindowAdapter() {
	      public void windowClosing(WindowEvent e) {
	        System.exit(0);
	      }
	    };
	    f.addWindowListener(wndCloser);
	    f.setVisible(true);
	}


	//Accessors for class variables
	public String getTypeOfGraph() {
		return typeOfGraph;
	}

	//Sets the variables used to create each graph given the type of graph
	public void setTypeOfGraph(String typeOfGraph) {
		this.typeOfGraph = typeOfGraph;
		ArrayList<Publication> pub = AuthorObj.getPublishedPapers();
		
		if(typeOfGraph=="TP"){
			setXLabel("Number of Publications");
			setYLabel("Type of Publication");
			setTitle("Number of Each Type of Publication by " + authorName);
			double[] values = new double[2];
		    String[] names = new String[2];
		    values[0] = Stats.NumPubs(pub)-Stats.NumJournals(pub);
		    names[0] = "Conference Paper";
		    values[1] = Stats.NumJournals(pub);
		    names[1] = "Journal Article";
		    setValuesBar(values);
		    setNamesBar(names);
		}
		else if(typeOfGraph=="PY"){
			setXLabel("Number of Publications");
			setYLabel("Year");
			setTitle("Number of Publications Each Year by " + authorName);
			double[] values = new double[AuthorObj.getPublishedPapers().size()];
			int size = calculations[calculations.length]-calculations[0];
		    String[] names = new String[size];
			Arrays.sort(calculations);
			names[0] = String.valueOf(calculations[0]);
			for(int k=1; k<=calculations.length;k++){
				names[k] = names[k-1]+1;
			}
			for(String n: names){
				int nInt = Integer.valueOf(n);
				for(int i=0, j=0; i<=calculations.length; i++){
					if(calculations[i]==nInt){
						values[j]++;
					}
					else{
						j++;
					}
				}
			}
		    setValuesBar(values);
		    setNamesBar(names);
			
		}
		else if(typeOfGraph=="CPY"){
			setXLabel("Number of Conference Papers");
			setYLabel("Year");
			setTitle("Number of Conference Papers Each Year by " + authorName);
			double[] values = new double[AuthorObj.getPublishedPapers().size()];
			int size = calculations[calculations.length]-calculations[0];
		    String[] names = new String[size];
			Arrays.sort(calculations);
			names[0] = String.valueOf(calculations[0]);
			for(int k=1; k<=calculations.length;k++){
				names[k] = names[k-1]+1;
			}
			for(String n: names){
				int nInt = Integer.valueOf(n);
				for(int i=0, j=0; i<=calculations.length; i++){
					if(calculations[i]==nInt){
						values[j]++;
					}
					else{
						j++;
					}
				}
			}
		    setValuesBar(values);
		    setNamesBar(names);
		    
		}
		else if(typeOfGraph=="JAY"){
			setXLabel("Number of Journal Articles");
			setYLabel("Year");
			setTitle("Number of Journal Articles Each Year by " + authorName);
			double[] values = new double[AuthorObj.getPublishedPapers().size()];
			int size = calculations[calculations.length]-calculations[0];
		    String[] names = new String[size];
			Arrays.sort(calculations);
			names[0] = String.valueOf(calculations[0]);
			for(int k=1; k<=calculations.length;k++){
				names[k] = names[k-1]+1;
			}
			for(String n: names){
				int nInt = Integer.valueOf(n);
				for(int i=0, j=0; i<=calculations.length; i++){
					if(calculations[i]==nInt){
						values[j]++;
					}
					else{
						j++;
					}
				}
			}
		    setValuesBar(values);
		    setNamesBar(names);
		    
		}
		else if(typeOfGraph=="NC"){
			setXLabel("Number of Times");
			setYLabel("Number of Collaborators");
			setTitle("Number of Co Authors per Publication by " + authorName);
			
			//TODO fix so that it works for collaborators
			int[] coAuthors = Stats.NumCoAuthors(pub);
			Arrays.sort(coAuthors);
			int size = coAuthors[coAuthors.length];
			double[] values = new double[size];
		    String[] names = new String[size];
			names[0] = String.valueOf(calculations[0]);
			for(int k=1; k<=size;k++){
				names[k] = names[k-1]+1;
			}
			for(String n: names){
				int nInt = Integer.valueOf(n);
				for(int i=0, j=0; i<=calculations.length; i++){
					if(calculations[i]==nInt){
						values[j]++;
					}
					else{
						j++;
					}
				}
			}
		    setValuesBar(values);
		    setNamesBar(names);
			
		}
		
	}

	public String getXLabel() {
		return xLabel;
	}

	public void setXLabel(String xLabel) {
		this.xLabel = xLabel;
	}

	public String getYLabel() {
		return yLabel;
	}

	public void setYLabel(String yLabel) {
		this.yLabel = yLabel;
	}
	
	public String getTitle() {
		return yLabel;
	}

	public void setTitle(String title){
		this.title = title;
	}
	
	public String getAuthorName() {
		return yLabel;
	}

	public void setAuthorName(String authorName){
		this.authorName = authorName;
	}

	public double[] getValuesBar() {
		return valuesBar;
	}

	public void setValuesBar(double[] values) {
		this.valuesBar = values;
	}

	public String[] getNamesBar() {
		return namesBar;
	}

	public void setNamesBar(String[] namesBar) {
		this.namesBar = namesBar;
	}

	public Author getAuthorObj() {
		return AuthorObj;
	}

	public void setAuthorObj(Author authorObj) {
		AuthorObj = authorObj;
	}
	
}
