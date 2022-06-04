package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.XueshenglunwenEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 学生成绩
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 *
 * @author
 * @email
 * @date 2021-01-28 10:57:06
 */
@TableName("xueshenglunwen")
public class XueshenglunwenView extends XueshenglunwenEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public XueshenglunwenView() {
    }

    public XueshenglunwenView(XueshenglunwenEntity xueshenglunwenEntity) {
        try {
            BeanUtils.copyProperties(this, xueshenglunwenEntity);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
