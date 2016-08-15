import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.juniormiqueletti.domain.People;

import java.io.File;
import java.io.StringWriter;

/**
 * Created by Junior-Pc on 06/03/2016.
 */
public class JaxbExamples {

    People me = new People();
    File xmlFile = new File("file.xml");
    JAXBContext jaxbContext ;
    Marshaller jaxbMarshaller;
    Unmarshaller jaxbUnmarshaller;

    public JaxbExamples() throws JAXBException {
        me.setId(1);
        me.setName("Junior Miqueletti");
        me.setNickName("Junior");
        me.setAge(29);
        
        jaxbContext = JAXBContext.newInstance(People.class);
        jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    }

    public void createXml() {

        try {
            /*
            *    Xml parse and output
            */
            StringWriter xmlString = new StringWriter();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(me, xmlFile);
            jaxbMarshaller.marshal(me, xmlString);

            System.out.println(xmlString);

        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    * Reading the file generated on other method
    */
    public void readXml(){

        People meByXml = new People();

        try {

            meByXml = (People) jaxbUnmarshaller.unmarshal(xmlFile);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        System.out.println(meByXml);

    }


}
