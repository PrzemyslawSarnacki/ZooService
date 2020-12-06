
package wel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wel package. 
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

    private final static QName _AddAnimal_QNAME = new QName("http://wel/", "addAnimal");
    private final static QName _CheckPopularityResponse_QNAME = new QName("http://wel/", "checkPopularityResponse");
    private final static QName _AddAnimalResponse_QNAME = new QName("http://wel/", "addAnimalResponse");
    private final static QName _CheckHealth_QNAME = new QName("http://wel/", "checkHealth");
    private final static QName _CheckHealthResponse_QNAME = new QName("http://wel/", "checkHealthResponse");
    private final static QName _CheckPopularity_QNAME = new QName("http://wel/", "checkPopularity");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddAnimal }
     * 
     */
    public AddAnimal createAddAnimal() {
        return new AddAnimal();
    }

    /**
     * Create an instance of {@link CheckPopularityResponse }
     * 
     */
    public CheckPopularityResponse createCheckPopularityResponse() {
        return new CheckPopularityResponse();
    }

    /**
     * Create an instance of {@link AddAnimalResponse }
     * 
     */
    public AddAnimalResponse createAddAnimalResponse() {
        return new AddAnimalResponse();
    }

    /**
     * Create an instance of {@link CheckHealthResponse }
     * 
     */
    public CheckHealthResponse createCheckHealthResponse() {
        return new CheckHealthResponse();
    }

    /**
     * Create an instance of {@link CheckHealth }
     * 
     */
    public CheckHealth createCheckHealth() {
        return new CheckHealth();
    }

    /**
     * Create an instance of {@link CheckPopularity }
     * 
     */
    public CheckPopularity createCheckPopularity() {
        return new CheckPopularity();
    }

    /**
     * Create an instance of {@link AnimalDetailsType }
     * 
     */
    public AnimalDetailsType createAnimalDetailsType() {
        return new AnimalDetailsType();
    }

    /**
     * Create an instance of {@link LastVaccinationType }
     * 
     */
    public LastVaccinationType createLastVaccinationType() {
        return new LastVaccinationType();
    }

    /**
     * Create an instance of {@link ParentsType }
     * 
     */
    public ParentsType createParentsType() {
        return new ParentsType();
    }

    /**
     * Create an instance of {@link AnimalClassificationType }
     * 
     */
    public AnimalClassificationType createAnimalClassificationType() {
        return new AnimalClassificationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAnimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wel/", name = "addAnimal")
    public JAXBElement<AddAnimal> createAddAnimal(AddAnimal value) {
        return new JAXBElement<AddAnimal>(_AddAnimal_QNAME, AddAnimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPopularityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wel/", name = "checkPopularityResponse")
    public JAXBElement<CheckPopularityResponse> createCheckPopularityResponse(CheckPopularityResponse value) {
        return new JAXBElement<CheckPopularityResponse>(_CheckPopularityResponse_QNAME, CheckPopularityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAnimalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wel/", name = "addAnimalResponse")
    public JAXBElement<AddAnimalResponse> createAddAnimalResponse(AddAnimalResponse value) {
        return new JAXBElement<AddAnimalResponse>(_AddAnimalResponse_QNAME, AddAnimalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckHealth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wel/", name = "checkHealth")
    public JAXBElement<CheckHealth> createCheckHealth(CheckHealth value) {
        return new JAXBElement<CheckHealth>(_CheckHealth_QNAME, CheckHealth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckHealthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wel/", name = "checkHealthResponse")
    public JAXBElement<CheckHealthResponse> createCheckHealthResponse(CheckHealthResponse value) {
        return new JAXBElement<CheckHealthResponse>(_CheckHealthResponse_QNAME, CheckHealthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPopularity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wel/", name = "checkPopularity")
    public JAXBElement<CheckPopularity> createCheckPopularity(CheckPopularity value) {
        return new JAXBElement<CheckPopularity>(_CheckPopularity_QNAME, CheckPopularity.class, null, value);
    }

}
