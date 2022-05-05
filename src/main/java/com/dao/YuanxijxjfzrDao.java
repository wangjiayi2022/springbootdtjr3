package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.YuanxijxjfzrEntity;
import com.entity.view.YuanxijxjfzrView;
import com.entity.vo.YuanxijxjfzrVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 辅导员
 */
public interface YuanxijxjfzrDao extends BaseMapper<YuanxijxjfzrEntity> {

    List<YuanxijxjfzrVO> selectListVO(@Param("ew") Wrapper<YuanxijxjfzrEntity> wrapper);

    YuanxijxjfzrVO selectVO(@Param("ew") Wrapper<YuanxijxjfzrEntity> wrapper);

    List<YuanxijxjfzrView> selectListView(@Param("ew") Wrapper<YuanxijxjfzrEntity> wrapper);

    List<YuanxijxjfzrView> selectListView(Pagination page, @Param("ew") Wrapper<YuanxijxjfzrEntity> wrapper);

    YuanxijxjfzrView selectView(@Param("ew") Wrapper<YuanxijxjfzrEntity> wrapper);

}
