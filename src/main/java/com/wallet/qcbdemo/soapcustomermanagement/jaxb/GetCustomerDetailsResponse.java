package com.wallet.qcbdemo.soapcustomermanagement.jaxb;


import jakarta.xml.bind.annotation.*;
import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "CustomerDetails"
})
@XmlRootElement(name = "GetCustomerDetailsResponse")
@Getter
@Setter
public class GetCustomerDetailsResponse {


    @XmlElement(name = "CustomerDetails", required = true)
    protected CustomerDetails customerDetails;
}
