/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOM;
import org.w3c.dom.Document; 
import org.w3c.dom.NamedNodeMap; 
import org.w3c.dom.Node; 
import org.w3c.dom.NodeList; 
import java.io.IOException; 
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
public class EjemploDOM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
        // TODO code application logic here
        String fich = "file:///C:/Users/diego/Documents/NetBeansProjects/Xml/src/DOM/Peliculas.xml";
        DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
        DocumentBuilder parser = fact.newDocumentBuilder(); 
        parser.parse(fich); 
        Document doc = parser.parse(fich); 
        EjemploDOM.tratarNodo(doc); 
        NodeList peliNodes = doc.getChildNodes();
        
    }
    
    public static void tratarNodo(Node nodo) {
        String ind = "";
        
        switch (nodo.getNodeType()) { 
            case Node.DOCUMENT_NODE: 
                System.out.println("<xml version=\"1.0\">"); 
                Document doc = (Document)nodo; 
                tratarNodo(doc.getDocumentElement()); 
                break; 
            case Node.ELEMENT_NODE: 
                String nombre = nodo.getNodeName(); 
                System.out.print("<" + nombre); 
                NamedNodeMap ats = nodo.getAttributes(); 
                for (int i=0; i<ats.getLength(); i++) { 
                   
                    tratarNodo(ats.item(i)); 
                } 
                System.out.println(">"); 
                NodeList hijos = nodo.getChildNodes();
                for (int i = 0; i <hijos.getLength(); i++) {
                    tratarNodo(hijos.item(i));
                }
                
                break; 
            case Node.ATTRIBUTE_NODE: 
                System.out.print(" " + nodo.getNodeName() + "=\"" + nodo.getNodeValue() +"\"");
                break; 
            case Node.TEXT_NODE: 
                String texto = nodo.getNodeValue().trim(); 
                if (!texto.equals("")) { 
                    System.out.println(ind + texto); 
                } 
                break; 
            case Node.CDATA_SECTION_NODE: 
                System.out.println(nodo.getNodeValue()); 
                break; 
            case Node.PROCESSING_INSTRUCTION_NODE: 
                break; 
            case Node.ENTITY_REFERENCE_NODE: 
                break; 
            case Node.DOCUMENT_TYPE_NODE: 
                break; 
        } 
        
        
       
    }
    
}
