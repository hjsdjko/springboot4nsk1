package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiedanrenwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiedanrenwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiedanrenwuView;


/**
 * 接单任务
 *
 * @author 
 * @email 
 * @date 2022-04-19 16:11:37
 */
public interface JiedanrenwuService extends IService<JiedanrenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiedanrenwuVO> selectListVO(Wrapper<JiedanrenwuEntity> wrapper);
   	
   	JiedanrenwuVO selectVO(@Param("ew") Wrapper<JiedanrenwuEntity> wrapper);
   	
   	List<JiedanrenwuView> selectListView(Wrapper<JiedanrenwuEntity> wrapper);
   	
   	JiedanrenwuView selectView(@Param("ew") Wrapper<JiedanrenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiedanrenwuEntity> wrapper);
   	

}

