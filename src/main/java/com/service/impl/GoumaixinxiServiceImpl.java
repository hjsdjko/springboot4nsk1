package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GoumaixinxiDao;
import com.entity.GoumaixinxiEntity;
import com.service.GoumaixinxiService;
import com.entity.vo.GoumaixinxiVO;
import com.entity.view.GoumaixinxiView;

@Service("goumaixinxiService")
public class GoumaixinxiServiceImpl extends ServiceImpl<GoumaixinxiDao, GoumaixinxiEntity> implements GoumaixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GoumaixinxiEntity> page = this.selectPage(
                new Query<GoumaixinxiEntity>(params).getPage(),
                new EntityWrapper<GoumaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GoumaixinxiEntity> wrapper) {
		  Page<GoumaixinxiView> page =new Query<GoumaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GoumaixinxiVO> selectListVO(Wrapper<GoumaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GoumaixinxiVO selectVO(Wrapper<GoumaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GoumaixinxiView> selectListView(Wrapper<GoumaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GoumaixinxiView selectView(Wrapper<GoumaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
