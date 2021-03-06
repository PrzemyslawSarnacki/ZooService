
package org.example.newservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ZooService", targetNamespace = "http://www.example.org/NewService/", wsdlLocation = "file:/home/student/NetBeansProjects/ZooService/src/wsdl/ZooService.wsdl")
public class ZooService_Service
    extends Service
{

    private final static URL ZOOSERVICE_WSDL_LOCATION;
    private final static WebServiceException ZOOSERVICE_EXCEPTION;
    private final static QName ZOOSERVICE_QNAME = new QName("http://www.example.org/NewService/", "ZooService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/student/NetBeansProjects/ZooService/src/wsdl/ZooService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ZOOSERVICE_WSDL_LOCATION = url;
        ZOOSERVICE_EXCEPTION = e;
    }

    public ZooService_Service() {
        super(__getWsdlLocation(), ZOOSERVICE_QNAME);
    }

    public ZooService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ZOOSERVICE_QNAME, features);
    }

    public ZooService_Service(URL wsdlLocation) {
        super(wsdlLocation, ZOOSERVICE_QNAME);
    }

    public ZooService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ZOOSERVICE_QNAME, features);
    }

    public ZooService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ZooService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ZooService
     */
    @WebEndpoint(name = "ZooServiceSOAP")
    public ZooService getZooServiceSOAP() {
        return super.getPort(new QName("http://www.example.org/NewService/", "ZooServiceSOAP"), ZooService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ZooService
     */
    @WebEndpoint(name = "ZooServiceSOAP")
    public ZooService getZooServiceSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.example.org/NewService/", "ZooServiceSOAP"), ZooService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ZOOSERVICE_EXCEPTION!= null) {
            throw ZOOSERVICE_EXCEPTION;
        }
        return ZOOSERVICE_WSDL_LOCATION;
    }

}
