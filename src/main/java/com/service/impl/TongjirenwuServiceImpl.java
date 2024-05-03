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


import com.dao.TongjirenwuDao;
import com.entity.TongjirenwuEntity;
import com.service.TongjirenwuService;
import com.entity.vo.TongjirenwuVO;
import com.entity.view.TongjirenwuView;

@Service("tongjirenwuService")
public class TongjirenwuServiceImpl extends ServiceImpl<TongjirenwuDao, TongjirenwuEntity> implements TongjirenwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TongjirenwuEntity> page = this.selectPage(
                new Query<TongjirenwuEntity>(params).getPage(),
                new EntityWrapper<TongjirenwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TongjirenwuEntity> wrapper) {
		  Page<TongjirenwuView> page =new Query<TongjirenwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TongjirenwuVO> selectListVO(Wrapper<TongjirenwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TongjirenwuVO selectVO(Wrapper<TongjirenwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TongjirenwuView> selectListView(Wrapper<TongjirenwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TongjirenwuView selectView(Wrapper<TongjirenwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<TongjirenwuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<TongjirenwuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<TongjirenwuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
