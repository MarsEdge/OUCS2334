/**
 * Lab #5
 * CS 2334, Section SECTION NUMBER GOES HERE
 * DATE GOES HERE
 * <p>
 * This program allows information on academic papers to be entered through a GUI window and
 * adds it to a list, and displays the academic paper list in a second GUI window.
 * </p>
 * @version 1.0
 *
 */

public class Driver {
	static AcademicPapersModel theAcademicPaperCollectionModel = new AcademicPapersModel();
	static AcademicPapersInputWindow theInputWindow = new AcademicPapersInputWindow();
	static AcademicPapersDisplayWindow theDisplayWindow = new AcademicPapersDisplayWindow();
	static AcademicPapersController theController = new AcademicPapersController();	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		theDisplayWindow.setModel(theAcademicPaperCollectionModel);
		theController.setModel(theAcademicPaperCollectionModel);
		theController.setInputWindow(theInputWindow);
	}
}
