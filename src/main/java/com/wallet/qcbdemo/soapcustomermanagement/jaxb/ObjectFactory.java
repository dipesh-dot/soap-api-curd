package com.wallet.qcbdemo.soapcustomermanagement.jaxb;


import jakarta.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {



    public ObjectFactory() {
    }



    public GetCustomerDetailsResponse createGetCustomerDetailsResponse() {
        return new GetCustomerDetailsResponse();
    }


    public CustomerDetails createCustomerDetails() {
        return new CustomerDetails();
    }




    public GetCustomerDetailsRequest createGetCourseDetailsRequest() {
        return new GetCustomerDetailsRequest();
    }



}
