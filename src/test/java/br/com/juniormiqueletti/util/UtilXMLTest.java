package br.com.juniormiqueletti.util;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.juniormiqueletti.domain.People;
import com.juniormiqueletti.util.UtilXML;

import org.junit.Assert;

public class UtilXMLTest {

	File xmlFile;
	People people;

	@Before
	public void setUp() {
		xmlFile = new File("xmlFile.xml");
		people = new People();

		people.setId(1);
		people.setName("Junior Miqueletti");
		people.setNickName("Junior");
		people.setAge(29);
	}

	@After
	public void release() {
		xmlFile = null;
		people = null;
	}

	@Test
	public void shouldCreateXmlFileWithoutErros() {
		UtilXML.parseToXmlFile(people, xmlFile);
	}

	@Test
	public void shouldReadXmlFile() {
		People peopleFromXml = new People();
		peopleFromXml = (People) UtilXML.parseObject(peopleFromXml, xmlFile);

		Assert.assertEquals(people, peopleFromXml);
	}

}
