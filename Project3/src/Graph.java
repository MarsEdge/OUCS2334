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
	 * Default Graph shown at start of program
	 */
	public Graph(){
		setTypeOfGraph("");
		setXLabel("");
		setYLabel("");
		setTitle("");
	}
	
	/**
	 * Constructor for a Graph given the type of graph asked for by the user
	 * @param type        type of graph to create
	 */
	public Graph(String type){
		
		this.typeOfGraph = type;
		typeSetVariables(type);
		
		
	}
	
	/**
	 * Sets the variables used to create each graph given the type of graph
	 * @param type		type of graph
	 */
	public static void typeSetVariables(String type){
		//implement which x and y labels and title goes for each type
	}
	
	
	/**
	 * Displays the desired graph in a GUI.
	 * @param graph			Graph object which contains information for graph
	 */
	public static void displayGraph(Graph graph) {
		//gui creation here
	}

	
	
	//Accessors for class variables
	public String getTypeOfGraph() {
		return typeOfGraph;
	}

	public void setTypeOfGraph(String typeOfGraph) {
		this.typeOfGraph = typeOfGraph;
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
	
	public String getTitlel() {
		return yLabel;
	}

	public void setTitle(String title){
		this.title = title;
	}
	
	
}
