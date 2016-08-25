
package SAX;

import java.io.IOException;
import java.util.Vector;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;


public class Xml {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        
        SesionCineSAXParser s = new SesionCineSAXParser("file:///C:/Users/diego/Documents/NetBeansProjects/Xml/src/SAX/CarteleraCine.xml");
        DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
        DocumentBuilder parser = fact.newDocumentBuilder(); 
        Document doc= parser.parse("file:///C:/Users/diego/Documents/NetBeansProjects/Xml/src/SAX/CarteleraCine.xml"); 
        
    }
    
}
