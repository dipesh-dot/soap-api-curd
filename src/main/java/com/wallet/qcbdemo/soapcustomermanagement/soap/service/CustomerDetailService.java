package com.wallet.qcbdemo.soapcustomermanagement.soap.service;

import com.wallet.qcbdemo.soap.bean.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class CustomerDetailService {


    public enum Status {
        SUCCESS, FAILURE;
    }

    private static List<Customer> customers = new ArrayList<>();

    static {
        Customer customer1 = new Customer(1, "Dipesh");
        customers.add(customer1);
        Customer customer2 = new Customer(1, "Ramesh");
        customers.add(customer2);


        Customer customer3 = new Customer(1, "Umesh");
        customers.add(customer3);
    }

    public Customer findById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }




}
