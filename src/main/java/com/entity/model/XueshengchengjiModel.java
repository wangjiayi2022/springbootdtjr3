package com.entity.model;

import com.entity.XueshengchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 学生成绩
 * 接收传参的实体类
 * （实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 *
 * @author
 * @email
 * @date 2021-01-28 10:57:06
 */
public class XueshengchengjiModel implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 学生账号
     */

    private String xueshengzhanghao;

    /**
     * 学生姓名
     */

    private String xueshengxingming;

    /**
     * 学生成绩
     */

    private String xueshengchengji;

    /**
     * 评语
     */

    private String pingyu;

    /**
     * 登记时间
     */

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date dengjishijian;


    /**
     * 设置：学生账号
     */

    public void setXueshengzhanghao(String xueshengzhanghao) {
        this.xueshengzhanghao = xueshengzhanghao;
    }

    /**
     * 获取：学生账号
     */
    public String getXueshengzhanghao() {
        return xueshengzhanghao;
    }


    /**
     * 设置：学生姓名
     */

    public void setXueshengxingming(String xueshengxingming) {
        this.xueshengxingming = xueshengxingming;
    }

    /**
     * 获取：学生姓名
     */
    public String getXueshengxingming() {
        return xueshengxingming;
    }


    /**
     * 设置：学生成绩
     */

    public void setXueshengchengji(String xueshengchengji) {
        this.xueshengchengji = xueshengchengji;
    }

    /**
     * 获取：学生成绩
     */
    public String getXueshengchengji() {
        return xueshengchengji;
    }


    /**
     * 设置：评语
     */

    public void setPingyu(String pingyu) {
        this.pingyu = pingyu;
    }

    /**
     * 获取：评语
     */
    public String getPingyu() {
        return pingyu;
    }


    /**
     * 设置：登记时间
     */

    public void setDengjishijian(Date dengjishijian) {
        this.dengjishijian = dengjishijian;
    }

    /**
     * 获取：登记时间
     */
    public Date getDengjishijian() {
        return dengjishijian;
    }

}
