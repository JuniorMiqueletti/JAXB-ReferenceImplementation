package com.juniormiqueletti.util;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.juniormiqueletti.exception.JAXBParseException;

public final class UtilXML {

	private UtilXML() { }
	
	public static Object parseObject(Object clazzToParse, File xmlFile) {

		Object clazz = null;
		JAXBContext jaxbContext;
		Unmarshaller jaxbUnmarshaller;

		try {

			jaxbContext = createJaxbContext(clazzToParse);
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			clazz = jaxbUnmarshaller.unmarshal(xmlFile);

		} catch (JAXBException e) {
			throw new JAXBParseException(e);
		}
		return clazz;
	}

	private static JAXBContext createJaxbContext(Object clazzToParse) throws JAXBException {
		return JAXBContext.newInstance(clazzToParse.getClass());
	}

	public static void parseToXmlFile(Object clazzToXml, File xmlFileToCreate) {

		JAXBContext jaxbContext;
		Marshaller jaxbMarshaller;

		try {

			jaxbContext = createJaxbContext(clazzToXml);
			jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(clazzToXml, xmlFileToCreate);

		} catch (JAXBException e) {
			throw new JAXBParseException(e);
		}
	}
}
