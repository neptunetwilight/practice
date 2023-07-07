package com.jcl.emp_backend.mapper;

import com.jcl.emp_backend.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CustomerMapper {
    /**
     * customer 全部查询
     * @return List<Customer>
     * @throws RuntimeException
     */
    public List<Customer> findAll() throws RuntimeException;

    /**
     * customer 条件查询如果有时间问题在service层完成时间转换
     * @param params
     * @return List<Customer>
     * @throws RuntimeException
     */
    public List<Customer> searchByCondition(Customer params) throws  RuntimeException;

    /**
     * customer 新增用户
     * @param customer
     * @throws RuntimeException
     */
    public void  addCustomer(Customer customer) throws RuntimeException;

    /**
     * customer 根据id删除用户
     * @param id
     * @throws RuntimeException
     */
    public void deleteCustomer(Integer id) throws  RuntimeException;

    /**
     * customer 根据多个id删除用户
     * @param ids
     * @throws RuntimeException
     */
    public void deleteByIds(List<Integer> ids) throws RuntimeException;

    /**
     * customer 根据id修改用户
     * @param customer
     * @throws RuntimeException
     */
    public void updateCustomer(Customer customer)  throws RuntimeException;

    /**
     * customer 分页查询
     * @return List<Customer>
     * @throws RuntimeException
     */
    public List<Customer> selectByPage() throws  RuntimeException;
}
