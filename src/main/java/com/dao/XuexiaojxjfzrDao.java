package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.XuexiaojxjfzrEntity;
import com.entity.view.XuexiaojxjfzrView;
import com.entity.vo.XuexiaojxjfzrVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 辅导员
 */
public interface XuexiaojxjfzrDao extends BaseMapper<XuexiaojxjfzrEntity> {

    List<XuexiaojxjfzrVO> selectListVO(@Param("ew") Wrapper<XuexiaojxjfzrEntity> wrapper);

    XuexiaojxjfzrVO selectVO(@Param("ew") Wrapper<XuexiaojxjfzrEntity> wrapper);

    List<XuexiaojxjfzrView> selectListView(@Param("ew") Wrapper<XuexiaojxjfzrEntity> wrapper);

    List<XuexiaojxjfzrView> selectListView(Pagination page, @Param("ew") Wrapper<XuexiaojxjfzrEntity> wrapper);

    XuexiaojxjfzrView selectView(@Param("ew") Wrapper<XuexiaojxjfzrEntity> wrapper);

}
