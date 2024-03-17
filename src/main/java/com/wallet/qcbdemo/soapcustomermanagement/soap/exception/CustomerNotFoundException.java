package com.wallet.qcbdemo.soapcustomermanagement.soap.exception;

import com.wallet.qcbdemo.soap.bean.Customer;
import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;


@SoapFault(faultCode = FaultCode.CUSTOM, customFaultCode = "{http://carlallanvela.com/courses} 001_COURSE_NOT_FOUND")
public class CustomerNotFoundException extends RuntimeException{


    private static final long serialVersionUID = 1L;

    public CustomerNotFoundException(String message) {
        super(message);
    }
}
