import static org.junit.Assert.*;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;


public class ParserTest {

	@Test
	public void testParseFile() throws IOException {
		Parser parser = new Parser("TestCase.txt");
		
		parser.parseFile();
		
		Assert.assertEquals(parser.getPublications().get(0).getTitlePaper(), "Sexual Selection, Resource Distribution, and Population Size in Synthetic Sympatric Speciation");
	}
}
