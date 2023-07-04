package com.jcl.emp_backend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data       //生成getter setter toString
@NoArgsConstructor  //无参构造
@AllArgsConstructor //有参构造
public class Seisan {

    private int id;

    private int seisan_time;

    private String emp_id;

    private String ym;

}
