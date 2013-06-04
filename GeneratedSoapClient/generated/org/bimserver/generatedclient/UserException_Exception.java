
package org.bimserver.generatedclient;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.3
 * 2013-05-31T16:04:26.730+02:00
 * Generated source version: 2.7.3
 */

@WebFault(name = "UserException", targetNamespace = "bimserver")
public class UserException_Exception extends Exception {
    
    private org.bimserver.generatedclient.UserException userException;

    public UserException_Exception() {
        super();
    }
    
    public UserException_Exception(String message) {
        super(message);
    }
    
    public UserException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public UserException_Exception(String message, org.bimserver.generatedclient.UserException userException) {
        super(message);
        this.userException = userException;
    }

    public UserException_Exception(String message, org.bimserver.generatedclient.UserException userException, Throwable cause) {
        super(message, cause);
        this.userException = userException;
    }

    public org.bimserver.generatedclient.UserException getFaultInfo() {
        return this.userException;
    }
}