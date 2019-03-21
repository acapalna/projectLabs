package org.fasttrackit.agenda.domain.helpers;

import org.fasttrackit.agenda.domain.Agenda;
import org.fasttrackit.agenda.domain.Contact;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XmlManipulation {
    private static String pathToXMLFiles = "src\\main\\java\\org\\fasttrackit\\agenda\\domain\\saves\\";

    public static void writeAgendaToXMLFile(Agenda agenda) {

        try {

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // root elements agenda
            Document doc = docBuilder.newDocument();
            Element agendaElementRoot = doc.createElement("agenda");
            doc.appendChild(agendaElementRoot);

            // agendaNameElement elements
            Element agendaName = doc.createElement("agendaName");
            agendaName.appendChild(doc.createTextNode(agenda.getNameAgenda()));
            agendaElementRoot.appendChild(agendaName);

            // agendaOwnerElement elements
            Element agendaOwner = doc.createElement("agendaOwner");
            agendaOwner.appendChild(doc.createTextNode(agenda.getOwner()));
            agendaElementRoot.appendChild(agendaOwner);

            for (Contact contact : agenda.getContactList()) {
                // agendaContactElement elements
                Element agendaContact = doc.createElement("agendaContact");
                agendaElementRoot.appendChild(agendaContact);

                // set attribute to agendaContactElement element
                String contactId = contact.getFirstName() + "-" + contact.getLastName();
                agendaContact.setAttribute("id", contactId);

                // contactFirstNameElement elements
                Element contactFirstName = doc.createElement("contactFirstName");
                contactFirstName.appendChild(doc.createTextNode(contact.getFirstName()));
                agendaContact.appendChild(contactFirstName);

                // contactFirstNameElement elements
                Element contactLastName = doc.createElement("contactLastName");
                contactLastName.appendChild(doc.createTextNode(contact.getLastName()));
                agendaContact.appendChild(contactLastName);

                // contactPhoneElement elements
                Element contactPhone = doc.createElement("contactPhone");
                contactPhone.appendChild(doc.createTextNode(contact.getPhone()));
                agendaContact.appendChild(contactPhone);

                // contactPhoneElement elements
                Element contactAddress = doc.createElement("contactAddress");
                contactAddress.appendChild(doc.createTextNode(contact.getAddress()));
                agendaContact.appendChild(contactAddress);
            }

            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(pathToXMLFiles + agenda.getNameAgenda() + ".xml"));

            // Output to console for testing
            // StreamResult result = new StreamResult(System.out);

            transformer.transform(source, result);
            System.out.println("File saved!");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }

}