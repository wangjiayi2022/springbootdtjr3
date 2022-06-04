package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.XueshenglunwenEntity;
import com.entity.view.XueshenglunwenView;
import com.entity.vo.XueshenglunwenVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 学生成绩
 *
 * @author
 * @email
 * @date 2021-01-28 10:57:06
 */
public interface XueshenglunwenService extends IService<XueshenglunwenEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<XueshenglunwenVO> selectListVO(Wrapper<XueshenglunwenEntity> wrapper);

    XueshenglunwenVO selectVO(@Param("ew") Wrapper<XueshenglunwenEntity> wrapper);

    List<XueshenglunwenView> selectListView(Wrapper<XueshenglunwenEntity> wrapper);

    XueshenglunwenView selectView(@Param("ew") Wrapper<XueshenglunwenEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params, Wrapper<XueshenglunwenEntity> wrapper);

}

