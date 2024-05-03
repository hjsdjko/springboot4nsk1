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


import com.dao.ZhiyuanhuodongDao;
import com.entity.ZhiyuanhuodongEntity;
import com.service.ZhiyuanhuodongService;
import com.entity.vo.ZhiyuanhuodongVO;
import com.entity.view.ZhiyuanhuodongView;

@Service("zhiyuanhuodongService")
public class ZhiyuanhuodongServiceImpl extends ServiceImpl<ZhiyuanhuodongDao, ZhiyuanhuodongEntity> implements ZhiyuanhuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiyuanhuodongEntity> page = this.selectPage(
                new Query<ZhiyuanhuodongEntity>(params).getPage(),
                new EntityWrapper<ZhiyuanhuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiyuanhuodongEntity> wrapper) {
		  Page<ZhiyuanhuodongView> page =new Query<ZhiyuanhuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiyuanhuodongVO> selectListVO(Wrapper<ZhiyuanhuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiyuanhuodongVO selectVO(Wrapper<ZhiyuanhuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiyuanhuodongView> selectListView(Wrapper<ZhiyuanhuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiyuanhuodongView selectView(Wrapper<ZhiyuanhuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
