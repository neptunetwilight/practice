package com.jcl.emp_backend.controller;

import com.jcl.emp_backend.pojo.Customer;
import com.jcl.emp_backend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class CustomerController {

    @Autowired
    private  CustomerService customerService;

    @RequestMapping("/customer")
    @ResponseBody
    public List<Customer> findAll(){
        return customerService.findAll();
    }

    @GetMapping("/searchCondition")
    public List<Customer> searchByCondition(@RequestParam Customer params){
        return customerService.searchByCondition(params);
    }

    String message = "";
    @PostMapping("/addCustomer")
    public String addCustomer(@RequestBody Customer customerinfo){
        try{
            customerService.saveCustomer(customerinfo);
            message = "增加用户成功";
        }catch (Exception e){
            e.printStackTrace();
            message = "增加用户失败";
        }
        return message;
    }

    @DeleteMapping("/deleteCustomer/{id}")
    public String deleteCustomer( @PathVariable int id){
        try{
            customerService.deleteCustomer(id);
            message = "删除用户成功";
        }catch (Exception e){
            e.printStackTrace();
            message = "删除用户失败";
        }
        return message;
    }

    @DeleteMapping("/deleteSelected")
    public String deleteByIds (@RequestBody List<Integer> ids){
        try{
            customerService.deleteByIds(ids);
            message = "删除用户成功";
        }catch (Exception e){
            e.printStackTrace();
            message = "删除用户失败";
        }
        return message;
    }
}
