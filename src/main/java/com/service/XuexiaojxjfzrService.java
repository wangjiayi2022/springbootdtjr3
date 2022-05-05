package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.YuanxijxjfzrEntity;
import com.entity.view.YuanxijxjfzrView;
import com.entity.vo.YuanxijxjfzrVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 辅导员
 */
public interface XuexiaojxjfzrService extends IService<YuanxijxjfzrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<YuanxijxjfzrVO> selectListVO(Wrapper<YuanxijxjfzrEntity> wrapper);

    YuanxijxjfzrVO selectVO(@Param("ew") Wrapper<YuanxijxjfzrEntity> wrapper);

    List<YuanxijxjfzrView> selectListView(Wrapper<YuanxijxjfzrEntity> wrapper);

    YuanxijxjfzrView selectView(@Param("ew") Wrapper<YuanxijxjfzrEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params, Wrapper<YuanxijxjfzrEntity> wrapper);

}

