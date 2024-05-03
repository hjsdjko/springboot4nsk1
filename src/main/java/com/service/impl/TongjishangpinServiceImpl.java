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


import com.dao.TongjishangpinDao;
import com.entity.TongjishangpinEntity;
import com.service.TongjishangpinService;
import com.entity.vo.TongjishangpinVO;
import com.entity.view.TongjishangpinView;

@Service("tongjishangpinService")
public class TongjishangpinServiceImpl extends ServiceImpl<TongjishangpinDao, TongjishangpinEntity> implements TongjishangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TongjishangpinEntity> page = this.selectPage(
                new Query<TongjishangpinEntity>(params).getPage(),
                new EntityWrapper<TongjishangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TongjishangpinEntity> wrapper) {
		  Page<TongjishangpinView> page =new Query<TongjishangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TongjishangpinVO> selectListVO(Wrapper<TongjishangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TongjishangpinVO selectVO(Wrapper<TongjishangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TongjishangpinView> selectListView(Wrapper<TongjishangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TongjishangpinView selectView(Wrapper<TongjishangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<TongjishangpinEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<TongjishangpinEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<TongjishangpinEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
