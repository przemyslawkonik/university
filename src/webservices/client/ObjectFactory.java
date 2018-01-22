
package webservices.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReplyResponse_QNAME = new QName("http://server.asd/", "replyResponse");
    private final static QName _Reply_QNAME = new QName("http://server.asd/", "reply");
    private final static QName _Add_QNAME = new QName("http://server.asd/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://server.asd/", "addResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link ReplyResponse }
     * 
     */
    public ReplyResponse createReplyResponse() {
        return new ReplyResponse();
    }

    /**
     * Create an instance of {@link Reply }
     * 
     */
    public Reply createReply() {
        return new Reply();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.asd/", name = "replyResponse")
    public JAXBElement<ReplyResponse> createReplyResponse(ReplyResponse value) {
        return new JAXBElement<ReplyResponse>(_ReplyResponse_QNAME, ReplyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.asd/", name = "reply")
    public JAXBElement<Reply> createReply(Reply value) {
        return new JAXBElement<Reply>(_Reply_QNAME, Reply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.asd/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.asd/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

}
