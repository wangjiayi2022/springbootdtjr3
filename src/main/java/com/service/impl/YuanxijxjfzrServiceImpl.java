package com.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.YuanxijxjfzrDao;
import com.entity.YuanxijxjfzrEntity;
import com.entity.view.YuanxijxjfzrView;
import com.entity.vo.YuanxijxjfzrVO;
import com.service.YuanxijxjfzrService;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("yuanxijxjfzrService")
public class YuanxijxjfzrServiceImpl extends ServiceImpl<YuanxijxjfzrDao, YuanxijxjfzrEntity> implements YuanxijxjfzrService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanxijxjfzrEntity> page = this.selectPage(
                new Query<YuanxijxjfzrEntity>(params).getPage(),
                new EntityWrapper<YuanxijxjfzrEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanxijxjfzrEntity> wrapper) {
		  Page<YuanxijxjfzrView> page =new Query<YuanxijxjfzrView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanxijxjfzrVO> selectListVO(Wrapper<YuanxijxjfzrEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanxijxjfzrVO selectVO(Wrapper<YuanxijxjfzrEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanxijxjfzrView> selectListView(Wrapper<YuanxijxjfzrEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanxijxjfzrView selectView(Wrapper<YuanxijxjfzrEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
