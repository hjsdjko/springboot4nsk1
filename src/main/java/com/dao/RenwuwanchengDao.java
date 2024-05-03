package com.dao;

import com.entity.RenwuwanchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenwuwanchengVO;
import com.entity.view.RenwuwanchengView;


/**
 * 任务完成
 * 
 * @author 
 * @email 
 * @date 2022-04-19 16:11:37
 */
public interface RenwuwanchengDao extends BaseMapper<RenwuwanchengEntity> {
	
	List<RenwuwanchengVO> selectListVO(@Param("ew") Wrapper<RenwuwanchengEntity> wrapper);
	
	RenwuwanchengVO selectVO(@Param("ew") Wrapper<RenwuwanchengEntity> wrapper);
	
	List<RenwuwanchengView> selectListView(@Param("ew") Wrapper<RenwuwanchengEntity> wrapper);

	List<RenwuwanchengView> selectListView(Pagination page,@Param("ew") Wrapper<RenwuwanchengEntity> wrapper);
	
	RenwuwanchengView selectView(@Param("ew") Wrapper<RenwuwanchengEntity> wrapper);
	

}
