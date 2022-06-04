package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.XueshenglunwenEntity;
import com.entity.view.XueshenglunwenView;
import com.entity.vo.XueshenglunwenVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 学生成绩
 *
 * @author
 * @email
 * @date 2021-01-28 10:57:06
 */
public interface XueshenglunwenDao extends BaseMapper<XueshenglunwenEntity> {

    List<XueshenglunwenVO> selectListVO(@Param("ew") Wrapper<XueshenglunwenEntity> wrapper);

    XueshenglunwenVO selectVO(@Param("ew") Wrapper<XueshenglunwenEntity> wrapper);

    List<XueshenglunwenView> selectListView(@Param("ew") Wrapper<XueshenglunwenEntity> wrapper);

    List<XueshenglunwenView> selectListView(Pagination page, @Param("ew") Wrapper<XueshenglunwenEntity> wrapper);

    XueshenglunwenView selectView(@Param("ew") Wrapper<XueshenglunwenEntity> wrapper);

}
