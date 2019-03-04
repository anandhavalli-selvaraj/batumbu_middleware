package com.batumbu.config;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

import org.springframework.stereotype.Service;

@Service
public class XMLParser {

	
	public String parseJavaObjectToXML(Object balanceRequest, Class class1) throws JAXBException, PropertyException {
		JAXBContext jaxbContext=JAXBContext.newInstance(class1);
		Marshaller jaxbMarshaller=jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
		StringWriter sw=new StringWriter();
		jaxbMarshaller.marshal(balanceRequest, sw);
		String xmlcontent=sw.toString();
		String validXMLContent=xmlcontent.substring(xmlcontent.indexOf(">")+1);
		System.out.println(validXMLContent);
		return validXMLContent;
	}

}
