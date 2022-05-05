package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 奖学金申请
 * 数据库通用操作实体类（普通增删改查）
 *
 * @author
 * @email
 * @date 2021-01-28 10:57:06
 */
@TableName("jiangxuejinshenqing")
public class JiangxuejinshenqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


    public JiangxuejinshenqingEntity() {

    }

    public JiangxuejinshenqingEntity(T t) {
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
     * 奖学金名称
     */

    private String jiangxuejinmingcheng;

    /**
     * 奖学金类型
     */

    private String jiangxuejinleixing;

    /**
     * 奖金
     */

    private String jiangjin;

    /**
     * 学生账号
     */

    private String xueshengzhanghao;

    /**
     * 学生姓名
     */

    private String xueshengxingming;

    /**
     * 班级
     */

    private String banji;

    /**
     * 年级
     */

    private String nianji;

    /**
     * 性别
     */

    private String xingbie;

    /**
     * 家庭地址
     */

    private String jiatingdizhi;

    /**
     * 家庭成员人数
     */

    private Integer jiatingchengyuanrenshu;

    /**
     * 年收入
     */

    private String nianshouru;

    /**
     * 申请表
     */

    private String shenqingbiao;

    /**
     * 申请时间
     */

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date shenqingshijian;

    /**
     * 具体家庭情况
     */

    private String jutijiatingqingkuang;

    /**
     * 是否审核
     */

    private String sfsh;

    /**
     * 审核回复
     */

    private String shhf;


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
     * 设置：奖学金名称
     */
    public void setJiangxuejinmingcheng(String jiangxuejinmingcheng) {
        this.jiangxuejinmingcheng = jiangxuejinmingcheng;
    }

    /**
     * 获取：奖学金名称
     */
    public String getJiangxuejinmingcheng() {
        return jiangxuejinmingcheng;
    }

    /**
     * 设置：奖学金类型
     */
    public void setJiangxuejinleixing(String jiangxuejinleixing) {
        this.jiangxuejinleixing = jiangxuejinleixing;
    }

    /**
     * 获取：奖学金类型
     */
    public String getJiangxuejinleixing() {
        return jiangxuejinleixing;
    }

    /**
     * 设置：奖金
     */
    public void setJiangjin(String jiangjin) {
        this.jiangjin = jiangjin;
    }

    /**
     * 获取：奖金
     */
    public String getJiangjin() {
        return jiangjin;
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
     * 设置：班级
     */
    public void setBanji(String banji) {
        this.banji = banji;
    }

    /**
     * 获取：班级
     */
    public String getBanji() {
        return banji;
    }

    /**
     * 设置：年级
     */
    public void setNianji(String nianji) {
        this.nianji = nianji;
    }

    /**
     * 获取：年级
     */
    public String getNianji() {
        return nianji;
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
     * 设置：家庭地址
     */
    public void setJiatingdizhi(String jiatingdizhi) {
        this.jiatingdizhi = jiatingdizhi;
    }

    /**
     * 获取：家庭地址
     */
    public String getJiatingdizhi() {
        return jiatingdizhi;
    }

    /**
     * 设置：家庭成员人数
     */
    public void setJiatingchengyuanrenshu(Integer jiatingchengyuanrenshu) {
        this.jiatingchengyuanrenshu = jiatingchengyuanrenshu;
    }

    /**
     * 获取：家庭成员人数
     */
    public Integer getJiatingchengyuanrenshu() {
        return jiatingchengyuanrenshu;
    }

    /**
     * 设置：年收入
     */
    public void setNianshouru(String nianshouru) {
        this.nianshouru = nianshouru;
    }

    /**
     * 获取：年收入
     */
    public String getNianshouru() {
        return nianshouru;
    }

    /**
     * 设置：申请表
     */
    public void setShenqingbiao(String shenqingbiao) {
        this.shenqingbiao = shenqingbiao;
    }

    /**
     * 获取：申请表
     */
    public String getShenqingbiao() {
        return shenqingbiao;
    }

    /**
     * 设置：申请时间
     */
    public void setShenqingshijian(Date shenqingshijian) {
        this.shenqingshijian = shenqingshijian;
    }

    /**
     * 获取：申请时间
     */
    public Date getShenqingshijian() {
        return shenqingshijian;
    }

    /**
     * 设置：具体家庭情况
     */
    public void setJutijiatingqingkuang(String jutijiatingqingkuang) {
        this.jutijiatingqingkuang = jutijiatingqingkuang;
    }

    /**
     * 获取：具体家庭情况
     */
    public String getJutijiatingqingkuang() {
        return jutijiatingqingkuang;
    }

    /**
     * 设置：是否审核
     */
    public void setSfsh(String sfsh) {
        this.sfsh = sfsh;
    }

    /**
     * 获取：是否审核
     */
    public String getSfsh() {
        return sfsh;
    }

    /**
     * 设置：审核回复
     */
    public void setShhf(String shhf) {
        this.shhf = shhf;
    }

    /**
     * 获取：审核回复
     */
    public String getShhf() {
        return shhf;
    }

}
