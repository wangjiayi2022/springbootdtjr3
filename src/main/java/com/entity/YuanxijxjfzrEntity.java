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
 * 院系奖学金负责人
 * 数据库通用操作实体类（普通增删改查）
 */
@TableName("yuanxijxjfzr")
public class YuanxijxjfzrEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuanxijxjfzrEntity() {

	}

	public YuanxijxjfzrEntity(T t) {
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
	 * 辅导员工号
	 */
					
	private String yuanxijxjfzrgonghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
	 * 设置：辅导员工号
	 */
	public void setYuanxijxjfzrgonghao(String yuanxijxjfzrgonghao) {
		this.yuanxijxjfzrgonghao = yuanxijxjfzrgonghao;
	}
	/**
	 * 获取：辅导员工号
	 */
	public String getYuanxijxjfzrgonghao() {
		return yuanxijxjfzrgonghao;
	}
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
