package com.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.XuexiaojxjfzrDao;
import com.entity.XuexiaojxjfzrEntity;
import com.entity.view.XuexiaojxjfzrView;
import com.entity.vo.XuexiaojxjfzrVO;
import com.service.XuexiaojxjfzrService;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("xuexiaojxjfzrService")
public class XuexiaojxjfzrServiceImpl extends ServiceImpl<XuexiaojxjfzrDao, XuexiaojxjfzrEntity> implements XuexiaojxjfzrService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexiaojxjfzrEntity> page = this.selectPage(
                new Query<XuexiaojxjfzrEntity>(params).getPage(),
                new EntityWrapper<XuexiaojxjfzrEntity>()
        );
        return new PageUtils(page);
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexiaojxjfzrEntity> wrapper) {
        Page<XuexiaojxjfzrView> page = new Query<XuexiaojxjfzrView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page, wrapper));
        PageUtils pageUtil = new PageUtils(page);
        return pageUtil;
    }

    @Override
    public List<XuexiaojxjfzrVO> selectListVO(Wrapper<XuexiaojxjfzrEntity> wrapper) {
        return baseMapper.selectListVO(wrapper);
    }

    @Override
    public XuexiaojxjfzrVO selectVO(Wrapper<XuexiaojxjfzrEntity> wrapper) {
        return baseMapper.selectVO(wrapper);
    }

    @Override
    public List<XuexiaojxjfzrView> selectListView(Wrapper<XuexiaojxjfzrEntity> wrapper) {
        return baseMapper.selectListView(wrapper);
    }

    @Override
    public XuexiaojxjfzrView selectView(Wrapper<XuexiaojxjfzrEntity> wrapper) {
        return baseMapper.selectView(wrapper);
    }

}
