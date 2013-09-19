import junit.framework.Assert;
import org.junit.Test;

public class MagazineTest {
	@Test
	public void testName() {
		Magazine testMag = new Magazine("Name", "Pub", "12", "2012", "2013");
		
		Assert.assertEquals(testMag.getName(), "Name");
	}
	
	@Test
	public void testPub() {
		Magazine testMag = new Magazine("Name", "Pub", "12", "2012", "2013");
		
		Assert.assertEquals(testMag.getPublisher(), "Pub");
	}
	
	@Test
	public void testIssues() {
		Magazine testMag = new Magazine("Name", "Pub", "12", "2012", "2013");
		
		Assert.assertEquals(testMag.getIssuesAnnual(), "12");
	}
	
	@Test
	public void testYearInit() {
		Magazine testMag = new Magazine("Name", "Pub", "12", "2012", "2013");
		
		Assert.assertEquals(testMag.getYearInit(), "2012");
	}
	
	@Test
	public void testYearFinal() {
		Magazine testMag = new Magazine("Name", "Pub", "12", "2012", "2013");
		
		Assert.assertEquals(testMag.getYearFinal(), "2013");
	}
}
