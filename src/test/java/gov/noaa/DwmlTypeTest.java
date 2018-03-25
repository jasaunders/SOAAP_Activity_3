package gov.noaa;

import org.junit.jupiter.api.Test;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import static org.junit.jupiter.api.Assertions.*;

class DwmlTypeTest {

    @Test
    void getLatLonList() throws JAXBException {

        // create JAXB context and initializing Marshaller
        JAXBContext jaxbContext = JAXBContext.newInstance(DwmlType.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        // specify the location and name of xml file to be read
        File XMLfile = new File("/Users/joannesaunders/IdeaProjects/SOAP_Activity_3/src/test/resources/response.xml");
        DwmlType dwml = (DwmlType) jaxbUnmarshaller.unmarshal(XMLfile);
        assertEquals("43.0798,-89.3875", dwml.getLatLonList());
    }
}