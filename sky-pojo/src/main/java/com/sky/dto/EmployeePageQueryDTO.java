package com.sky.dto;

import lombok.Data;

import java.io.Serializable;
// 这是分页的DTO 根据请求参数进行封装
@Data
public class EmployeePageQueryDTO implements Serializable {

    //员工姓名
    private String name;

    //页码
    private int page;

    //每页显示记录数
    private int pageSize;

}
