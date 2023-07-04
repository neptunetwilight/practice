package com.jcl.emp_backend.mapper;

import com.jcl.emp_backend.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {

    public List<Customer> findAll() throws RuntimeException;
}
