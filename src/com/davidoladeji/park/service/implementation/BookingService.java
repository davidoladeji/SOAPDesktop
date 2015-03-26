
package com.davidoladeji.park.service.implementation;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.davidoladeji.park.service.interfaces.Booking;
import com.davidoladeji.park.service.interfaces.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BookingService", targetNamespace = "http://interfaces.service.park.davidoladeji.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BookingService {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.davidoladeji.park.service.interfaces.Booking
     */
    @WebMethod
    @WebResult(partName = "return")
    public Booking findByCarRegistration(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(partName = "return")
    public double getTotalActiveBookingPrice();

    /**
     * 
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(partName = "return")
    public double getTotalBookingPrice();

}
