package com.jcl.emp_backend.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jcl.emp_backend.mapper.CustomerMapper;
import com.jcl.emp_backend.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    Customer customer = new Customer();

    public List<Customer> findAll(){
        return customerMapper.findAll();
    };

    public List<Customer> searchByCondition(Customer params){
        Customer param = new Customer();
        param.setId(params.getId());
        param.setName(params.getName());
        param.setZip(params.getZip());
        param.setAddress(params.getAddress());
        param.setTel_no(params.getTel_no());
        param.setEmail(params.getEmail());
        param.setPartener(params.getPartener());
        param.setRepresentative(params.getRepresentative());
        param.setStation(params.getStation());
        param.setDelete_flag(params.getDelete_flag());
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(params.getInsert_date()==null||params.getInsert_date().toString()==""){
            param.setInsert_date(null);
        }else {
            param.setInsert_date(Timestamp.valueOf(simpleDate.format(params.getInsert_date())));
        }
        if (params.getUpdate_date()==null||params.getUpdate_date().toString()==""){
           param.setUpdate_date(null);
        }else {
            param.setUpdate_date(Timestamp.valueOf(simpleDate.format(params.getUpdate_date())));
        }
        return customerMapper.searchByCondition(param);
    }

    public void saveCustomer(Customer cc){
        customer.setId(cc.getId());
        customer.setName(cc.getName());
        customer.setZip(cc.getZip());
        customer.setAddress(cc.getAddress());
        customer.setEmail(cc.getEmail());
        customer.setTel_no(cc.getTel_no());
        customer.setPartener(cc.getPartener());
        customer.setRepresentative( cc.getRepresentative());
        customer.setStation(cc.getStation());
        customer.setDelete_flag(cc.getDelete_flag());
        //暂且由date生成后面前端有时间传入可进行修改
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        customer.setInsert_date(Timestamp.valueOf(simpleDate.format(date)));
        customer.setUpdate_date(Timestamp.valueOf(simpleDate.format(date)));
        customerMapper.addCustomer(customer);
    }

    public void deleteCustomer(Integer id){
        customerMapper.deleteCustomer(id);
    }

    public void deleteByIds(List<Integer> ids){
        customerMapper.deleteByIds(ids);
    }

    public void updateCustomer(Customer cc){
        List<Customer> clist = searchByCondition(cc);
        for (Customer cl:clist
             ) {
            customer.setName(cl.getName());
            customer.setZip(cl.getZip());
            customer.setAddress(cl.getAddress());
            customer.setTel_no(cl.getTel_no());
            customer.setEmail(cl.getEmail());
            customer.setPartener(cl.getPartener());
            customer.setRepresentative(cl.getRepresentative());
            customer.setStation(cl.getStation());
            customer.setDelete_flag(cl.getDelete_flag());
            customer.setUpdate_date(cl.getUpdate_date());
        }
    }

    public PageInfo<Customer> selectByPage(){
        PageHelper.startPage(1,10);
        List<Customer> clist = customerMapper.selectByPage();
        PageInfo<Customer> pageInfo = new PageInfo<Customer>(clist);
        return pageInfo;
    }
}
