import javax.swing.JFrame;


public class Graph extends JFrame{

	/**
	 * type of graph to create
	 */
	public String type;
	
	/**
	 * the x-axis label/variable name
	 */
	public String xLabel;
	
	/**
	 * the y-axis label/variable name
	 */
	public String yLabel;
	
	/**
	 * the title of the graph
	 */
	public String title;

	/**
	 * Default Graph shown at start of program
	 */
	public Graph(){
		this.type = "";
		this.xLabel = "";
		this.yLabel = "";
		this.title = "";
	}
	
	/**
	 * Constructor for a Graph given the type of graph asked for by the user
	 * @param type        type of graph to create
	 */
	public Graph(String type){
		
		this.type = type;
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
	
	
}
