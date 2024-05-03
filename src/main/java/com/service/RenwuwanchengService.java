package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenwuwanchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenwuwanchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenwuwanchengView;


/**
 * 任务完成
 *
 * @author 
 * @email 
 * @date 2022-04-19 16:11:37
 */
public interface RenwuwanchengService extends IService<RenwuwanchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenwuwanchengVO> selectListVO(Wrapper<RenwuwanchengEntity> wrapper);
   	
   	RenwuwanchengVO selectVO(@Param("ew") Wrapper<RenwuwanchengEntity> wrapper);
   	
   	List<RenwuwanchengView> selectListView(Wrapper<RenwuwanchengEntity> wrapper);
   	
   	RenwuwanchengView selectView(@Param("ew") Wrapper<RenwuwanchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenwuwanchengEntity> wrapper);
   	

}

