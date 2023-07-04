package com.jcl.emp_backend.controller;

import com.jcl.emp_backend.pojo.Customer;
import com.jcl.emp_backend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private  CustomerService customerService;

    @RequestMapping("/customer")
    @ResponseBody
    public List<Customer> findAll(){
        return customerService.findAll();
    }
}
