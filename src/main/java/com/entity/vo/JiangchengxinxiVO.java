package com.entity.vo;

import com.entity.JiangchengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 奖惩信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 *
 * @author
 * @email
 * @date 2021-01-28 10:57:06
 */
public class JiangchengxinxiVO implements Serializable {
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
     * 类型
     */

    private String leixing;

    /**
     * 具体内容
     */

    private String jutineirong;

    /**
     * 发布时间
     */

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date fabushijian;


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
     * 设置：类型
     */

    public void setLeixing(String leixing) {
        this.leixing = leixing;
    }

    /**
     * 获取：类型
     */
    public String getLeixing() {
        return leixing;
    }


    /**
     * 设置：具体内容
     */

    public void setJutineirong(String jutineirong) {
        this.jutineirong = jutineirong;
    }

    /**
     * 获取：具体内容
     */
    public String getJutineirong() {
        return jutineirong;
    }


    /**
     * 设置：发布时间
     */

    public void setFabushijian(Date fabushijian) {
        this.fabushijian = fabushijian;
    }

    /**
     * 获取：发布时间
     */
    public Date getFabushijian() {
        return fabushijian;
    }

}
