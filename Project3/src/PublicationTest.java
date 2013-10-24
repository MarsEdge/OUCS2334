import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;


public class PublicationTest {

	@Test
	public void testConstructor() {		
		ArrayList<String> authors = new ArrayList<String>();
		
		authors.add("FName LName");
		
		Publication pub = new Publication(authors, "titlePaper", "titleSerial", "pageStart", "pageEnd", "month", "year", "link");
		
		Assert.assertEquals(pub.getTitlePaper(), "titlePaper");
		
		Assert.assertEquals(pub.getTitleSerial(), "titleSerial");
		
		Assert.assertEquals(pub.getAuthorsString(), "FName LName; ");
		
		Assert.assertEquals(pub.getPageStart(), "pageStart");
		
		Assert.assertEquals(pub.getPageEnd(), "pageEnd");
		
		Assert.assertEquals(pub.getPageEnd(), "pageEnd");
		
		Assert.assertEquals(pub.getDate(), "month year");
	}
}
