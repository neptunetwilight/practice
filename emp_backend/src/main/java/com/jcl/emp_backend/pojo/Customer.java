package com.jcl.emp_backend.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

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

    /**
     * @JsonFormat 将数据库中时间转换成想要的json格式
     * @DateTimeFormat 将一个日期字符串转化为对应的Date类型，主要处理前端时间类型与后端pojo对象中的成员变量进行数据绑定
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    private Timestamp insert_date;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    private Timestamp update_date;
}
