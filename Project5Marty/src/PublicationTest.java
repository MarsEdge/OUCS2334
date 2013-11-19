import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;


public class PublicationTest {

	@Test
	public void testConstructor() {		
		HashMap<String, Scholar> authors = new HashMap<String, Scholar>();
		
		authors.put("FName LName", new Scholar("FName LName"));
		
		Publication pub = new Publication(authors, "titlePaper", "titleSerial", "pageStart", "pageEnd", "month", "year", "link");
		
		Assert.assertEquals(pub.getTitlePaper(), "titlePaper");
		
		Assert.assertEquals(pub.getTitleSerial(), "titleSerial");
		
		Assert.assertEquals(pub.getScholarsString(), "FName LName; ");
		
		Assert.assertEquals(pub.getPageStart(), "pageStart");
		
		Assert.assertEquals(pub.getPageEnd(), "pageEnd");
		
		Assert.assertEquals(pub.getPageEnd(), "pageEnd");
		
		Assert.assertEquals(pub.getDate(), "month year");
	}
}
