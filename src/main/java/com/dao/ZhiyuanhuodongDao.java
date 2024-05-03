package com.dao;

import com.entity.ZhiyuanhuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiyuanhuodongVO;
import com.entity.view.ZhiyuanhuodongView;


/**
 * 志愿活动
 * 
 * @author 
 * @email 
 * @date 2022-04-19 16:11:38
 */
public interface ZhiyuanhuodongDao extends BaseMapper<ZhiyuanhuodongEntity> {
	
	List<ZhiyuanhuodongVO> selectListVO(@Param("ew") Wrapper<ZhiyuanhuodongEntity> wrapper);
	
	ZhiyuanhuodongVO selectVO(@Param("ew") Wrapper<ZhiyuanhuodongEntity> wrapper);
	
	List<ZhiyuanhuodongView> selectListView(@Param("ew") Wrapper<ZhiyuanhuodongEntity> wrapper);

	List<ZhiyuanhuodongView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiyuanhuodongEntity> wrapper);
	
	ZhiyuanhuodongView selectView(@Param("ew") Wrapper<ZhiyuanhuodongEntity> wrapper);
	

}
