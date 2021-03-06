package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.XuexiaojxjfzrEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 辅导员
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xuexiaojxjfzr")
public class XuexiaojxjfzrView extends XuexiaojxjfzrEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public XuexiaojxjfzrView() {
    }

    public XuexiaojxjfzrView(XuexiaojxjfzrEntity xuexiaojxjfzrEntity) {
        try {
            BeanUtils.copyProperties(this, xuexiaojxjfzrEntity);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
