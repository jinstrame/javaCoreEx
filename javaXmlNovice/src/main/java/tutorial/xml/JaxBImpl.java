package tutorial.xml;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.InputStream;
import java.io.OutputStream;

@Component
public class JaxBImpl implements JaxB {

    @Resource
    JAXBContext simplePersonContext;

    @Override
    public void marshalClass(SimplePerson simplePerson, OutputStream outputStream) throws JAXBException {
        throw new UnsupportedOperationException();
    }

    @Override
    public SimplePerson unmarshalClass(InputStream stream) throws JAXBException {
        throw new UnsupportedOperationException();
    }
}
