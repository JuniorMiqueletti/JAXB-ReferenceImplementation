import javax.xml.bind.JAXBException;

/**
 * Created by Junior-Pc on 06/03/2016.
 */
public class Main {
    public static void main(String[] args){
        try {

            JaxbExamples jaxb = new JaxbExamples();
            jaxb.createXml();
            jaxb.readXml();

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
