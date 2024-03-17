package com.wallet.qcbdemo.soapcustomermanagement.soap;

import com.wallet.qcbdemo.soap.bean.Customer;
import com.wallet.qcbdemo.soapcustomermanagement.jaxb.CustomerDetails;
import com.wallet.qcbdemo.soapcustomermanagement.jaxb.GetCustomerDetailsRequest;
import com.wallet.qcbdemo.soapcustomermanagement.jaxb.GetCustomerDetailsResponse;
import com.wallet.qcbdemo.soapcustomermanagement.soap.exception.CustomerNotFoundException;
import com.wallet.qcbdemo.soapcustomermanagement.soap.service.CustomerDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class CustomerDetailsEndpoint {





    @Autowired
    CustomerDetailService service;

    // Supports the Request from
    // http://carlallanvela.com/courses
    // and GetCourseDetailsRequest
    @PayloadRoot(namespace = "http://carlallanvela.com/courses",
            localPart="GetCustomerDetailsRequest")
    @ResponsePayload
    public GetCustomerDetailsResponse  processCustomerDetailsRequest
    (@RequestPayload GetCustomerDetailsRequest  request) {

        Customer customer = service.findById(request.getId());

        if (customer == null) {
            throw new CustomerNotFoundException("Invalid Course Id: " + request.getId());
        }

        return mapCustomerDetails(customer);
    }





    private CustomerDetails  mapCustomer(Customer customer) {
        CustomerDetails customerDetails = new CustomerDetails();

        customerDetails.setId(customer.getId());
        customerDetails.setName(customer.getName());


        return customerDetails;
    }

    private GetCustomerDetailsResponse  mapCustomerDetails(Customer customer) {
        GetCustomerDetailsResponse  response = new GetCustomerDetailsResponse();
        response.setCustomerDetails(mapCustomer(customer));

        return response;
    }




}
