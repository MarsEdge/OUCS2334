import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Lab #7 CS 2334, Section 0?? DATE GOES HERE
 * <P>
 * This is the driver class for the MVC lab. It creates and initializes the
 * variables for the model, views and controller.
 * </P>
 * 
 * @version 1.0
 */
public class Lab7Driver {
	private Model model;
	private AcademicPapersView academicPapersView = new AcademicPapersView();
	private SelectedPapersView selectedPaperView = new SelectedPapersView();
	private Controller controller = new Controller();

	/**
	 * This method initializes the variables for the model, views, and
	 * controller. It sets the model for the views and controller and also sets
	 * the view in the controller.
	 * <P>
	 * 
	 * @param filename
	 *            String Name of the filename to be read.
	 */
	public Lab7Driver(String filename) throws FileNotFoundException,
			IOException {
		model = new Model();
		model.readFile(filename);
		academicPapersView.setModel(model);
		selectedPaperView.setModel(model);
		controller.setModel(model);
		controller.setView(academicPapersView);
	}

	/**
	 * This is the main method of the program. It calls the constructor.
	 * <P>
	 * 
	 * @param args
	 *            Command line arguments. This program requires a filename as
	 *            the first argument.  No other arguments are used.
	 */
	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		if (args.length > 0) {
			new Lab7Driver(args[0]);
		} else {
			System.out.println("Usage: Please specify the file name as the argument.");
		}
	}
}