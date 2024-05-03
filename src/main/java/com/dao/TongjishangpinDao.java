package com.dao;

import com.entity.TongjishangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TongjishangpinVO;
import com.entity.view.TongjishangpinView;


/**
 * 统计商品
 * 
 * @author 
 * @email 
 * @date 2022-04-19 16:11:38
 */
public interface TongjishangpinDao extends BaseMapper<TongjishangpinEntity> {
	
	List<TongjishangpinVO> selectListVO(@Param("ew") Wrapper<TongjishangpinEntity> wrapper);
	
	TongjishangpinVO selectVO(@Param("ew") Wrapper<TongjishangpinEntity> wrapper);
	
	List<TongjishangpinView> selectListView(@Param("ew") Wrapper<TongjishangpinEntity> wrapper);

	List<TongjishangpinView> selectListView(Pagination page,@Param("ew") Wrapper<TongjishangpinEntity> wrapper);
	
	TongjishangpinView selectView(@Param("ew") Wrapper<TongjishangpinEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TongjishangpinEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TongjishangpinEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TongjishangpinEntity> wrapper);
}
