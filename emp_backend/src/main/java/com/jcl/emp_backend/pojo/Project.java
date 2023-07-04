package com.jcl.emp_backend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data       //生成getter setter toString
@NoArgsConstructor  //无参构造
@AllArgsConstructor //有参构造
public class Project {

    private int id;

    private String name;

    private Date start_date;

    private Date end_date;

    private String station;

    private int status;

    private int customer_id;

    private int seisan;

    private int min_time;

    private int max_time;

    private Timestamp insert_date;

    private Timestamp update_date;

    private int delete_flag;

}
