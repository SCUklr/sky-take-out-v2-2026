package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "员工登录时传递的数据模型") // DTO/Entity 类上 描述模型（对象）的整体信息
public class EmployeeLoginDTO implements Serializable {

    @ApiModelProperty("用户名") // DTO 字段上描述字段含义、是否必填、示例值、隐藏字段等
    private String username;

    @ApiModelProperty("密码")
    private String password;

}
