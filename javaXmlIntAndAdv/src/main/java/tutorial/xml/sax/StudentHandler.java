package tutorial.xml.sax;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import tutorial.xml.dom.Student;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static java.lang.Integer.parseInt;

@Component
public class StudentHandler extends DefaultHandler {

    private static final String STUDENT = "student";
    private static final String ROLL_NO = "rollno";
    private static final String FIRST_NAME = "firstname";
    private static final String LAST_NAME = "lastname";
    private static final String NICKNAME = "nickname";
    private static final String MARKS = "marks";
    private static final String CLASS = "class";

    private Student currentStudent;

    private List<Student> students;

    @Getter
    private List<Student> result = Collections.emptyList();


    private boolean processingFirstName = false;
    private boolean processingLastName = false;
    private boolean processingNickname = false;
    private boolean processingMarks = false;


    @Override
    public void startDocument() throws SAXException {
        students = new LinkedList<>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void endDocument() throws SAXException {
        result = Collections.unmodifiableList(students);
    }
}
