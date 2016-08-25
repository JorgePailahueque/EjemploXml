/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaJAXP;

import java.io.ByteArrayOutputStream;
    import javax.xml.parsers.DocumentBuilder; 
    import javax.xml.parsers.DocumentBuilderFactory; 
    import javax.xml.transform.Transformer;     
    import javax.xml.transform.TransformerException; 
    import javax.xml.transform.TransformerFactory; 
    import javax.xml.transform.TransformerConfigurationException; 
    import javax.xml.transform.dom.DOMSource; 
    import javax.xml.transform.stream.StreamSource; 
    import javax.xml.transform.stream.StreamResult; 
    import org.w3c.dom.Document;

public class EjemploJAXP {

 
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(obtenerCarteleraHMTL());
    }
    public static String obtenerCarteleraHMTL() { 
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
     
    try { 
    // Usar JAXP DOM para generar Document con fichero xml 
        DocumentBuilder builder = factory.newDocumentBuilder(); 
        Document document = builder.parse("file:///C:/Users/diego/Documents/NetBeansProjects/Xml/src/JavaJAXP/Cartelera.xml"); 
        // Generar un objeto transformer para realizar transform XSL 
        TransformerFactory tFactory = TransformerFactory.newInstance(); 
        StreamSource stylesource = new StreamSource("file:///C:/Users/diego/Documents/NetBeansProjects/Xml/src/JavaJAXP/Cartelera.xsl"); 
        Transformer transformer = tFactory.newTransformer(stylesource); 
        DOMSource source = new DOMSource(document); 
        ByteArrayOutputStream outputByteArray = new ByteArrayOutputStream(); 
        StreamResult result = new StreamResult(outputByteArray); 
        transformer.transform(source, result); 
        return outputByteArray.toString(); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
        return null;
    }
}
