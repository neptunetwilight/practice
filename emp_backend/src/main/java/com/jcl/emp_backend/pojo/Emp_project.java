package com.jcl.emp_backend.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data       //生成getter setter toString
@NoArgsConstructor  //无参构造
@AllArgsConstructor //有参构造
public class Emp_project {

    private String emp_id;

    private int project_id;

    private int current_flag;

    private int salary;

    private int price;
}
