package com.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.XueshenglunwenDao;
import com.entity.XueshenglunwenEntity;
import com.entity.view.XueshenglunwenView;
import com.entity.vo.XueshenglunwenVO;
import com.service.XueshenglunwenService;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("xueshenglunwenService")
public class XueshenglunwenServiceImpl extends ServiceImpl<XueshenglunwenDao, XueshenglunwenEntity> implements XueshenglunwenService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshenglunwenEntity> page = this.selectPage(
                new Query<XueshenglunwenEntity>(params).getPage(),
                new EntityWrapper<XueshenglunwenEntity>()
        );
        return new PageUtils(page);
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshenglunwenEntity> wrapper) {
        Page<XueshenglunwenView> page = new Query<XueshenglunwenView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page, wrapper));
        PageUtils pageUtil = new PageUtils(page);
        return pageUtil;
    }

    @Override
    public List<XueshenglunwenVO> selectListVO(Wrapper<XueshenglunwenEntity> wrapper) {
        return baseMapper.selectListVO(wrapper);
    }

    @Override
    public XueshenglunwenVO selectVO(Wrapper<XueshenglunwenEntity> wrapper) {
        return baseMapper.selectVO(wrapper);
    }

    @Override
    public List<XueshenglunwenView> selectListView(Wrapper<XueshenglunwenEntity> wrapper) {
        return baseMapper.selectListView(wrapper);
    }

    @Override
    public XueshenglunwenView selectView(Wrapper<XueshenglunwenEntity> wrapper) {
        return baseMapper.selectView(wrapper);
    }

}
