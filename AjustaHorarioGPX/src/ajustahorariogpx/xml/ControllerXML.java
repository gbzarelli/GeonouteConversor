/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.helpdev.xml;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author guilherme
 */
public class ControllerXML {

    public static Object xml_to_object(Class clas, File xml) throws Exception {
        JAXBContext context = JAXBContext.newInstance(clas);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return unmarshaller.unmarshal(xml);
    }

    public static Object xml_to_object(Class clas, String xml) throws Exception {
        JAXBContext context = JAXBContext.newInstance(clas);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return unmarshaller.unmarshal(new ByteArrayInputStream(xml.getBytes()));
    }

    public static ByteArrayOutputStream object_to_output_stream(Object object) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(object.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
      
      
        marshaller.marshal(object, baos);
        return baos;
    }

    public static String object_to_xml(Object object) throws JAXBException {
        return new String(object_to_output_stream(object).toByteArray());
    }
}
