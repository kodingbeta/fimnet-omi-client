
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
@WebServiceClient(name = "AdminMgmtService", targetNamespace = "http://www.verimatrix.com/omi", wsdlLocation = "http://localhost:45678/AdminMgmt.wsdl")
public class AdminMgmtService
    extends Service
{

    private final static URL ADMINMGMTSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.verimatrix.omi.AdminMgmtService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.verimatrix.omi.AdminMgmtService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:45678/AdminMgmt.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:45678/AdminMgmt.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        ADMINMGMTSERVICE_WSDL_LOCATION = url;
    }

    public AdminMgmtService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdminMgmtService() {
        super(ADMINMGMTSERVICE_WSDL_LOCATION, new QName("http://www.verimatrix.com/omi", "AdminMgmtService"));
    }

    /**
     * 
     * @return
     *     returns AdminMgmt
     */
    @WebEndpoint(name = "AdminMgmt")
    public AdminMgmt getAdminMgmt() {
        return super.getPort(new QName("http://www.verimatrix.com/omi", "AdminMgmt"), AdminMgmt.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdminMgmt
     */
    @WebEndpoint(name = "AdminMgmt")
    public AdminMgmt getAdminMgmt(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.verimatrix.com/omi", "AdminMgmt"), AdminMgmt.class, features);
    }

}
