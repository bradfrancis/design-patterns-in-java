package com.example.creational.abstractfactory;

import com.example.Application;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class AbstractFactoryEverydayDemo implements Application {

    @Override
    public void entry(String[] args) {
        String xml = "<document><body><stock>AAPL</stock></body></document>";
        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());

        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder factory = null;
        try {
            factory = abstractFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        Document doc = null;
        try {
            doc = factory.parse(bais);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
        System.out.println(abstractFactory.getClass());
        System.out.print(factory.getClass());
    }
}
