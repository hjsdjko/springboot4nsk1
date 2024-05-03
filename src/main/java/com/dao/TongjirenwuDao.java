package com.dao;

import com.entity.TongjirenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TongjirenwuVO;
import com.entity.view.TongjirenwuView;


/**
 * 统计任务
 * 
 * @author 
 * @email 
 * @date 2022-04-19 16:11:38
 */
public interface TongjirenwuDao extends BaseMapper<TongjirenwuEntity> {
	
	List<TongjirenwuVO> selectListVO(@Param("ew") Wrapper<TongjirenwuEntity> wrapper);
	
	TongjirenwuVO selectVO(@Param("ew") Wrapper<TongjirenwuEntity> wrapper);
	
	List<TongjirenwuView> selectListView(@Param("ew") Wrapper<TongjirenwuEntity> wrapper);

	List<TongjirenwuView> selectListView(Pagination page,@Param("ew") Wrapper<TongjirenwuEntity> wrapper);
	
	TongjirenwuView selectView(@Param("ew") Wrapper<TongjirenwuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TongjirenwuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TongjirenwuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TongjirenwuEntity> wrapper);
}
