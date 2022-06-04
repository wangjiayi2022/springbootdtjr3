package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;


/**
 * 学生成绩
 * 数据库通用操作实体类（普通增删改查）
 *
 * @author
 * @email
 * @date 2021-01-28 10:57:06
 */
@TableName("xueshenglunwen")
public class XueshenglunwenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


    public XueshenglunwenEntity() {

    }

    public XueshenglunwenEntity(T t) {
        try {
            BeanUtils.copyProperties(this, t);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 主键id
     */
    @TableId
    private Long id;
    /**
     * 标题
     */

    private String biaoti;

    /**
     * 学生账号
     */

    private String xueshengzhanghao;

    /**
     * 学生姓名
     */

    private String xueshengxingming;

    /**
     * 论文名称
     */

    private String lunwenmingcheng;

    /**
     * 论文种类
     */

    private String lunwenzhonglei;

    /**
     * 登记时间
     */

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date dengjishijian;


    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date addtime;

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 设置：标题
     */
    public void setBiaoti(String biaoti) {
        this.biaoti = biaoti;
    }

    /**
     * 获取：标题
     */
    public String getBiaoti() {
        return biaoti;
    }

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
     * 设置：论文名称
     */
    public void setLunwenmingcheng(String lunwenmingcheng) {
        this.lunwenmingcheng = lunwenmingcheng;
    }

    /**
     * 获取：论文名称
     */
    public String getLunwenmingcheng() {
        return lunwenmingcheng;
    }

    /**
     * 设置：论文种类
     */
    public void setLunwenzhonglei(String lunwenzhonglei) {
        this.lunwenzhonglei = lunwenzhonglei;
    }

    /**
     * 获取：论文种类
     */
    public String getLunwenzhonglei() {
        return lunwenzhonglei;
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
