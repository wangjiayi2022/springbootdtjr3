package com.entity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * 学生成绩
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 *
 * @author
 * @email
 * @date 2021-01-28 10:57:06
 */
public class XueshenglunwenVO implements Serializable {
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
