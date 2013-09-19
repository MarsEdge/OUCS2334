import junit.framework.Assert;

import org.junit.Test;

public class ParserTest {
	@Test
	public void testName() {
		Parser testParser = new Parser( new String[] {"c:\\Test.txt" } );
		
		Magazine testMag = testParser.makeMagazine("The Watchtower, Watchtower Bible and Tract Society, 6, 1879");
		
		Assert.assertEquals(testMag.getName(), "The Watchtower");
	}
	
	@Test
	public void testPub() {
		Parser testParser = new Parser( new String[] {"c:\\Test.txt" } );
		
		Magazine testMag = testParser.makeMagazine("The Watchtower, Watchtower Bible and Tract Society, 6, 1879");
		
		Assert.assertEquals(testMag.getPublisher(), "Watchtower Bible and Tract Society");
	}
	
	@Test
	public void testIssues() {
		Parser testParser = new Parser( new String[] {"c:\\Test.txt" } );
		
		Magazine testMag = testParser.makeMagazine("The Watchtower, Watchtower Bible and Tract Society, 6, 1879");
		
		Assert.assertEquals(testMag.getIssuesAnnual(), "6");
	}
	
	@Test
	public void testYearInit() {
		Parser testParser = new Parser( new String[] {"c:\\Test.txt" } );
		
		Magazine testMag = testParser.makeMagazine("The Watchtower, Watchtower Bible and Tract Society, 6, 1879");
		
		Assert.assertEquals(testMag.getYearInit(), "1879");
	}
	
	@Test
	public void testYearFinal() {
		Parser testParser = new Parser( new String[] {"c:\\Test.txt" } );
		
		Magazine testMag = testParser.makeMagazine("The Watchtower, Watchtower Bible and Tract Society, 6, 1879, 2013");
		
		Assert.assertEquals(testMag.getYearFinal(), "2013");
	}
}
