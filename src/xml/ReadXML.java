package xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class ReadXML {
    public static void main(String[] args) {
        Book book = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            book = (Book) jaxbUnmarshaller.unmarshal( new File("src/data/book.xml") );
        } catch (JAXBException e) {
            e.printStackTrace();
        }


        System.out.println(book);
    }
}
