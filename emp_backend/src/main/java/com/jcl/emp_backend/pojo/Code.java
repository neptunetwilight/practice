package com.jcl.emp_backend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data       //生成getter setter toString
@NoArgsConstructor  //无参构造
@AllArgsConstructor //有参构造
public class Code {

    private int id;

    private int code_id;

    private String name;

    private Date start_date;

    private Date end_date;

    private Timestamp insert_date;

    private Timestamp update_date;
}
