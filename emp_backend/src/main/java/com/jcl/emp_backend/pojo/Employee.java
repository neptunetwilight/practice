package com.jcl.emp_backend.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data       //生成getter setter toString
@NoArgsConstructor  //无参构造
@AllArgsConstructor //有参构造
public class Employee {

    private String emp_id;

    private int department_id;

    private String first_name;

    private String last_name;

    private String first_name_kana;

    private String last_name_kana;

    private String sex;

    private Date birthday;

    private String zip;

    private String address1;

    private String address2;

    private String email;

    private String residence_no;

    private String tel;

    private Date entry_date;

    private Date quit_date;

    private String start_work_date;

    private int japanese_level;

    private int emp_type;

    private int salary;

    private int price;

    private int Transport_cost;

    private int status;

    private String station;

    private int position;

    private String sales_id;

    private Date project_end_plan_date;

    private int no_project_benefit;

    private int delete_flag;
}
