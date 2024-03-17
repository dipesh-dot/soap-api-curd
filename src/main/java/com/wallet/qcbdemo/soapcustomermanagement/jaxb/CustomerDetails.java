package com.wallet.qcbdemo.soapcustomermanagement.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDetails", propOrder = {
        "id",
        "name",

})
@Getter
@Setter
public class CustomerDetails {

    protected int id;
    @XmlElement(required = true)
    protected String name;


}
