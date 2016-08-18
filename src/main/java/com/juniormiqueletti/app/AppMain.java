package com.juniormiqueletti.app;


import com.juniormiqueletti.domain.People;
import com.juniormiqueletti.util.UtilXML;

import java.io.File;

public class AppMain {

	public static void main(String[] args) {
		
		//create and parte Class to XML File
		
		People me = new People();
		File xmlFile = new File("fileMe.xml");
		
		me.setId(1);
		me.setName("Junior Miqueletti");
		me.setNickName("Junior");
		me.setAge(29);
		
		UtilXML.parseToXmlFile(me, xmlFile);
		
		// reading and parsing a xml file to People
		
		People peopleFromXml = new People();
		
		peopleFromXml = (People) UtilXML.parseObject(peopleFromXml, new File("fileMe.xml"));
		
		System.out.println(peopleFromXml.toString());
		
	}
}
