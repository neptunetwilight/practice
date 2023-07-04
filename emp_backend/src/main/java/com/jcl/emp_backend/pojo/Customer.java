package com.jcl.emp_backend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data       //生成getter setter toString
@NoArgsConstructor  //无参构造
@AllArgsConstructor //有参构造
public class Customer {

    private int id;

    private String name;

    private String zip;

    private String address;

    private String tel_no;

    private String email;

    private int partener;

    private String representative;

    private String station;

    private int delete_flag;

    private Timestamp insert_date;

    private Timestamp update_date;
}
