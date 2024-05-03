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


import com.dao.JiedanrenwuDao;
import com.entity.JiedanrenwuEntity;
import com.service.JiedanrenwuService;
import com.entity.vo.JiedanrenwuVO;
import com.entity.view.JiedanrenwuView;

@Service("jiedanrenwuService")
public class JiedanrenwuServiceImpl extends ServiceImpl<JiedanrenwuDao, JiedanrenwuEntity> implements JiedanrenwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiedanrenwuEntity> page = this.selectPage(
                new Query<JiedanrenwuEntity>(params).getPage(),
                new EntityWrapper<JiedanrenwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiedanrenwuEntity> wrapper) {
		  Page<JiedanrenwuView> page =new Query<JiedanrenwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiedanrenwuVO> selectListVO(Wrapper<JiedanrenwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiedanrenwuVO selectVO(Wrapper<JiedanrenwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiedanrenwuView> selectListView(Wrapper<JiedanrenwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiedanrenwuView selectView(Wrapper<JiedanrenwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
