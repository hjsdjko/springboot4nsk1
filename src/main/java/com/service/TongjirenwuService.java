package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TongjirenwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TongjirenwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TongjirenwuView;


/**
 * 统计任务
 *
 * @author 
 * @email 
 * @date 2022-04-19 16:11:38
 */
public interface TongjirenwuService extends IService<TongjirenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TongjirenwuVO> selectListVO(Wrapper<TongjirenwuEntity> wrapper);
   	
   	TongjirenwuVO selectVO(@Param("ew") Wrapper<TongjirenwuEntity> wrapper);
   	
   	List<TongjirenwuView> selectListView(Wrapper<TongjirenwuEntity> wrapper);
   	
   	TongjirenwuView selectView(@Param("ew") Wrapper<TongjirenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TongjirenwuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<TongjirenwuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<TongjirenwuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<TongjirenwuEntity> wrapper);
}

