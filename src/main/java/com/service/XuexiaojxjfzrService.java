package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.XuexiaojxjfzrEntity;
import com.entity.view.XuexiaojxjfzrView;
import com.entity.vo.XuexiaojxjfzrVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 辅导员
 */
public interface XuexiaojxjfzrService extends IService<XuexiaojxjfzrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<XuexiaojxjfzrVO> selectListVO(Wrapper<XuexiaojxjfzrEntity> wrapper);

    XuexiaojxjfzrVO selectVO(@Param("ew") Wrapper<XuexiaojxjfzrEntity> wrapper);

    List<XuexiaojxjfzrView> selectListView(Wrapper<XuexiaojxjfzrEntity> wrapper);

    XuexiaojxjfzrView selectView(@Param("ew") Wrapper<XuexiaojxjfzrEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params, Wrapper<XuexiaojxjfzrEntity> wrapper);

}

