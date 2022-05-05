package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.YuanxijxjfzrEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 辅导员
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yuanxijxjfzr")
public class YuanxijxjfzrView extends YuanxijxjfzrEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public YuanxijxjfzrView() {
    }

    public YuanxijxjfzrView(YuanxijxjfzrEntity yuanxijxjfzrEntity) {
        try {
            BeanUtils.copyProperties(this, yuanxijxjfzrEntity);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
