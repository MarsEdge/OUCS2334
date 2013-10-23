import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

/**
 * tests Parser, Publication, and JournalArticle
 */
public class ParserTest {

	@Test
	public void testParseFile() throws IOException {
		Parser parser = new Parser("TestCase.txt");
		
		parser.parsePublications();
		
		Assert.assertEquals(parser.getPublications().get("Sexual Selection, Resource Distribution, and Population Size in Synthetic Sympatric Speciation").getTitlePaper(), "Sexual Selection, Resource Distribution, and Population Size in Synthetic Sympatric Speciation");
	}
	
	@Test
	public void testParseFileString() throws IOException {
		Parser parser = new Parser("TestCase.txt");
		
		Assert.assertEquals(parser.getPublications().size() > 10, true);
	}
	
	@Test
	public void testParseFileAuthor() throws IOException {
		Parser parser = new Parser("TestCase.txt");
		
		parser.parsePublications();
		
		Assert.assertEquals(parser.getAuthors().get("Dean Hougen") != null, true);
	}

}
