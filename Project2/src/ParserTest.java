import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;


public class ParserTest {

	@Test
	public void testParseFile() throws IOException {
		Parser parser = new Parser("C:\\Users\\Marty\\workspace\\Git\\Project2\\TestCase.txt");
		
		parser.parseFile();
		
		System.out.println(parser.getPublications().get(0).getTitlePaper());
	}

}
