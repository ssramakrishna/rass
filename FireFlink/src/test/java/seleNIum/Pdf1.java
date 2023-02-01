package seleNIum;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class Pdf1 {

	public static void main(String[] args) throws IOException, SAXException, TikaException {

		BodyContentHandler contentholder = new BodyContentHandler();
		FileInputStream fis = new FileInputStream("./src/test/resources/Ram.pdf");
		Metadata metadata = new Metadata();
		ParseContext parseContext = new ParseContext();
		PDFParser parser = new PDFParser();
		parser.parse(fis, contentholder, metadata, parseContext);

		System.out.println(contentholder.toString());
	}
}
