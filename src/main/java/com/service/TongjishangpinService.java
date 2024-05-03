package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TongjishangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TongjishangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TongjishangpinView;


/**
 * 统计商品
 *
 * @author 
 * @email 
 * @date 2022-04-19 16:11:38
 */
public interface TongjishangpinService extends IService<TongjishangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TongjishangpinVO> selectListVO(Wrapper<TongjishangpinEntity> wrapper);
   	
   	TongjishangpinVO selectVO(@Param("ew") Wrapper<TongjishangpinEntity> wrapper);
   	
   	List<TongjishangpinView> selectListView(Wrapper<TongjishangpinEntity> wrapper);
   	
   	TongjishangpinView selectView(@Param("ew") Wrapper<TongjishangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TongjishangpinEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<TongjishangpinEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<TongjishangpinEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<TongjishangpinEntity> wrapper);
}

