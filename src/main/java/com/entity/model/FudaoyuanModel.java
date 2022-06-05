package com.entity.model;

import com.entity.FudaoyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 辅导员
 * 接收传参的实体类
 * （实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FudaoyuanModel implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 辅导员姓名
     */

    private String instructor_name;

    /**
     * 密码
     */

    private String mima;

    /**
     * 性别
     */

    private String xingbie;

    /**
     * 联系电话
     */

    private String phone;

    /**
     * 教师邮箱
     */

    private String email;


    /**
     * 设置：辅导员姓名
     */

    public void setFudaoyuanxingming(String instructor_name) {
        this.instructor_name = instructor_name;
    }

    /**
     * 获取：辅导员姓名
     */
    public String getFudaoyuanxingming() {
        return instructor_name;
    }


    /**
     * 设置：密码
     */

    public void setMima(String mima) {
        this.mima = mima;
    }

    /**
     * 获取：密码
     */
    public String getMima() {
        return mima;
    }


    /**
     * 设置：性别
     */

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }

    /**
     * 获取：性别
     */
    public String getXingbie() {
        return xingbie;
    }


    /**
     * 设置：联系电话
     */

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取：联系电话
     */
    public String getPhone() {
        return phone;
    }


    /**
     * 设置：教师邮箱
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取：教师邮箱
     */
    public String getEmail() {
        return email;
    }

}
