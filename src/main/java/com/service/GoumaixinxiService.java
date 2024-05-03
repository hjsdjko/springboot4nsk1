package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GoumaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GoumaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GoumaixinxiView;


/**
 * 购买信息
 *
 * @author 
 * @email 
 * @date 2022-04-19 16:11:38
 */
public interface GoumaixinxiService extends IService<GoumaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GoumaixinxiVO> selectListVO(Wrapper<GoumaixinxiEntity> wrapper);
   	
   	GoumaixinxiVO selectVO(@Param("ew") Wrapper<GoumaixinxiEntity> wrapper);
   	
   	List<GoumaixinxiView> selectListView(Wrapper<GoumaixinxiEntity> wrapper);
   	
   	GoumaixinxiView selectView(@Param("ew") Wrapper<GoumaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GoumaixinxiEntity> wrapper);
   	

}

