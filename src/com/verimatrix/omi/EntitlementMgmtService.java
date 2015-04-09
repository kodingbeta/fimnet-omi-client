
package com.verimatrix.omi;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "EntitlementMgmtService", targetNamespace = "http://www.verimatrix.com/omi", wsdlLocation = "http://localhost:45678/EntitlementMgmt.wsdl")
public class EntitlementMgmtService
    extends Service
{

    private final static URL ENTITLEMENTMGMTSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.verimatrix.omi.EntitlementMgmtService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.verimatrix.omi.EntitlementMgmtService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:45678/EntitlementMgmt.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:45678/EntitlementMgmt.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        ENTITLEMENTMGMTSERVICE_WSDL_LOCATION = url;
    }

    public EntitlementMgmtService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EntitlementMgmtService() {
        super(ENTITLEMENTMGMTSERVICE_WSDL_LOCATION, new QName("http://www.verimatrix.com/omi", "EntitlementMgmtService"));
    }

    /**
     * 
     * @return
     *     returns EntitlementMgmt
     */
    @WebEndpoint(name = "EntitlementMgmt")
    public EntitlementMgmt getEntitlementMgmt() {
        return super.getPort(new QName("http://www.verimatrix.com/omi", "EntitlementMgmt"), EntitlementMgmt.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EntitlementMgmt
     */
    @WebEndpoint(name = "EntitlementMgmt")
    public EntitlementMgmt getEntitlementMgmt(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.verimatrix.com/omi", "EntitlementMgmt"), EntitlementMgmt.class, features);
    }

}
