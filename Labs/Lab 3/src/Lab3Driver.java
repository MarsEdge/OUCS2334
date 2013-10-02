import java.util.*;
/**
 * Lab #3
 * CS 2334, Section 0??
 * September 12, 2013
 * <P>
 * This class implements a program that tests the AcademicPaper class code.
 * </P>
 * @author Leave Blank
 * @version 1.0
 */
public class Lab3Driver {

	/**
	 * This is the main method for this driver program. Since this is a
	 * simple program, all of our code will be in the main method.
	 * Typically this would be a bad design, but we are just testing out
	 * some features of Java.
	 * <P>
	 * Algorithm<br>
	 * Test out the AcademicPaper class and an ArrayList of them to help your
	 * understanding of creating, sorting, and searching lists.
	 * </P>
	 * @param             args       Contains the command line arguments.
	 */

	public static void main(String[] args) {
		ArrayList papers = new ArrayList();

		/* 
		 * Instantiate eight objects of type AcademicPaper and add them
		 * to the list papers. 
		 * I have created and added the first academic paper for you. :)
		 */        
		
		/* This is a list of authors that we create for one paper. */
		ArrayList authorsStringMatching = new ArrayList();
		authorsStringMatching.add("Donald E. Knuth");
		authorsStringMatching.add("James H. Morris Jr.");
		authorsStringMatching.add("Vaughan R. Pratt");
		
		AcademicPaper stringMatchingPaper = new AcademicPaper("Fast Pattern Matching in Strings", 
				authorsStringMatching, new GregorianCalendar(1977, 03, 21));

		/* The list is referenced to by the variable papers.  You can add to
		 * the list by invoking the add method in ArrayList.
		 */
		papers.add(stringMatchingPaper);
		
		stringMatchingPaper = new AcademicPaper("Test1", 
				authorsStringMatching, new GregorianCalendar(1978, 03, 21));

		papers.add(stringMatchingPaper);
		
		stringMatchingPaper = new AcademicPaper("Test2", 
				authorsStringMatching, new GregorianCalendar(1979, 03, 21));

		papers.add(stringMatchingPaper);
		
		stringMatchingPaper = new AcademicPaper("Test3", 
				authorsStringMatching, new GregorianCalendar(1980, 03, 21));

		papers.add(stringMatchingPaper);
		
		stringMatchingPaper = new AcademicPaper("Test4", 
				authorsStringMatching, new GregorianCalendar(1981, 03, 21));

		papers.add(stringMatchingPaper);
		
		stringMatchingPaper = new AcademicPaper("Test5", 
				authorsStringMatching, new GregorianCalendar(1982, 03, 21));

		papers.add(stringMatchingPaper);
		
		stringMatchingPaper = new AcademicPaper("Test7", 
				authorsStringMatching, new GregorianCalendar(1983, 03, 21));

		papers.add(stringMatchingPaper);
		
		authorsStringMatching.remove(0);
		
		stringMatchingPaper = new AcademicPaper("Test7", 
				authorsStringMatching, new GregorianCalendar(1964, 03, 21));

		papers.add(stringMatchingPaper);
		
		stringMatchingPaper = new AcademicPaper("Test8", 
				authorsStringMatching, new GregorianCalendar(1964, 03, 21));

		papers.add(stringMatchingPaper);
		
		

		/*
		 * Print out the unsorted list of papers.
		 * This uses an iterator to "iterate" through the list.
		 */
		System.out.println( "\n\nUnsorted List:" );

		Iterator iterator = papers.iterator();

		while(iterator.hasNext())
		{
			// Note: This line of code will call toString of the AcademicPaper class.
			System.out.println(iterator.next());
		}
		


		/*
		 * Sort the list of papers using Collections.sort().
		 * Take a look at Collections.sort() in the API at
		 * http://download.oracle.com/javase/7/docs/api/java/util/Collections.html#sort%28java.util.List%29
		 * You need to call Collections.sort() and pass it the list of academic papers.
		 * SEE THE LAB HANDOUT FOR MORE INFORMATION.
		 */

		Collections.sort(papers);
		
		/*
		 * Print out the sorted list of papers.
		 */
		System.out.println("Sorted List:");
		/* HINT: Use an iterator the same way I used one above when
		 * the unsorted list of papers was printed.
		 */

		iterator = papers.iterator();

		while(iterator.hasNext())
		{
			// Note: This line of code will call toString of the AcademicPaper class.
			System.out.println(iterator.next());
		}
		

		/* 
		 * Search for a particular academic paper in the list.
		 */
		System.out.println( "\n\nSearching" );
		AcademicPaper key = new AcademicPaper( "An Axiomatic Basis for Computer Programming",
				"C.A.R. Hoare", new GregorianCalendar(1969, 2, 1));
		System.out.println( "Key is " + key );

		/*
		 * Call Collections.binarySearch() to find the index of key.  
		 * Make sure you test the value of index to see if it negative, 
		 * which indicates that the key was not found in the list.
		 */
		
		int index = Collections.binarySearch(papers, key);

		/* 
		 * Print out whether the AcademicPaper was found or not and the index
		 * at which it was found.
		 * HINT: If index is negative print a statement saying that the
		 *       item searched for is not in the list.  Otherwise, print
		 *       out a statement telling that item was found in the list
		 *       and give the index of item in the list as well.
		 */
		if(index != -1)
			System.out.println(papers.get(index));
		
		//from http://stackoverflow.com/questions/85190/how-does-the-java-for-each-loop-work with many modifications
		for(Iterator<AcademicPaper> i = papers.iterator(); i.hasNext(); ) {
			  AcademicPaper item = i.next();
			  System.out.println(item.toString());
			}
		
		
	}
}