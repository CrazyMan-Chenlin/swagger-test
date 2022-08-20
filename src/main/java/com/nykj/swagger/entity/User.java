package com.nykj.swagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @description:
 * @author: chenlin
 * @date: Created in 2022.8.20 18:15
 * @version: 1.0
 * @modified By:
 */
@ApiModel(value="user", description="用户基础信息")
public class User {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @ApiModelProperty(name = "编号")
    private Long id;

    @ApiModelProperty(name = "姓名")
    private String name;

    @ApiModelProperty(name = "性别")
    private Integer sex;

    @ApiModelProperty(name = "电话号码")
    private String phone;

    @ApiModelProperty(name = "地址")
    private String address;

}
