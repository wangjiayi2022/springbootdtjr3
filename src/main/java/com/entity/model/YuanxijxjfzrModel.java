package com.entity.model;

import java.io.Serializable;


/**
 * 辅导员
 * 接收传参的实体类
 * （实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YuanxijxjfzrModel implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 辅导员姓名
     */

    private String yuanxijxjfzrxingming;

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

    private String lianxidianhua;

    /**
     * 教师邮箱
     */

    private String jiaoshiyouxiang;


    /**
     * 设置：辅导员姓名
     */

    public void setYuanxijxjfzrxingming(String yuanxijxjfzrxingming) {
        this.yuanxijxjfzrxingming = yuanxijxjfzrxingming;
    }

    /**
     * 获取：辅导员姓名
     */
    public String getYuanxijxjfzrxingming() {
        return yuanxijxjfzrxingming;
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

    public void setLianxidianhua(String lianxidianhua) {
        this.lianxidianhua = lianxidianhua;
    }

    /**
     * 获取：联系电话
     */
    public String getLianxidianhua() {
        return lianxidianhua;
    }


    /**
     * 设置：教师邮箱
     */

    public void setJiaoshiyouxiang(String jiaoshiyouxiang) {
        this.jiaoshiyouxiang = jiaoshiyouxiang;
    }

    /**
     * 获取：教师邮箱
     */
    public String getJiaoshiyouxiang() {
        return jiaoshiyouxiang;
    }

}
