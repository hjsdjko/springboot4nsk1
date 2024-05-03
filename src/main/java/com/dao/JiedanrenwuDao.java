package com.dao;

import com.entity.JiedanrenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiedanrenwuVO;
import com.entity.view.JiedanrenwuView;


/**
 * 接单任务
 * 
 * @author 
 * @email 
 * @date 2022-04-19 16:11:37
 */
public interface JiedanrenwuDao extends BaseMapper<JiedanrenwuEntity> {
	
	List<JiedanrenwuVO> selectListVO(@Param("ew") Wrapper<JiedanrenwuEntity> wrapper);
	
	JiedanrenwuVO selectVO(@Param("ew") Wrapper<JiedanrenwuEntity> wrapper);
	
	List<JiedanrenwuView> selectListView(@Param("ew") Wrapper<JiedanrenwuEntity> wrapper);

	List<JiedanrenwuView> selectListView(Pagination page,@Param("ew") Wrapper<JiedanrenwuEntity> wrapper);
	
	JiedanrenwuView selectView(@Param("ew") Wrapper<JiedanrenwuEntity> wrapper);
	

}
