package com.jcl.emp_backend.service;

import com.jcl.emp_backend.mapper.CustomerMapper;
import com.jcl.emp_backend.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    public List<Customer> findAll(){
        return customerMapper.findAll();
    };
}
